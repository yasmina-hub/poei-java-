<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" errorPage="erreur.jsp"%>
<%@ page import="org.eclipse.model.Personne"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>projet JEE</title>
</head>
<body>

	hello world (depuis une jsp)
	<%
	for (int i = 0; i < 3; i++) {
		out.print(i + "bonjour <br> ");
	}
	Personne personne = new Personne(1, "tabouri", "melissa");
	out.print(personne);
%>
	<br>
	<%
		String notreVille = (String) request.getAttribute("maVille");
		out.println("Bienvenue a " + notreVille);
	%>
	<br>
	<%
		Personne p = (Personne) request.getAttribute("perso");
		out.print("Hello " + p.getPrenom() + " " + p.getNom());
	%>
	<br>
	<%
		//int x = 3 / 0;
	%>

</body>
</html>