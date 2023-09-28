<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New user</title>
</head>
<body>
	<form action="/helloservlet/user/new" method="post">
		<div>
			<label>Id:</label> <input type="number" name="id" />
		</div>
		<div>
			<label>Name:</label> <input type="text" name="name" />
		</div>
		<div>
			<label>Age:</label> <input type="number" name="age" />
		</div>
		<div>
			<button type="submit">Save</button>
		</div>
	</form>
</body>
</html>