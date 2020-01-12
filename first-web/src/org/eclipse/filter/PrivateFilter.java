package org.eclipse.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class PrivateFilter
 */
@WebFilter("/PrivateFilter")
public class PrivateFilter implements Filter {

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		HttpSession session = req.getSession();
		// on r´ecup`ere le nom de la session
		String nom = (String)session.getAttribute("nom");
		// on r´ecup`ere le chemin demand´e par l’utilisateur
		String chemin = req.getServletPath();
		// on r´ecup`ere la m´ethode HTTP utilis´ee (GET ou POST)
		String methode = req.getMethod();
		if (nom != null || chemin.equals("/") || chemin.equals("/index.jsp"
				) || chemin.equals("/first") && methode.equals("POST"))
			chain.doFilter(request, response);
		else
			res.sendRedirect(req.getContextPath());
	}


}
