package org.eclipse.config;

import java.sql.*;

public class MyConnection {
	private static String url = "jdbc:mysql://localhost:3306/jdbc";
	private static String utilisateur = "root";
	private static String motDePasse = "root";
	private static Connection connexion = null;
	private MyConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connexion = DriverManager.getConnection(url, utilisateur, motDePasse);
		} catch ( Exception e ) {
			e.printStackTrace();
		}
	}
	public static Connection getConnection() {
		if (connexion == null) {
			new MyConnection();
		}
		return connexion;
	}
	public static void stop() {
		if (connexion != null) {
			try {
				connexion.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
