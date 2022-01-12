<%@page import="com.te.dtolayer.Trainees"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%
	Trainees trainee =   (Trainees)request.getAttribute("traineeFromDb");
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
UserId                     : <%=trainee.getUserId() %> <br>
Username                 : <%=trainee.getUsername() %> <br>
EmailAddress           : <%=trainee.getEmailAddress() %> <br>
Mobile                      : <%=trainee.getMobile() %> <br>
Password                  : <%=trainee.getPassword() %> <br>
</body>
</html>