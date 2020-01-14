package org.eclipse.model;

import java.util.List;

public class Personne {
	private int id;
	private String nom;
	private Adresse adresse;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String
			nom) {
		this.nom = nom;
	}
	public Adresse getAdresse()
	{
		return adresse;
	}
	public void setAdresse(
			Adresse adresse) {
		this.adresse = adresse;
	}
	public void afficher(){
		System.out.println(id + "" + nom + " " + adresse)
		;
	}
}

//public class Personne {
//	private int id;
//	private String nom;
//	private List<String> sports;
////  private Adresse adresse;
//
//
//	public Personne(int id, String nom, List<String> sports) { //Adresse adresse ) {
//		this.id = id;
//		this.nom = nom;
//		this.sports = sports;
////		this.adresse = adresse;
//	}
//
////	public void afficher() {
////		System.out.println(id + " " + nom + " " + adresse);
////	}
//
//	public void afficher(){
//		System.out.println(id + " " + nom);
//		System.out.println("Mes sports : ");
//		sports.forEach(System.out::println);
//	}

//}
