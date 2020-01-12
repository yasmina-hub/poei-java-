package org.eclipse.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.config.MyConnection;
import org.eclipse.dao.PersonneDaoImpl;
import org.eclipse.model.Personne;

/**
 * Servlet implementation class InscriptionServlet
 */
@WebServlet("/inscription")
public class InscriptionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.getServletContext().getRequestDispatcher("/WEB-INF/inscription.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		boolean test = true;
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		char sexe = request.getParameter("sexe").charAt(0);
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
			Personne personne = new Personne(nom,prenom,sexe);
			PersonneDaoImpl daop = new PersonneDaoImpl();
			int insertedPersonne = daop.save(personne);
			request.setAttribute("personne", insertedPersonne);
			this.getServletContext().getRequestDispatcher("/WEB-INF/inscription.jsp").forward(request, response);
		}
		else {
			request.setAttribute("nomSaisi", nom );
			request.setAttribute("prenomSaisi",prenom);
			this.getServletContext().getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
		}
	}

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
