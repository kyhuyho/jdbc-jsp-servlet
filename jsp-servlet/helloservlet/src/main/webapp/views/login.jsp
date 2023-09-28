<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<form action="/helloservlet/login" method="post">
		<div>
			<label>Username:</label> <input type="text" name="username" />
		</div>
		<div>
			<label>Password:</label> <input type="password" name="password" />
		</div>
		<div>
			<button type="submit">Login</button>
		</div>
	</form>
</body>
</html>