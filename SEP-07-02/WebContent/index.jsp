<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="myservlet">
Number 1: <input type="number" name="no1" value="${param.no1 }" /><br/>
Number 2: <input type="number" name="no2" value="${param.no2 }" /><br/>
<input type="submit" />
</form>
<font color="red">	${param.result }	</font>
</body>
<%

	Date dt;
if(true)
{
%>
<p>
</p>


<%
}
%>
</html>