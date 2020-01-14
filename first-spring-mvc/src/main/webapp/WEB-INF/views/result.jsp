<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result page</title>
</head>
<body>
	<c:forEach items="${ personnes }" var="personne">
		<div>
			<c:out value="${ personne.prenom } ${ personne.nom }"/>
		</div>
	</c:forEach>
</body>
</html>