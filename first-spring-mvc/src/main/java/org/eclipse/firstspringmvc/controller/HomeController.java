package org.eclipse.firstspringmvc.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

//	@GetMapping(value = "/hello")
//	public void sayHello() {
//	System.out.println("Hello World!");
//	}

//	@GetMapping(value = "/hello")
//	public void sayHello(@RequestParam(value = "nom", required = false, defaultValue = "wick") String s) {
//	System.out.println("Hello " + s);
//	}

//	@GetMapping(value = "/hello/{nom}")
//	public void sayHello(@PathVariable String nom) {
//	System.out.println("Hello " + nom);
//	}

//	@GetMapping(value = "/hello")
//	public String sayHello() {
//		return "hello";
//	}
	
//	@GetMapping(value = "/hello")
//	public String sayHello(Model model) {
//	model.addAttribute("nom", "Wick");
//	return "hello";
//	}

//	@GetMapping(value = "/hello")
//	public String sayHello(ModelMap model) {
//	model.addAttribute("nom", "Wick");
//	return "hello";
//	}

	@GetMapping(value = "/hello")
	public ModelAndView sayHello(ModelAndView mv) {
	mv.setViewName("hello");
	mv.addObject("nom", "Wick");
	return mv;
	}

}
