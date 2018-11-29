<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>add-student</title>
</head>
<body>
	<h1>add student</h1>
		<div>
				<div>
					<form action="/student-list" method="post">
						<p>First Name:</p>
						<input required name="firstName">
						
						<p>Last Name:</p>
						<input required name="lastName">
						
						<p>User Name:</p>
						<input required name="username">
						
						<p>Password:</p>
						<input required type="password" name="password">
						
						<p>Phone Number:</p>
						<input required type="number" name="phone">
						
						<p>Address:</p>
						<input name="adress">
						
						<button type="submit">Submit</button>
					</form>
				</div>
		</div>
		

</body>
</html>