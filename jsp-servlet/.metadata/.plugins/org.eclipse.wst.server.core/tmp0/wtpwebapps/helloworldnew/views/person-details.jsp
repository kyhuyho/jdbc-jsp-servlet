<%@page import="model.Person"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Person Details</title>
</head>
<body>
	<%
	Object obj = request.getAttribute("person");
	Person ps = (Person) obj;
	%>
	<p>
		ID
		<%=ps.getId()%></p>
	<p>
		Name
		<%=ps.getName()%></p>
</body>
</html>