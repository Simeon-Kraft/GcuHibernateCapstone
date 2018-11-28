<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<title>courses</title>
</head>
<body>
	<h1>Courses</h1>
	<div>
		<p><a href="add-course"><button type="submit">add course</button></a></p>
		<p><a href="student-list"><button type="submit">see students</button></a></p>
		<div>
			<table>
				<thead>
					<tr>
						<th>Name</th>
						<th>Category</th>
					</tr>
				</thead>
				<c:forEach var="course" items="${ list }">
					<tr>
						<td>${ course.name }</td>
						<td>${ course.category }</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>

</body>
</html>