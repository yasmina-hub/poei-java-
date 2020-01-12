package org.eclipse.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.model.Personne;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/mapage")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().print("hello world");
		
//		// pour indiquer le type de reponse
//		response.setContentType("text/html");
//		// indiquer l’encodage UTF-8 pour eviter les problemes avec les accents
//		response.setCharacterEncoding("UTF-8");
//		PrintWriter out = response.getWriter();
//		out.println("Hello World");
		
//		String nom = request.getParameter("nom");
//		String prenom = request.getParameter("prenom");
//		PrintWriter out = response.getWriter();
//		out.print("Hello " + nom + " " + prenom);

//		this.getServletContext().getRequestDispatcher("/WEB-INF/vue.jsp").forward(request, response);
		
		String ville = "Marseille";
		request.setAttribute("maVille",ville);
		// l’envoi de request se fait apres cetteinstruction
//		this.getServletContext().getRequestDispatcher("/WEB-INF/vue.jsp").forward(request, response);
		
		Personne perso = new Personne();
		perso.setNom("Wick");
		perso.setPrenom("John");
		perso.setNum(100);
		request.setAttribute("perso",perso);
		this.getServletContext().getRequestDispatcher("/WEB-INF/vue.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
