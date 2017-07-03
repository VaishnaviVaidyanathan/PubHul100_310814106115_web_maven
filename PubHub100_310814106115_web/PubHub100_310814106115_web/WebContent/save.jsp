<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Save</title>
</head>
<body bgcolor="yellow">
<form action="SaveServlet" method="GET" >
<font size=5>
 <p>INSERT A NEW BOOK</p>
Name<input type="text" name="name"><br>
Price<input type="text" name="price"><br>
<button type="submit">Save</button>
<a href="home.jsp">HOME</a><br>
<a href="success.jsp">LIST</a>
</font>
</form>
</body>
</html>