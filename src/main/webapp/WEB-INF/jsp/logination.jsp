<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body background="img/bg.jpg">

ƒ<h1>Write your login, password to continue...</h1>
<form action = "Controller" method="post">
login:
<input type = "text" name = "login" value =""/>
<hr>
password:
<input type = "text" name = "password" value =""/>
<hr>
<input type="hidden" name = "command" value = "login">
<input type="submit" value="Login" />
</form>

<h3>Back to 
<a href="MyController?command=main">main page</a>  </h3>
</body>
</html>