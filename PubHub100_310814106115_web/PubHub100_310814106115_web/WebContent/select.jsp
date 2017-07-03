<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View by name</title>
</head>
<body>
<body bgcolor="yellow">
<font size=5>
	<table border=1>
		<thead>
			<tr>
				<th>name</th>
				<th>price</th>
		<tbody>
			<c:forEach var="book" items="${books}">
				<tr>
					<td>${book.name}</td>
					<td>${book.price }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	</font>
</body>
</html>