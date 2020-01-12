package org.eclipse.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.InheritanceType;

//@Entity
//@NamedQueries({
//@NamedQuery(
//name="findByNomPrenom",
//query="SELECT p FROM Personne p WHERE p.nom = :nom and p.prenom = :prenom"
//),
//@NamedQuery(
//name="findByPrenom",
//query="SELECT p FROM Personne p WHERE p.prenom = :prenom"
//),
//})

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE_PERSONNE")
@DiscriminatorValue(value="PERS")
public class Personne {

	//	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	@Id
	private int num;
	private String nom;
	private String prenom;

	@OneToMany(cascade={CascadeType.PERSIST, CascadeType.REMOVE}, fetch = FetchType.EAGER)
	private List <Adresse> adresses = new ArrayList <
	Adresse> ();
	//	@JoinColumn(name="rue", referencedColumnName="rue", nullable=false)
	//	private Adresse adresse;

	@ManyToMany(cascade={CascadeType.PERSIST, CascadeType.REMOVE})
	private List <Sport> sports = new ArrayList <Sport> ();

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
	public List<Adresse> getAdresses() {
		return adresses;
	}
	public void setAdresses(List<Adresse> adresses) {
		this.adresses = adresses;
	}

	public List<Sport> getSports() {
		return sports;
	}
	public void setSports(List<Sport> sports) {
		this.sports = sports;
	}

//	//méthodes déléguées
//	public boolean addSport(Sport sport) {
//		return sports.add(sport);
//	}
//	public boolean removeSport(Sport sport) {
//		return sports.remove(sport);
//	}
	public boolean addAdresse(Adresse e) {
		return adresses.add(e);
	}
	public boolean removeAdresse(Adresse o) {
		return adresses.remove(o);
	}
	
	public void addSport(Sport sport) {
		sports.add(sport);
		sport.getPersonnes().add(this);
	}
	public void removeSport(Sport sport) {
		sports.remove(sport);
		sport.getPersonnes().remove(this);
	}

	@Override
	public String toString() {
		return "Personne [num=" + num + ", nom=" + nom + ", prenom=" + prenom + ", adresses=" + adresses + ", sports="
				+ sports + "]";
	}




}
