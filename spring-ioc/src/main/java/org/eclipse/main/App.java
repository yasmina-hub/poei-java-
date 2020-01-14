package org.eclipse.main;

import org.eclipse.model.Personne;
import org.eclipse.nation.European;
import org.eclipse.nation.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main( String[] args ){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//				Personne p = context.getBean("per", Personne.class);
//				p.afficher();

//				European e = (European) context.getBean("french");
//				e.saluer();
				
//				Person p = (Person) context.getBean("person");
//				p.drive();
				
				European e = (European) context.getBean("french");
				e.saluer(5);
	}
}
