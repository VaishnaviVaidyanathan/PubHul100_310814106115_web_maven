<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
</head>
<a href="home.jsp">HOME</a>
<body bgcolor="pink">
<form action="RegisterServlet" method="post">
<font size=7>
Name<input type="text" name="name"><br>
Email<input type="email" name="email_id"><br>
Password<input type="password" name="password"><br>
<button type="submit">Register</button>
</font>
</form>
</body>
</html>