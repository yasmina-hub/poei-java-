package org.eclipse.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.dao.PersonneDaoImpl;
import org.eclipse.model.Personne;

/**
 * Servlet implementation class AjoutPersonne
 */
@WebServlet({ "/AjoutPersonne", "/ajoutpersonne", "/ajoutPersonne" })
public class AjoutPersonneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/ajoutPersonne.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		boolean test = true;
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		//		boolean verifNom = verifChaine(nom);
		//		boolean verifPrenom = verifChaine(prenom);
		//		if (!verifNom)
		//			request.setAttribute("nomIncorrect", "format incorrect");
		//		if (!verifPrenom)
		//			request.setAttribute("prenomIncorrect","format incorrect");
		//		if (!verifNom || !verifPrenom){
		//			request.setAttribute("nomSaisi", nom);
		//			request.setAttribute("prenomSaisi",prenom);
		//			this.getServletContext().getRequestDispatcher("/WEB-INF/ajoutPersonne.jsp").forward(request, response);
		//		}
		//		else {	
		//
		//			Personne personne = new Personne(nom,prenom);
		//			PersonneDaoImpl daop = new PersonneDaoImpl();
		//			Personne insertedPersonne = daop.save(personne);
		//			request.setAttribute("personne", insertedPersonne);
		//			this.getServletContext().getRequestDispatcher("/WEB-INF/confirmation.jsp").forward(request, response);
		//		}

		try {
			verifChaine(nom);
		} catch (Exception e) {
			request.setAttribute("nomIncorrect", e.getMessage() );
			test = false;
		}
		try {
			verifChaine(prenom);
		} catch (Exception e) {
			request.setAttribute("prenomIncorrect", e.getMessage() );
			test = false;
		}
		if (test){
			Personne personne = new Personne(nom,prenom);
			PersonneDaoImpl daop = new PersonneDaoImpl();
			Personne insertedPersonne = daop.save(personne);
			request.setAttribute("personne", insertedPersonne);
			this.getServletContext().getRequestDispatcher("/WEB-INF/confirmation.jsp").forward(request, response);
		}
		else {
			request.setAttribute("nomSaisi", nom );
			request.setAttribute("prenomSaisi",prenom);
			this.getServletContext().getRequestDispatcher("/WEB-INF/ajoutPersonne.jsp").forward(request, response);
		} //utilisation des exeptions pour afficher un message d'erreur


	}
	//	public boolean verifChaine(String s) {
	//		if (s == null || s.length() < 2)
	//			return false;
	//		char c = s.charAt(0);
	//		if (!(c >= 'A' && c <= 'Z'))
	//			return false;
	//		for(int i = 0; i < s.length(); i++) {
	//			c = s.charAt(i);
	//			if (!(c >= 'a' && c <= 'z')&& !(c >= 'A' && c <='Z'))
	//				return false;
	//		}
	//		return true;
	//	}

	public void verifChaine(String s) throws Exception {
		if (s == null || s.length() < 2)
			throw new Exception("La chaıne doit comporter au moins deux caracteres");
		char c = s.charAt(0);
		if (!(c >= 'A' && c <= 'Z'))
			throw new Exception("La chaıne doit commencer par une lettre en majuscule");
		for(int i = 0; i < s.length(); i++) {
			c = s.charAt(i);
			if (!(c >= 'a' && c <= 'z') && !(c >= 'A' && c <= 'Z'
					))
				throw new Exception("La chaıne ne peut contenir que des lettres");
		}
	}

}
