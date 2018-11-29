<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>student-page</title>
</head>
<body>
	<h1>Hello ${ student.firstName }</h1>
		<div>
			<h3>Here are the courses you've taken</h3>
			<table>
				<thead>
					<tr>
						<th>Name</th>
						<th>Semester</th>
						<th>Grade</th>
					</tr>
				</thead>
				<c:forEach var="enrollment" items="${ list }">
					<tr>
						<td>${ enrollment.course.name }</td>
						<td>${ enrollment.semester }</td>
						<td>${ enrollment.grade }</td>
					</tr>
				</c:forEach>
			</table>
		</div>

</body>
</html>