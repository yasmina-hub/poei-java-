<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="inscription">
		<div>Formulaire d'inscription</div>
		<div>
			<label for="nom">Nom *</label> 
			<input type="text" id="nom" name="nom" value="${ nomSaisi }" /> ${ nomIncorrect }
		</div>
		<div>
			<label for="prenom">Prenom *</label> 
			<input type="text" id="prenom" name="prenom" value="${ prenomSaisi }" /> ${ prenomIncorrect }
		</div>
		<div>
			<SELECT name="sexe" size="1">
				<OPTION>h
				<OPTION selected>f
			</SELECT> <input type="submit" value="Ajouter" />
		</div>
	</form>
</body>
</html>