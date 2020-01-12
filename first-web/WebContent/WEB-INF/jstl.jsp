<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:out value="Hello World" />
	<h3>Affiche le contenu de la variable JEE si elle existe, sinon
		affiche JSTL</h3>
	<c:out value="${ JEE }" default="JSTL" />
	<h3>déclaration de variable</h3>
	<c:set var="JEE" value="J’aime la plateforme JEE" scope="request" />
	<c:out value="${ JEE }"> JSTL </c:out>
	<br>
	<c:out value="<p> Bonjour ’John Wick’. </p>" />
	<%-- affiche <p> Bonjour ’John Wick’. </p> --%>
	<br>
	<c:out value="<p> Bonjour ’John Wick’. </p>" escapeXml="false" />
	<%-- affiche Bonjour ’John Wick’. --%>
	<h3>Incrementation</h3>
	<c:set var="x" value="${ 0 }" />
	<c:set var="x" value="${ x + 1 }" />
	<c:out value="${ x }" />
	<%-- Affiche 1 --%>
	<h3>Conditions et boucles</h3>
	<h5>Condition</h5>
	<c:if test="${ 3 > 2 and 2 > 1 }" var="result" scope="session">
		<c:out value="${ result }" />
	</c:if>
	<%-- affiche true --%>
	<br>
	<c:set var="nbr" value="${ param.nbr }" />
	<c:if test="${ nbr > 0 }" var="result" scope="page">
		<c:out value="positif" />
	</c:if>
	<c:if test="${ nbr < 0 }" var="result" scope="page">
		<c:out value="negatif" />
	</c:if>
	<c:if test="${ nbr == 0 }" var="result" scope="page">
		<c:out value="null" />
	</c:if>
	<h5>Boucles</h5>
	<c:set var="nbr" value="${ param.nbr }" />
	<c:choose>
		<c:when test="${ nbr > 0 }">
			<c:out value="positif" />
		</c:when>
		<c:when test="${ nbr < 0 }">
			<c:out value="negatif" />
		</c:when>
		<c:otherwise> null</c:otherwise>
	</c:choose>
	<br>
	<c:forEach items="${ personnes }" var="element">
		<c:out value="${ element['nom'] }" />
	</c:forEach>
	<br>

	<c:forEach items="${ personnes }" var="element">
		<c:choose>
			<c:when test="${ element.num % 2 == 0 }">
				<c:out value="${ element.nom }" />
			</c:when>
			<c:when test="${ element.num % 2 != 0 }">
				<c:out value="${ element.prenom }" />
			</c:when>
		</c:choose>
	</c:forEach>
	<br>
	<c:forEach items="${ personnes }" var="element" varStatus="status">
		<c:choose>
			<c:when test="${ status.count %2 == 0 }">
				<c:out value="${ element.nom }" />
			</c:when>
			<c:when test="${ status.count %2 != 0 }">
				<c:out value="${ element.prenom }" />
			</c:when>
		</c:choose>
	</c:forEach>
	<h3>Liens</h3>
	<c:url value="/exercice" var="monLien">
		<c:param name="id" value="0" />
	</c:url>
	<a href="${ monLien }">lien vers exercice</a>
	<h3>Formater le texte</h3>
	<c:set var="montant" value="112233.44" />
	montant =
	<fmt:formatNumber value="${ montant }" type="currency" />
	<br>
	<c:set var="montant" value="112233.44" />
	montant =
	<fmt:formatNumber value="${ montant }" type="currency"
		currencySymbol="$" maxIntegerDigits="3" />
	<%-- Affiche montant = 233,44 $ --%>

</body>
</html>