<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Person Form</title>
</head>
<body>
	Bonjour ${ perso.nom }
	<form:form modelAttribute="personne" action="personne" method="post">
		<form:label path="nom">nom</form:label>
		<form:input path="nom" />
		<form:errors path="nom" cssClass="error" />
		<form:label path="prenom">prenom</form:label>
		<form:input path="prenom" />
		<form:errors path="prenom" cssClass="error" />
		<input type="submit" value="Ajouter" />
	</form:form>
		<a href="deconnect"> deconnexion </a>
	
</body>
</html>