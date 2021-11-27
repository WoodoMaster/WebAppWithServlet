<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
String reginfo =(String) request.getAttribute("registrationInfo");
if(reginfo!=null){
%>

<h2>
<%
out.print(reginfo);
}
%>

</h2>

<%
String reginfoAttr =(String) request.getParameter("registrationInfo");
if(reginfoAttr!=null){
%>

<h2>
<%
out.print(reginfoAttr);
}
%>

</h2>

<%
String userName =(String) request.getAttribute("userName");
if(userName!=null){
%>

<h2>
<%
out.print("Hello! " + userName);
}
%>

</h2>



<h3>!!!!!!!!!!!!!!!!!!!</h3>
</body>
</html>