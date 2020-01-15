package org.eclipse.firstspringmvc.controller;

import org.eclipse.firstspringmvc.dao.PersonneRepository;
import org.eclipse.firstspringmvc.model.Personne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PersonneRestController {
	@Autowired
	private PersonneRepository personneRepository;
	
	@GetMapping("/personnes")
	public String getPersonnes() {
		return personneRepository.findAll().toString();
	}
	@GetMapping("/personnes/{id}")
	public String getPersonne(@PathVariable("id") long id) {
		return personneRepository.findById(id).orElse(null).toString();
	}
	@PostMapping("/personnes")
	public String addPersonne(Personne personne) {
		System.out.println(personne);
		return personneRepository.save(personne).toString();
	}
}
