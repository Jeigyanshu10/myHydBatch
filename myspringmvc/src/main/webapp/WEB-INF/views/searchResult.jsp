<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%
	String user = (String) request.getAttribute("myuserId");
    
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Good Evening mates!!!</h1>
Entered UserId = <%=user %> 

</body>
</html>