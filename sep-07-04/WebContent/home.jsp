<%@page import="model.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<jsp:include page="menu.jsp"></jsp:include>
<div class="jumbotron text-center">
  <h1>My First Servlet JSP Crud Project</h1>
  <p>We use most of the techniques in this project!</p> 
</div>
  
<div class="container">
  <div class="row">
    <div class="col-sm-4">
      <h3></h3>
      
    </div>
    <div class="col-sm-4">
    <%
    	HttpSession session1=request.getSession();
    	User user=(User)session1.getAttribute("user");
    	if(user!=null)
    	{
    		String str=user.getFirstName();
    		out.println("<h3>Welcome "+ str
    		+"!</h3>");
    	}else
    	{
    		out.println("You have not logged in. Click <a href=login.jsp> here </a>to go to login page!");
    	}
    
    %>
      
      
    </div>
    <div class="col-sm-4">
      <h3></h3>        
      
    </div>
  </div>
</div>

<br/>
<br/>
<br/>
<br/>
<br/>
<br/>


</body>
</html>