<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit</title>
</head>
<body bgcolor="yellow">
<form action="EditServlet" method="GET" >
<font size=5>
Id<input type="text" name="id"><br>
Price<input type="text" name="price"><br>
<button type="submit">Edit</button>
<a href="home.jsp">HOME</a><br>
<a href="success.jsp">LIST</a>
</font>
</form>
</body>
</html>