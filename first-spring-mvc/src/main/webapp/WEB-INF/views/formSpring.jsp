<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	homme :
	<form:radiobutton path="genre" value="homme" />
	femme :
	<form:radiobutton path="genre" value="femme" />
	<br>
	
	<form:radiobuttons items="${ genre }" path="sexe" />
	<br>
	
	homme :
	<form:checkbox path="genre" value="homme" />
	femme :
	<form:checkbox path="genre" value="femme" />
	<br>
	
	<form:checkboxes items="${ genre }" path="sexe" />
	<br>
	
	<form:select path="personnes">
		<form:option value="-" label="--Choisir une personne--" />
		<form:options items="${ personnes }" />
	</form:select>
	<form:select path="personnes" items="${ personnes }" multiple="true" />

</body>
</html>