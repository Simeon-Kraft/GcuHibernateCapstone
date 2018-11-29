<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>add-admin</title>
</head>
<body>
	<h1>create admin</h1>
		<div>
				<div>
					<form action="/create-admin" method="post">
						<p>First Name:</p>
						<input required name="firstName">
						
						<p>Last Name:</p>
						<input required name="lastName">
						
						<p>User Name:</p>
						<input required name="username">
						
						<p>Password:</p>
						<input required type="password" name="password">
						
						<button type="submit">Submit</button>
					</form>
				</div>
		</div>
		

</body>
</html>