<%@page import="com.te.dtolayer.Trainees"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%
    	String message = (String) request.getAttribute("msg");
    	Trainees trainee = (Trainees)request.getAttribute("savedtrainee");
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

</head>
<body>
Dear vistor,
<%=message %>. Below are the details entered. Please verify the same.<br>
<%=trainee.getUsername() %><br>
<%=trainee.getEmailAddress()%><br>
<%=trainee.getMobile() %><br>

</body>
</html>