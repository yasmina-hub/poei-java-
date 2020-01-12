package org.eclipse.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.config.MyConnection;
import org.eclipse.model.Utilisateur;

public class UtilisateurDaoImpl implements Dao<Utilisateur> {
	@Override
	public Utilisateur save(Utilisateur utilisateur) {
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				PreparedStatement ps = c.prepareStatement("insert into utilisateur (nom,prenom,sexe,type) values (?,?,?,?); ",
						PreparedStatement.RETURN_GENERATED_KEYS);
				ps.setString(1, utilisateur.getNom());
				ps.setString(2, utilisateur.getPrenom());
				ps.setString(3, utilisateur.getSexe());
				ps.setString(4, utilisateur.getType());
				ps.executeUpdate();
				ResultSet resultat = ps.getGeneratedKeys();
				if (resultat.next()) {
					utilisateur.setNum(resultat.getInt(1));
					return utilisateur;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public void remove(Utilisateur utilisateur) {
		Connection d = MyConnection.getConnection();
		if (d != null) {
			try {
				PreparedStatement pps = d.prepareStatement("DELETE FROM utilisateur where numero = ?;");
				pps.setInt(1, utilisateur.getNum());
				pps.executeUpdate();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			return;
		}
	}

	@Override
	public Utilisateur update(Utilisateur utilisateur) {
		Connection e = MyConnection.getConnection();
		if (e != null) {
			try {
				PreparedStatement ppps;
				ppps = e.prepareStatement("UPDATE utilisateur SET nom = ?, prenom = ?, sexe = ?, type = ? WHERE numero = ?;",
						PreparedStatement.RETURN_GENERATED_KEYS);
				ppps.setString(1, utilisateur.getNom());
				ppps.setString(2, utilisateur.getPrenom());
				ppps.setString(3, utilisateur.getSexe());
				ppps.setString(4, utilisateur.getType());
				ppps.setInt(5, utilisateur.getNum());
				ppps.executeUpdate();
				ResultSet resultat2 = ppps.getGeneratedKeys();
				if (resultat2.next()) {
					utilisateur.setNum(resultat2.getInt(1));
				}

			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			return utilisateur;
		}
		return null;
	}

	@Override
	public Utilisateur findById(int id) {
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				PreparedStatement ps = c.prepareStatement("select * from utilisateur where numero = ?; ");
				ps.setInt(1, id);
				ResultSet r = ps.executeQuery();
				if (r.next())
					return new Utilisateur(r.getInt("numero"), r.getString("nom"), r.getString("prenom"), r.getString("sexe"), r.getString("type"));
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}


	@Override
	public List<Utilisateur> getAll() {
		Connection g = MyConnection.getConnection();
		List<Utilisateur> utilisateurs = null;
		if (g != null) {
			try {
				utilisateurs = new ArrayList<Utilisateur>();
				PreparedStatement vs = g.prepareStatement ("SELECT * FROM utilisateur;");
				ResultSet resultat4 = vs.executeQuery();
				while (resultat4.next()) {
					int num = resultat4.getInt("num");
					String nom = resultat4.getString("nom");
					String prenom = resultat4.getString("prenom");
					String sexe = resultat4.getString("sexe");
					String type = resultat4.getString("type");
					Utilisateur utilisateur = new Utilisateur (num, nom, prenom,sexe,type);
					utilisateurs.add(utilisateur);
				}
			}
			catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		return utilisateurs;

	}	
	
	@Override
	public Utilisateur findByNomAndPrenom(String nom, String prenom) {
		Connection c = MyConnection.getConnection();
		Utilisateur utilisateur = null;
		if (c != null) {
			try {
				PreparedStatement ps = c.prepareStatement("SELECT * FROM utilisateur WHERE nom = ? AND prenom = ?;");
				ps.setString(1, nom);
				ps.setString(2, prenom);
				ResultSet result = ps.executeQuery();
				if (result.next()) {
					int num = result.getInt("numero");
					String pnom = result.getString("nom");
					String pprenom = result.getString("prenom");
					String sexe = result.getString("sexe");
					String type = result.getString("type");
					utilisateur = new Utilisateur(num, nom, prenom, sexe, type);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return utilisateur;
	}
}

