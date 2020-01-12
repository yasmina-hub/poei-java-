<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p> 3 bonjour : ${ sessionScope.perso.nom } ${ sessionScope.perso.prenom } </p>

<c:url value="/first" var="first"/>
	<a href="${ first1 }">lien vers first page</a>
	<br>
	<c:url value="/second" var="second"/>
	<a href="${ second1 }">lien vers second page</a>
</body>
</html>