package org.eclipse.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.config.MyConnection;
import org.eclipse.model.Personne;

public class PersonneDaoImpl implements Dao<Personne> {
	@Override
	public Personne save(Personne personne) {
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				PreparedStatement ps = c.prepareStatement("insert into personne (nom,prenom) values (?,?); ",
						PreparedStatement.RETURN_GENERATED_KEYS);
				ps.setString(1, personne.getNom());
				ps.setString(2, personne.getPrenom());
				ps.executeUpdate();
				ResultSet resultat = ps.getGeneratedKeys();
				if (resultat.next()) {
					personne.setNum(resultat.getInt(1));
					return personne;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public void remove(Personne personne) {
		Connection d = MyConnection.getConnection();
		if (d != null) {
			try {
				PreparedStatement pps = d.prepareStatement("DELETE FROM Personne where num = ?;");
				pps.setInt(1, personne.getNum());
				pps.executeUpdate();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			return;
		}
	}

	@Override
	public Personne update(Personne personne) {
		Connection e = MyConnection.getConnection();
		if (e != null) {
			try {
				PreparedStatement ppps;
				ppps = e.prepareStatement("UPDATE Personne SET nom = ?, prenom = ? WHERE num = ?;",
						PreparedStatement.RETURN_GENERATED_KEYS);
				ppps.setString(1, personne.getNom());
				ppps.setString(2, personne.getPrenom());
				ppps.setInt(3, personne.getNum());
				ppps.executeUpdate();
				ResultSet resultat2 = ppps.getGeneratedKeys();
				if (resultat2.next()) {
					personne.setNum(resultat2.getInt(1));
				}

			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			return personne;
		}
		return null;
	}

	@Override
	public Personne findById(int id) {
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				PreparedStatement ps = c.prepareStatement("select * from personne where num = ?; ");
				ps.setInt(1, id);
				ResultSet r = ps.executeQuery();
				if (r.next())
					return new Personne(r.getInt("num"), r.getString("nom"), r.getString("prenom"));
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}



	@Override
	public List<Personne> getAll() {
		Connection g = MyConnection.getConnection();
		List<Personne> personnes = null;
		if (g != null) {
			try {
				personnes = new ArrayList<Personne>();
				PreparedStatement vs = g.prepareStatement ("SELECT * FROM Personne;");
				ResultSet resultat4 = vs.executeQuery();
				while (resultat4.next()) {
					int num = resultat4.getInt("num");
					String nom = resultat4.getString("nom");
					String prenom = resultat4.getString("prenom");
					Personne personne = new Personne (num, nom, prenom);
					personnes.add(personne);
				}
			}
			catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		return personnes;

	}	
}

