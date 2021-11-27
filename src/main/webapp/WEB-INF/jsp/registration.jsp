<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
import ="com.tc.webapp01.entity.Greeting"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>This is registration page</title>
</head>
<body bgcolor="#c0c0c0" background="img/bg.jpg" >

<%
String errorMsg =(String) request.getAttribute("errorMessage");
if(errorMsg!=null){
%>

<h2>
<%
out.print(errorMsg);
}
%>

</h2>


<%
Greeting obj = (Greeting) request.getAttribute("myobj");
if(obj!=null){
String message = obj.getMessage();

%>
<h1 style="color:red">
<%out.print(message);
} %>
</h1>
<h1>Hello new user! </h1>
 To complete registration write on forms and press "Register" button.

<form action = "Controller" method="post">
Name:
<input type = "text" name = "name" value =""/>
<hr>
Surname:
<input type = "text" name = "surname" value =""/>
<hr>
email:
<input type = "text" name = "email" value =""/>
<hr>
password:
<input type = "text" name = "password" value =""/>
<hr>
<input type="hidden" name = "command" value = "register">
<input type="submit" value="Register" />
</form>
<hr>
<h3>Back to 
<a href="MyController?command=main">main page</a>  </h3>


</body>
</html>