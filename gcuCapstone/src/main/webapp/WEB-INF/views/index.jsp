<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>index</title>
<link rel="stylesheet" href="/index.css" />
</head>
<body>
	<h1>Hello</h1>
		<div>
			<p>Login</p>
				<div>
					<form action="/" method="post">
						<p class="message">${ message }</p>
						<p>Username:</p>
						<input required name="username">
						<p>Password:</p>
						<input type="password" required name="password">
						
					
						<button type="submit">Submit</button>
					</form>
				</div>
		</div>
		

</body>
</html>