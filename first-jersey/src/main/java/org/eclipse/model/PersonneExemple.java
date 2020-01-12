package org.eclipse.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


//@XmlType(propOrder={"nom", "age", "prenom"})
@XmlRootElement //(name="person")
public class PersonneExemple {
	private String nom;
	private String prenom;
	private int age;
	
	
//@XmlAttribute(name="lastName")
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
//	@XmlAttribute(name="firstName")
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String
			prenom) {
		this.prenom = prenom;
	}
	
//	@XmlValue
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
	}
	
}

