package org.eclipse.model;

/**
 * @author Auguste
 * @version 1.0
 */

public class Personne {
	private int num;
	private String nom;
	private String prenom;
	
//constructeurs	
	public Personne() {
		super();
	}

	public Personne(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	public Personne(int num, String nom, String prenom) {
		super();
		this.num = num;
		this.nom = nom;
		this.prenom = prenom;
	}

//getteurs et setteurs
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	
	
	public String getPrenom() {
		return prenom;
	}

	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Override
	public String toString() {
		return "Personne [num=" + num + ", nom=" + nom + ", prenom=" + prenom + "]";
	}
	

	
}
