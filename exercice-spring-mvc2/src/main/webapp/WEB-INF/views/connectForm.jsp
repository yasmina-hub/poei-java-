<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Connection Form</title>
</head>
<body>

	<form:form modelAttribute="perso" action="connect" method="post">
		<form:label path="nom">nom</form:label>
		<form:input path="nom" />
		<form:errors path="nom" cssClass="error" />
		<form:label path="prenom">prenom</form:label>
		<form:input path="prenom" />
		<form:errors path="prenom" cssClass="error" />
		<input type="submit" value="Ajouter" />
	</form:form>
</body>
</html>

