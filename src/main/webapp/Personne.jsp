<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Liste des employés</h1>
 <c:forEach items="${ Liste }" var="personne" varStatus="status">
  <p>Employé <c:out value="${ status.count }" /> :</p>
  <p><c:out value="${personne.nom }"></c:out> </p>
  <p><c:out value="${personne.prenom }"></c:out> </p>
  <p><c:out value="${personne.poste }"></c:out> </p>
  <p><c:out value="${personne.age }"></c:out> </p>
  <a href="Delete?id=${ personne.id }" >Supprimer</a>
  <a href="Update?id=${ personne.id }">Modifier</a>
 </c:forEach>
</body>
</html>