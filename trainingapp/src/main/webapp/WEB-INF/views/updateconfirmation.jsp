<%@page import="com.te.dtolayer.Trainees"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%
    String message = (String)request.getAttribute("message");	
    Trainees trainee =(Trainees)request.getAttribute("updatedTrainee");
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%=message %>
<%=trainee.getEmailAddress() %>
<%=trainee.getPassword() %>
</body>
</html>