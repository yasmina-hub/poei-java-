<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="org.eclipse.model.Personne"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>projet JEE</title>
</head>
<body>
	<h2>Liste de personnes</h2>
	<%
		List<Personne> personnes = (List<Personne>) request.getAttribute("personnes");
		for (Personne ppp : personnes) {
			out.print(ppp);
			out.print("<br>");
		}
	%>
	<h2>Personne demandée</h2>
	<%=request.getAttribute("personne")%>
	<br>
	<h2>Simplification avec EL</h2>
	${personne}
	<br> ${personne.nom}
	<br> ${personne.getNom()}
	<br> ${personne["nom"]}
	<br>
	<br> ${personnes.get(0)}
	<br> ${personnes[0]}
	<br> ${personnes['0']}
	<br> ${personnes["0"]}
	<br>
</body>
</html>