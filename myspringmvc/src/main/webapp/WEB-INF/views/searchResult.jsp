<%@page import="com.te.dtos.UserDetails"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  
    
    <%
	/* int uid = (Integer) request.getAttribute("userId");
	String uname = (String) request.getAttribute("name");
	String ukey = (String) request.getAttribute("secretKey"); */

	UserDetails ud =(UserDetails)request.getAttribute("userData");
	
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h3> Good Evening <%=ud.getUserName()%>, Below are the details you have entered!!!</h3>
<em >UserId = <%=ud.getEmpId()%> <br>
UserName = <%=ud.getUserName()%><br> 
User Password= <%=ud.getPasskey() %> <br>
</em>
</body>
</html>