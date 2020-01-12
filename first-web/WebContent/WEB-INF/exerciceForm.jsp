<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Exercice formulaires</title>
</head>
<body>
<h3>Exercice formulaires</h3>
<p>créer un formulaire avec 1 seule vue pour ajouter, supprimer et modifier des personnes </p>
<h5>${ x } </h5>
	<form action="${ x }" method="post">
		<div>Formulaire d’ajout d’une Personne</div>		
		<div>
			<label for="nom">Nom *</label> <input type="text" id="nom" name="nom"
				value="${ nomSaisi }" /> ${ nomIncorrect }
		</div>
		<div>
			<label for="prenom">Prenom *</label> <input type="text"
				id="prenom" name="prenom" value="${ prenomSaisi }" /> ${ prenomIncorrect }
		</div>
		<input type="submit" value="${ x }" />
	</form>
</body>
</html>