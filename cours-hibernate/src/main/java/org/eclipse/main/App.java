package org.eclipse.main;

import java.util.List;

import org.eclipse.model.Adresse;
import org.eclipse.model.Enseignant;
import org.eclipse.model.Etudiant;
import org.eclipse.model.Personne;
import org.eclipse.model.Sport;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
//    	Personne personne = new Personne();
//    	personne.setNom("abruzzi");
//    	personne.setPrenom("john");
//    	Configuration configuration = new Configuration().configure();
//    	configuration.addAnnotatedClass(Personne.class);
//    	SessionFactory sessionFactory = configuration.buildSessionFactory();
//    	Session session = sessionFactory.openSession();
//    	Transaction transaction = session.beginTransaction();
//    	session.persist(personne);
//    	transaction.commit();
//    	session.close();
//    	sessionFactory.close();
//   	//crée et enregistre une personne
    	
//    	Personne personne = new Personne();
//    	personne.setNom("wick");
//    	personne.setPrenom("john");
//    	Configuration configuration = new Configuration().configure();
//    	configuration.addAnnotatedClass(Personne.class);
//    	SessionFactory sessionFactory = configuration.buildSessionFactory();
//    	Session session = sessionFactory.openSession();
//    	Transaction transaction = session.beginTransaction();
//    	Integer cle = (Integer) session.save(personne);
//    	transaction.commit();
//    	session.close();
//    	sessionFactory.close();
//    	System.out.println(cle);
   	//crée et enregistre une personne et affiche la clé dans la console
    	
//    	Configuration configuration = new Configuration().configure();
//    	SessionFactory sessionFactory = configuration.buildSessionFactory();
//    	Session session = sessionFactory.openSession();
//    	Transaction transaction = session.beginTransaction();
//    	Personne personne1 = session.load(Personne.class, 1);
//    	System.out.println(personne1);
//    	transaction.commit();
//    	session.close();
//    	sessionFactory.close();
//    	//recherche une personne avec load

//    	Configuration configuration = new Configuration().configure();
//    	SessionFactory sessionFactory = configuration.buildSessionFactory();
//    	Session session = sessionFactory.openSession();
//    	Transaction transaction = session.beginTransaction();
//    	Personne personne1 = session.get(Personne.class, 1);
//    	System.out.println(personne1);
//    	transaction.commit();
//    	session.close();
//    	sessionFactory.close();
//    	//recherche une personne avec get
    	
//    	Configuration configuration = new Configuration().configure();
//    	SessionFactory sessionFactory = configuration.buildSessionFactory();
//    	Session session = sessionFactory.openSession();
//    	Transaction transaction = session.beginTransaction();
//    	Personne personne3 = session.get(Personne.class, 1);
//    	personne3.setNom("Abruzzi");
//    	session.flush();
//    	transaction.commit();
//    	session.close();
//    	sessionFactory.close();
//    	//envoie toutes les modifications vers la base de donnée

//    	Configuration configuration = new Configuration().configure();
//    	SessionFactory sessionFactory = configuration.buildSessionFactory();
//    	Session session = sessionFactory.openSession();
//    	Transaction transaction = session.beginTransaction();
//    	Personne personne3 = session.get(Personne.class, 1);
//    	session.delete(personne3);
//    	transaction.commit();
//    	session.close();
//    	sessionFactory.close();
//   	//supprime la personne avec l'Id 1
    	
//    	Configuration configuration = new Configuration().configure();
//    	SessionFactory sessionFactory = configuration.buildSessionFactory();
//    	Session session = sessionFactory.openSession();
//    	Transaction transaction = session.beginTransaction();
//    	Criteria criteria = session.createCriteria(Personne.class);
//    	List<Personne> personnes = (List<Personne>) criteria.list();
//    	for(Personne personne : personnes)
//    	System.out.println(personne);
//    	transaction.commit();
//    	session.close();
//    	sessionFactory.close();
//    	//affiche la liste des personnes dans la console	

//    	Configuration configuration = new Configuration().configure();
//    	SessionFactory sessionFactory = configuration.buildSessionFactory();
//    	Session session = sessionFactory.openSession();
//    	Transaction transaction = session.beginTransaction();
//    	String string = "travolta";
//    	Criteria criteria = session.createCriteria(Personne.class);
//    	criteria = criteria.add(Restrictions.eq("nom", string));
//    	List<Personne> personnes = (List<Personne>) criteria.list();
//    	for(Personne personne : personnes)
//    	System.out.println(personne);
//    	transaction.commit();
//    	session.close();
//    	sessionFactory.close();
//    	//affiche la liste des personnes dont le nom est travolta. select * from personne were nom = travolta
    	
//    	Configuration configuration = new Configuration().configure();
//    	SessionFactory sessionFactory = configuration.buildSessionFactory();
//    	Session session = sessionFactory.openSession();
//    	Transaction transaction = session.beginTransaction();
//    	//on suppose que John Wick avec un num 5 existe dans la BD
//    	Personne p = session.load(Personne.class, 5);
//    	p.setNom("Raphaello");
//    	session.refresh(p); //recupère les données de la base (lecture seule)
//    	System.out.println("le nom est " + p.getNom());
//    	// affiche le nom est travolta
//    	transaction.commit();
//    	session.close();
//    	sessionFactory.close();

//    	Configuration configuration = new Configuration().configure();
//    	SessionFactory sessionFactory = configuration.buildSessionFactory();
//    	Session session = sessionFactory.openSession();
//    	Transaction transaction = session.beginTransaction();
//    	// on suppose que John Wick avec un num 1 existe dans la BD
//    	Personne p = session.load(Personne.class, 1);
//    	p.setNom("Travolta");
//    	session.evict(p); // p n est plus gere par session
//    	session.flush();
//    	transaction().commit();
//    	Personne p1 = session.load(Personne.class, 1);
//    	System.out.println("le nom est " + p1.getNom());
//    	// affiche le nom est Wick
//    	session.close();
//    	sessionFactory.close();
//    	// ne marche pas et je ne sais pas pk
    	
//    	Configuration configuration = new Configuration().configure();
//    	SessionFactory sessionFactory = configuration.buildSessionFactory();
//    	Session session = sessionFactory.openSession();
//    	Transaction transaction = session.beginTransaction();
//    	String sqlRequete = "select * from Personne";
//    	SQLQuery query = session.createSQLQuery(sqlRequete);
//    	query.addEntity(Personne.class);
//    	List<Personne> personnes = (List<Personne>) query.list();
//    	for(Personne personne : personnes)
//    	System.out.println(personne);
//    	transaction.commit();
//    	session.close();
//    	sessionFactory.close();
//    	//execute une requete SQL ici affiche la liste des personnes 
    	
//    	Configuration configuration = new Configuration().configure();
//    	SessionFactory sessionFactory = configuration.buildSessionFactory();
//    	Session session = sessionFactory.openSession();
//    	Transaction transaction = session.beginTransaction();
//    	String sqlRequete = "select * from Personne where nom = :nom";
//    	SQLQuery query = session.createSQLQuery(sqlRequete);
//    	query.addEntity(Personne.class);
//    	query.setParameter("nom", "wick"); //nom correspond à la valeur de la line 173 apres les :
//    	List<Personne> personnes = (List<Personne>) query.list();
//    	for(Personne personne : personnes)
//    	System.out.println(personne);
//    	transaction.commit();
//    	session.close();
//    	sessionFactory.close();
//    	//requete paramétrée
    	
//    	Configuration configuration = new Configuration().configure();
//    	SessionFactory sessionFactory = configuration.
//    	buildSessionFactory();
//    	Session session = sessionFactory.openSession();
//    	Transaction transaction = session.beginTransaction();
//    	Query query = session.getNamedQuery("findByNomPrenom");
//    	query.setParameter("nom", "Abruzzi");
//    	query.setParameter("prenom", "John");
//    	List<Personne> personnes = (List<Personne>) query.list();
//    	for(Personne personne : personnes)
//    	System.out.println(personne);
//    	transaction.commit();
//    	session.close();
//    	sessionFactory.close();
//    	//requete nomée

//    	Configuration configuration = new Configuration().configure();
//    	SessionFactory sessionFactory = configuration.buildSessionFactory();
//    	Session session = sessionFactory.openSession();
//    	Transaction transaction = session.beginTransaction();
//    	String hql = "select p from Personne p where nom = :nom";
//    	// OU BIEN String hql = "from Personne where nom = :nom";
//    	String string = "travolta";
//    	Query query = session.createQuery(hql);
//    	query.setParameter("nom", string);
//    	List<Personne> personnes = (List<Personne>) query.list();
//    	for(Personne personne : personnes)
//    	System.out.println(personne);
//    	transaction.commit();
//    	session.close();
//    	sessionFactory.close();
//    	//requete HQL pour récupérer une liste de personne 

//    	/* Adresse */
//    	Adresse adresse = new Adresse();
//    	adresse.setRue("paradis");
//    	adresse.setCodePostal("13001");
//    	adresse.setVille("Marseille");
//    	/* Personne */
//    	Personne personne = new Personne();
//    	personne.setAdresse(adresse);
//    	personne.setNom("Pomelo");
//    	personne.setPrenom("sebastien");
//    	/* Persistance */
//    	Configuration configuration = new Configuration().configure();
//    	SessionFactory sessionFactory = configuration.buildSessionFactory();
//    	Session session = sessionFactory.openSession();
//    	Transaction transaction = session.beginTransaction();
//    	session.persist(personne);
//    	transaction.commit();
//    	session.close();
//    	sessionFactory.close();
    	
//    	Adresse a1 = new Adresse();
//    	a1.setRue("Estaque");
//    	a1.setCodePostal("13016");
//    	a1.setVille("Marseille");
//    	Adresse a2 = new Adresse();
//    	a2.setRue("Merlan");
//    	a2.setCodePostal("13013");
//    	a2.setVille("Marseille");
//    	Personne p1 = new Personne();
//    	p1.setNom("Wick");
//    	p1.setPrenom("John");
//    	p1.addAdresse(a1);
//    	p1.addAdresse(a2);
//    	Configuration configuration = new Configuration().configure();
//    	SessionFactory sessionFactory = configuration.buildSessionFactory();
//    	Session session = sessionFactory.openSession();
//    	Transaction transaction = session.beginTransaction();
//    	session.persist(p1);
//    	transaction.commit();
//    	session.close();
//    	sessionFactory.close();
    	
//    	Configuration configuration = new Configuration().configure();
//    	SessionFactory sessionFactory = configuration.
//    	buildSessionFactory();
//    	Session session = sessionFactory.openSession();
//    	Criteria criteria = session.createCriteria(Personne.class);
//    	List<Personne> personnes = (List<Personne>) criteria.list();
//    	for(Personne personne : personnes) {
//    	System.out.println(personne);
//    	}
//    	session.close();
//    	sessionFactory.close();	
// 	

//    	Personne p1 = new Personne();
//    	Personne p2 = new Personne();
//    	p1.setNom("Voight");
//    	p1.setPrenom("Bill");
//    	p2.setNom("Bob");
//    	p2.setPrenom("Joe");
//    	Sport s1 = new Sport();
//    	Sport s2 = new Sport();
//    	Sport s3 = new Sport();
//    	s1.setNom("football");
//    	s2.setNom("tennis");
//    	s3.setNom("box");
//    	s1.setType("collectif");
//    	s2.setType("individuel");
//    	s3.setType("collectif ou individuel");
//    	p1.addSport(s1);
//    	p1.addSport(s3);
//    	p2.addSport(s1);
//    	p2.addSport(s2);
//    	p2.addSport(s3);
//    	Configuration configuration = new Configuration().configure();
//    	SessionFactory sessionFactory = configuration.buildSessionFactory();
//    	Session session = sessionFactory.openSession();
//    	Transaction transaction = session.beginTransaction();
//    	session.persist(p1);
//    	session.persist(p2);
//    	transaction.commit();
//    	session.close();
//    	sessionFactory.close();   	
//    	
//    	for (Personne personne : s1.getPersonnes())
//    	System.out.println(personne.getNom());

    	/* Personne */
    	Personne personne = new Personne();
    	personne.setNom("Guardiola");
    	personne.setPrenom("Pep");
    	/* Enseignant */
    	Enseignant enseignant = new Enseignant();
    	enseignant.setNom("Ferguson");
    	enseignant.setPrenom("Sir");
    	enseignant.setSalaire(10000);
    	/* ´etudiant */
    	Etudiant etudiant = new Etudiant();
    	etudiant.setNom("Mourinho");
    	etudiant.setPrenom("Jose");
    	etudiant.setNiveau("Ligue 1");
    	/* Persistance */
    	Configuration configuration = new Configuration().configure();
    	SessionFactory sessionFactory = configuration.buildSessionFactory();
    	Session session = sessionFactory.openSession();
    	Transaction transaction = session.beginTransaction();
    	session.persist(personne);
    	session.persist(etudiant);
    	session.persist(enseignant);
    	transaction.commit();
    	session.close();
    	sessionFactory.close();
	
    	
    	
    	
    }
}
