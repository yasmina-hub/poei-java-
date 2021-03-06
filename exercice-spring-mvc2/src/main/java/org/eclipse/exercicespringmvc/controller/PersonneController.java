package org.eclipse.exercicespringmvc.controller;

import org.eclipse.exercicespringmvc.dao.PersonneRepository;
import org.eclipse.exercicespringmvc.model.Personne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping ("personne/")
public class PersonneController {
	
	@Autowired
	private PersonneRepository personneRepository;
	
	@GetMapping("")
	public String afficherPersonne(Model model) {
		model.addAttribute("personne", new Personne() );
		return "personne";
	}
	
	@PostMapping("")
	public String personneForm(Model model) {
		model.addAttribute("", );
		return "";
	}

}
