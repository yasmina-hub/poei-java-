<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>First page</title>
</head>
<body>
	<h2>First page</h2>
	<c:out value="Bonjour ${ sessionScope.nom }" />
	<div>
		<c:url value="second" var="second" />
		<a href="${ second }"> second </a>
	</div>
	<div>
		<c:url value="third" var="third" />
		<a href="${ third }"> third </a>
	</div>
	<div>
		<c:url value="deconnect" var="deconnect" />
		<a href="${ deconnect }"> deconnexion </a>
	</div>
</body>
</html>