package org.eclipse.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.model.Personne;

/**
 * Servlet implementation class ExerciceServlet
 */
@WebServlet("/exercice")
public class ExerciceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());

		Personne personne0 = new Personne(0, "tabouri", "melissa");
		Personne personne1 = new Personne(1, "tandori", "tomas");
		Personne personne2 = new Personne(2, "expelliard", "isabelle");
		Personne personne3 = new Personne(3, "troncy", "stephanie");

		ArrayList personnes = new ArrayList();
		personnes.add(personne0);
		personnes.add(personne1);
		personnes.add(personne2);
		personnes.add(personne3);

		int i = Integer.parseInt(request.getParameter("id"));
		Personne personne = (Personne) personnes.get(i);
		request.setAttribute("personnes", personnes);
		request.setAttribute("personne", personne);
		this.getServletContext().getRequestDispatcher("/WEB-INF/exercice.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
