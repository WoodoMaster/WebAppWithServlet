<%@ page contentType="text/html;charset=utf-8" %>
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv = "Content-Type"
	content = "text/html; charset=utf-8">
<title> Welcome to my site! </title>
</head>
<body bgcolor="#c0c0c0" background="img/bg.jpg" >
<h3>Glad to see you!</h3>
<hr>
<form action = "MyController" method="get">
<input type="hidden" name = "command" value = "logination">
<input type="submit" value="Login Page" />
</form>
<hr>
<hl> 
<a href="MyController?command=logination">Login</a> 

<h3>If you are new user, go to 
<hr>
<form action = "MyController" method="get">
<input type="hidden" name = "command" value = "registration">
<input type="submit" value="Registration page" />
</form>
<hr>
<a href="MyController?command=registration">Registration page</a> </h3>
</body>
</html>