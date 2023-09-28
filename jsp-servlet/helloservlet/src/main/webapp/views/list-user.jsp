<%@page import="model.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Users</title>
</head>
<body>
	<%
	Object obj = request.getAttribute("listUser");
	List<User> users = (List<User>) obj;
	%>
	<%
	String uname = (String) session.getAttribute("username");
	%>
	<h1>Hello <%=uname %></h1>
	<table>
		<thead>
			<tr>
				<th>ID:</th>
				<th>Name:</th>
				<th>Age:</th>
			</tr>
		</thead>
		<tbody>
			<%
			for (User user : users) {
			%>
			<tr>
				<td><%=user.getId()%></td>
				<td><%=user.getName()%></td>
				<td><%=user.getAge()%></td>
				<td><a href="/helloservlet/user/edit?id=<%=user.getId()%>">Edit</a>
				</td>

			</tr>

			<%
			}
			%>

		</tbody>
	</table>
</body>
</html>