<%@page import="java.util.Date"%>
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
	int i=25;
%>
<%=20*20 %>
<br/>
<%=new Date() %><br/>
<%=i %>
<BR/>

<%

	//request.getParameter("");
	//response.setContentType("text/html");
	out.print("Hello world");

%>
</body>
</html>