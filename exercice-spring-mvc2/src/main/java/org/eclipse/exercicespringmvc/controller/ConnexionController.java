package org.eclipse.exercicespringmvc.controller;

import org.eclipse.exercicespringmvc.dao.PersonneRepository;
import org.eclipse.exercicespringmvc.model.Personne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ConnexionController {

	@Autowired
	private PersonneRepository personneRepository;
	
	@GetMapping("connexion")
	public String personneForm(Model model) {
		model.addAttribute("", );
		return "connexion";
	}
}
