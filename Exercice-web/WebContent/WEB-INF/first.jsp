<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="org.eclipse.model.Personne"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<p>1 bonjour : ${ sessionScope.perso.nom } ${ sessionScope.perso.prenom }
	</p>

	<c:url value="/second" var="second" />
	<a href="${ second }">lien vers second page</a>
	<br>
	<c:url value="/third" var="third" />
	<a href="${ third }">lien vers third page</a>

</body>
</html>