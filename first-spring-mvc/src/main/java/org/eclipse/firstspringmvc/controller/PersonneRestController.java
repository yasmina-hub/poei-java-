package org.eclipse.firstspringmvc.controller;

import java.util.List;

import org.eclipse.firstspringmvc.dao.AdresseRepository;
import org.eclipse.firstspringmvc.dao.PersonneRepository;
import org.eclipse.firstspringmvc.model.Adresse;
import org.eclipse.firstspringmvc.model.Personne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class PersonneRestController {
	@Autowired
	private PersonneRepository personneRepository;
	@Autowired
	private AdresseRepository adresseRepository;	
//	@ResponseBody
	@GetMapping("/personnes")
	public List<Personne> getPersonnes() {
		return personneRepository.findAll();
	}
	
//	@ResponseBody
	@GetMapping("/personnes/{id}")
	public Personne getPersonne(@PathVariable("id") long id) {
		return personneRepository.findById(id).orElse(null);
	}
	
//	@ResponseBody
	@PostMapping("/personnes")
	public Personne addPersonne(@RequestBody Personne personne) {
		System.out.println(personne);
		List <Adresse> adresses = personne.getAdresses();
		for (Adresse adresse : adresses) {
			Adresse adr = null;
			if (adresse.getId() != null) {
				adr = adresseRepository.findById(adresse.getId()).orElse(null);
				adresses.set(adresses.indexOf(adresse), adr);
			} else {
				adr = adresseRepository.save(adresse);
			}
		}
		return personneRepository.saveAndFlush(personne);
	}
	
//	@ResponseBody
	@PutMapping("/personnes")
	public Personne updatePersonne(@RequestBody Personne personne) {
		System.out.println(personne);
		return personneRepository.saveAndFlush(personne);
	}
	
//	@ResponseBody
	@DeleteMapping("/personnes/{id}")
	public void deletePersonne(@PathVariable long id) {
		personneRepository.deleteById(id);
	}
}
