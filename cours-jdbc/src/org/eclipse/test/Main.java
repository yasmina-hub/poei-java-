package org.eclipse.test;

import java.sql.*;

import org.eclipse.dao.PersonneDaoImpl;
import org.eclipse.model.Personne;

public class Main {

	public static void main(String[] args) {
		
		PersonneDaoImpl personneDaoImpl = new PersonneDaoImpl();
		Personne personne = personneDaoImpl.findById(1);
		personne.setNom ("travolta");
		System.out.println(personneDaoImpl.update(personne));
		
		
//		PersonneDaoImpl personneDaoImpl = new PersonneDaoImpl();
//		Personne personne = new Personne("tabouri", "melissa");
//		Personne insertedPersonne = personneDaoImpl.save(personne);
//		if (insertedPersonne != null)
//			System.out.println("personne numero " + insertedPersonne.getNum() + " a ete inseré");
//		else
//			System.out.println("probleme d’insertion");

//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		String url = "jdbc:mysql://localhost:3306/jdbc?autoReconnect=true&useSSL=false";
//		String user = "root";
//		String password = "root";
//		Connection connexion = null;
//		try {
//			connexion = DriverManager.getConnection(url, user, password);
//			// creation de la requete (statement)
//			Statement statement = connexion.createStatement();
//			// Preparation de la requete
//			String request = "SELECT * FROM Personne;";
//			// Execution de la requete
//			ResultSet result = statement.executeQuery(request);
//			
//			while (result.next()) {
//				// on peut indiquer aussi l’index de la colonne et le type
//				int idPersonne = result.getInt(1);
//				String nom = result.getString(2);
//				String prenom = result.getString(3);
//				// pareil pour tous les autres attributs
//				System.out.println(nom + " " + prenom);
//				}
//			Statement statement = connexion.createStatement();
//			String request = "INSERT INTO Personne (nom,prenom) VALUES ('Wick','John');";
//			int nbr = statement.executeUpdate(request);
//			if (0!=nbr)
//			System.out.println("insertion reussie");

//			Statement statement = connexion.createStatement();
//			String request = "INSERT INTO Personne (nom,prenom) VALUES ('Wick','John');";
//			// on demande le renvoi des valeurs attribuees a la cleprimaire
//			statement.executeUpdate(request,Statement.RETURN_GENERATED_KEYS
//			);
//			// on parcourt les valeurs attribuees a l’ensemble de tuples ajoutes
//			ResultSet resultat = statement.getGeneratedKeys();
//			// on verifie s’il contient au moins une valeur
//			if (resultat.next()) {
//			System.out.println("Le numero genere pour cette personne :" + resultat.getInt(1));
//			}	

//			String request = "INSERT INTO Personne (nom,prenom)VALUES (?,?);";
//					PreparedStatement ps = connexion.prepareStatement(
//					request,PreparedStatement.RETURN_GENERATED_KEYS);
//					ps.setString(1, "vendredi");
//					ps.setString(2, "dimanche");
//					ps.executeUpdate();
//					ResultSet resultat = ps.getGeneratedKeys();
//					if (resultat.next())
//					System.out.println("Le numero genere pour cette personne : " + resultat.getInt(1));

//					Statement statement = connexion.createStatement();
//					String request = "DELETE FROM Personne WHERE num = 4";
//					statement.executeUpdate(request,Statement.RETURN_GENERATED_KEYS);

//					Statement statement = connexion.createStatement();
//					String request = "UPDATE Personne SET nom = 'tomateo' WHERE num = 5;";
//					statement.executeUpdate(request);

//					String request = "UPDATE Personne SET nom = ? WHERE num = ?;";
//					PreparedStatement ps = connexion.prepareStatement(request);
//					ps.setString(1, "tratoria");
//					ps.setInt(2, 5);
//					ps.executeUpdate();

//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		finally {
//			if (connexion != null)
//				try {
//					connexion.close();
//
//				} catch (SQLException ignore) {
//					ignore.printStackTrace();
//				
//				}
//
//		}

	}
}