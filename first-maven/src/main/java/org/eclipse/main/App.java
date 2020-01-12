package org.eclipse.main;

import org.eclipse.dao.PersonneDaoImpl;
import org.eclipse.model.Personne;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        PersonneDaoImpl pDaoImpl = new PersonneDaoImpl();
        Personne personne = new Personne ("davant", "émilie");
        Personne inherited = pDaoImpl.save(personne);
        if (inherited != null)
        	System.out.println("personne ajoutée" + inherited);
        else
        	System.out.println("problème d'insertion");
    }
}


