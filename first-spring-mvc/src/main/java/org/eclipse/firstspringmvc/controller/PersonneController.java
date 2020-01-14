package org.eclipse.firstspringmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.firstspringmvc.dao.PersonneRepository;
import org.eclipse.firstspringmvc.model.Personne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PersonneController {
	@Autowired
	private PersonneRepository personneRepository;
	
	@GetMapping(value = "/addPerson")
	public String addPerson() {
	return "addPerson";
	}
	@GetMapping(value = "/showAll")
	public ModelAndView showAll() {
	ArrayList <Personne> personnes =(ArrayList<Personne>) personneRepository.findAll();
	ModelAndView mv = new ModelAndView();
	mv.setViewName("result");
	mv.addObject("personnes", personnes);
	return mv;
	}
	@PostMapping(value = "/addPerson")
	public ModelAndView addPerson(@RequestParam(value = "nom") String
	nom, @RequestParam(value = "prenom") String prenom) {
	Personne p1 = new Personne(nom,prenom);
	personneRepository.save(p1);
	ModelAndView mv = new ModelAndView();
	mv.setViewName("confirm");
	mv.addObject("nom", nom);
	mv.addObject("prenom", prenom);
	return mv;
	}
	@GetMapping(value = "/showAllByPage/{i}/{j}")
	public ModelAndView showAllByPage(@PathVariable int i,
	@PathVariable int j) {
	Page<Personne> personnes = personneRepository.findAll(PageRequest.of(i, j));
	ModelAndView mv = new ModelAndView();
	mv.setViewName("result");
	mv.addObject("personnes", personnes.getContent());
	return mv;
	}
	@GetMapping(value = "/showAllSorted")
	public ModelAndView showAllSorted() {
	List<Personne> personnes = personneRepository.findAll(Sort.by("nom").descending());
	ModelAndView mv = new ModelAndView();
	mv.setViewName("result");
	mv.addObject("personnes", personnes);
	return mv;
	}
	@GetMapping(value = "/showSome")
	public ModelAndView showSome(
			@RequestParam(value = "nom") String nom, 
			@RequestParam(value = "prenom")String prenom) {
	ArrayList <Personne> personnes =(ArrayList<Personne>) personneRepository.findByNomAndPrenom(nom, prenom);
	ModelAndView mv = new ModelAndView();
	mv.setViewName("result");
	mv.addObject("personnes", personnes);
	return mv;
	}
	@GetMapping(value = "/containing")
	public ModelAndView containting(
			@RequestParam(value = "nom") String nom) {
	ArrayList <Personne> personnes =(ArrayList<Personne>) personneRepository.findByNomContaining(nom);
	ModelAndView mv = new ModelAndView();
	mv.setViewName("result");
	mv.addObject("personnes", personnes);
	return mv;
	}
	@GetMapping(value = "/EndingWith")
	public ModelAndView EndingWith(
			@RequestParam(value = "prenom") String prenom) {
	ArrayList <Personne> personnes =(ArrayList<Personne>) personneRepository.findByPrenomEndingWith(prenom);
	ModelAndView mv = new ModelAndView();
	mv.setViewName("result");
	mv.addObject("personnes", personnes);
	return mv;
	}
	
}
