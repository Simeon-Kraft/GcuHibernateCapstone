<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<title>students</title>
</head>
<body>
	<h1>Students</h1>
	<div>
		<p><a href="courses"><button type="submit">courses</button></a></p>
		<p><a href="add-student"><button type="submit">add student</button></a></p>
		<div>
			<table>
				<thead>
					<tr>
						<th>First Name</th>
						<th>Last Name</th>
						<th>Phone Number</th>
					</tr>
				</thead>
				<c:forEach var="student" items="${ list }">
					<tr>
						<td>${ student.firstName }</td>
						<td>${ student.lastName }</td>
						<td>${ student.phone }</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>

</body>
</html>