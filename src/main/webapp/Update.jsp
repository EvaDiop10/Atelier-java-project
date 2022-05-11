<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Update" method ="POST">
    <input type="hidden" name="action" value="Update"/>

     <input type="text" name="id" value="${ UpdateP.id }"/>
    <div>
		<label>Nom</label>
		<input value="${ UpdateP.nom }"  name="nom"> 
		<label>Prénom</label>
		<input value="${ UpdateP.prenom }" name="prenom">
		<label>Poste</label>
		<input value="${ UpdateP.poste }" name="poste"> 
		<label>Age</label>
		<input value="${ UpdateP.age }" name="age"> 
		
	</div>
    <input type="submit" value="Update"/>
</form>
</body>
</html>