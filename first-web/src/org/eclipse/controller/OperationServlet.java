package org.eclipse.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class OperationServlet
 */
@WebServlet("/operation")
public class OperationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String nbr1 = request.getParameter("nbr1");
		String nbr2 = request.getParameter("nbr2");
		String op = request.getParameter("op");
		int resultat = 0;
		if (nbr1 != null && nbr2 != null && op.equals("plus")){
			resultat = (Integer.parseInt(nbr1) + Integer.parseInt(nbr2));
			PrintWriter out = response.getWriter();
			out.print(nbr1 + " + " + nbr2 + " = " + resultat);
		}
		else if (nbr1 != null && nbr2 != null && op.equals("moins")) {
			resultat = (Integer.parseInt(nbr1) - Integer.parseInt(nbr2));
			PrintWriter out = response.getWriter();
			out.print(nbr1 + " - " + nbr2 + " = " + resultat);
		}
		else if (nbr1 != null && nbr2 != null && op.equals("fois")) {
			resultat = (Integer.parseInt(nbr1) * Integer.parseInt(nbr2));
			PrintWriter out = response.getWriter();
			out.print(nbr1 + " * " + nbr2 + " = " + resultat);
		}
		else if (nbr1 != null && nbr2 != null && op.equals("div")) {
			resultat = (Integer.parseInt(nbr1) - Integer.parseInt(nbr2));
			PrintWriter out = response.getWriter();
			out.print(nbr1 + " / " + nbr2 + " = " + resultat);
		}
		else  {
			PrintWriter out = response.getWriter();
			out.print("erreur");
		}


	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
