<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="connexion">
		<div>Formulaire de connexion</div>
		<div>
			<label for="nom">Nom *</label> <input type="text" id="nom" name="nom"
				value="${ nomSaisi }" /> ${ nomIncorrect }
		</div>
		<div>
			<label for="prenom">Prenom *</label> <input type="text" id="prenom"
				name="prenom" value="${ prenomSaisi }" /> ${ prenomIncorrect }
		</div> 
		<input type="submit" value="connexion" />
	</form>
	
	<c:url value="/inscription" var="inscription" />
	<a href="${ inscription }">Inscription</a>
</body>
</html>