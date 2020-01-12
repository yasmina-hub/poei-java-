package org.eclipse.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import org.eclipse.dao.PersonneDaoImpl;
import org.eclipse.model.Personne;

/**
 * Servlet implementation class AjoutServlet
 */
@WebServlet({ "/add , /remove , /update" })
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String x = request.getServletPath().substring(1);
		request.setAttribute("x", x);
		this.getServletContext().getRequestDispatcher("/WEB-INF/exerciceForm.jsp").forward(request, response);	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		int num = Integer.parseInt(request.getParameter("num"));
		if ( request.getServletPath() == "/add") {
			Personne personne = new Personne(nom,prenom);
			PersonneDaoImpl daop = new PersonneDaoImpl();
			Personne insertedPersonne = daop.save(personne);
			request.setAttribute("personne", insertedPersonne);
			this.getServletContext().getRequestDispatcher("/WEB-INF/confirmation.jsp").forward(request, response);
		}
		else if (request.getServletPath() == "/remove") {
			Personne personne = new Personne(num);
			PersonneDaoImpl suppPersonneDaoImpl = new PersonneDaoImpl();
			Personne findPersonne = suppPersonneDaoImpl.findById(num);
			if (findPersonne != null) {
				suppPersonneDaoImpl.remove(personne);
				request.setAttribute("personne", suppPersonneDaoImpl);
				this.getServletContext().getRequestDispatcher("/WEB-INF/confirmation.jsp").forward(request, response);
			}
			else 
				this.getServletContext().getRequestDispatcher("/WEB-INF/erreur.jsp").forward(request, response);

		}
		else if (request.getServletPath() == "/update") {
			String x = "update";

		}


	}

}
