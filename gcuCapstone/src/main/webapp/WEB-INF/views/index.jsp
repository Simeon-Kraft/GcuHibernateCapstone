<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>index</title>
</head>
<body>
	<h1>Hello</h1>
		<div>
			<p>Make a student</p>
				<div>
					<form action="/" method="post">
						<p>First Name:</p>
						<input name="firstName">
						<p>Last Name:</p>
						<input name="lastName">
						<p>Phone Number:</p>
						<input type="number" name="phone">
						<p>Address:</p>
						<input name="adress">
						<p>Username:</p>
						<input name="username">
						<p>Password:</p>
						<input type="password" name="password">
					
						<button type="submit">Submit</button>
					</form>
				</div>
		</div>
		

</body>
</html>