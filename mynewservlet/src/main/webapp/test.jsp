<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  %>
    <%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Testing JSP</title>
</head>
<body>
<% 
String userName = request.getParameter("username");
if(userName != null){
	session.setAttribute("sessionUserName", userName);
	application.setAttribute("applicationUserName", userName);
}
%>
The userName in request object is : <%=userName %><br>
The userName in session object is : <%=session.getAttribute("sessionUserName") %><br>
The userName in application object is : <%=application.getAttribute("applicationUserName") %><br>

<%@ include file="/hello.jsp" %><br>
The current time is : <%=new Date()%>

</body>
</html>