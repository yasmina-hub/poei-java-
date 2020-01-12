package org.eclipse.ressource;

import java.util.Arrays;


import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.dao.PersonneDaoImpl;
import org.eclipse.model.Personne;
@Path("personnes")
public class PersonneResource {

	@GET
	@Produces({MediaType.APPLICATION_XML , MediaType.APPLICATION_JSON})
	public List<Personne> getPersonnes() {
		PersonneDaoImpl DaoImpl = new PersonneDaoImpl();
		List <Personne> personnes = Arrays.asList();
		personnes = DaoImpl.getAll();
		return personnes;
	}

	@POST
	@Produces({MediaType.APPLICATION_XML , MediaType.APPLICATION_JSON})
	@Consumes ({MediaType.APPLICATION_XML , MediaType.APPLICATION_JSON})
	public Personne addPersonnes(Personne personne) {
		PersonneDaoImpl DaoImpl = new PersonneDaoImpl();
		Personne p = DaoImpl.save(personne);
		return p;
	}

	@DELETE
	@Produces({MediaType.APPLICATION_XML , MediaType.APPLICATION_JSON})
	@Consumes ({MediaType.APPLICATION_XML , MediaType.APPLICATION_JSON})
	public void removePersonnes(Personne personne) {
		PersonneDaoImpl suppPersonneDaoImpl = new PersonneDaoImpl();
		Personne findPersonne = suppPersonneDaoImpl.findById(personne.getNum());
		if (findPersonne != null) {
			suppPersonneDaoImpl.remove(personne);
			return;
		}
	}
	
	@PUT
	@Produces({MediaType.APPLICATION_XML , MediaType.APPLICATION_JSON})
	@Consumes ({MediaType.APPLICATION_XML , MediaType.APPLICATION_JSON})
	public Personne updatePersonnes(Personne personne) {
		PersonneDaoImpl daop = new PersonneDaoImpl();
		Personne p = daop.update(personne);
		return p;
	}

		//	public List<Personne> getPersonnes() {
		//		Personne personne = new Personne();
		//		personne.setNom("Wick");
		//		personne.setPrenom("John");
		//		personne.setAge(45);
		//		Personne personne2 = new Personne();
		//		personne2.setNom("Bob");
		//		personne2.setPrenom("Mike");
		//		personne2.setAge(35);
		//		List <Personne> personnes = Arrays.asList(personne, personne2);
		//		return personnes;
		//	}

		//	public Personne getPersonne(){
		//	Personne personne = new Personne();
		//	personne.setNom("Wick");
		//	personne.setPrenom("John");
		//	personne.setAge(45);
		//	return personne;
		//	}

}
