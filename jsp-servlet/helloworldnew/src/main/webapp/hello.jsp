<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	Object obj = request.getAttribute("msg");
	String s = (String) obj;
	%>
	<p><%=s%></p>
</body>
</html>