<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>add-course</title>
</head>
<body>
	<h1>add new course</h1>
		<div>
				<div>
					<form action="/courses" method="post">
						<p>Course Name:</p>
						<input name="name">
						<p>Category:</p>
						<input name="category">
						
					
						<button type="submit">Submit</button>
					</form>
				</div>
		</div>
		

</body>
</html>