<%@page import="model.Product"%>
<%@page import="java.util.List"%>
<%@page import="model.ProductDaoImpl"%>
<%@page import="model.ProductDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
      <h3>Product Page!</h3>
      <form method="POST" action="ps" enctype="multipart/form-data">
      	Id: <input type="number" name="id" class="form-control" />
      	Name: <input type="text" name="name" class="form-control" />
      	Price: <input type="number" name="price" class="form-control" />
      	Pic: <input type="file" name="pic" class="form-control" />
      	<br/>
      	<input type="submit" class="btn btn-success" />
      	&nbsp;
      	<input type="reset" class="btn btn-warning" />
      </form>
    </div>
    <div class="col-sm-4">
      <h3></h3>        
      
    </div>
  </div>
</div>
<hr/>
<%
ProductDao pdao=new ProductDaoImpl();
List<Product> products=pdao.getAllProducts();
session.setAttribute("products", products);
%>

 <div class="row">
    <div class="col-sm-2">
      <h3></h3>
      
    </div>
    <div class="col-sm-8">
      <h3 class="text-center">The list of Products already present in our db</h3>
      <table class="table table-bordered table-striped table-hover">
      	<thead>
      		<tr>
      			<th>Id</th><th>Name</th><th>Price</th><th>Pic</th>
      		</tr>
      	</thead>
      	<tbody>
      		<c:forEach var="p" items="${products }">
      			<tr>
      				<td>${p.id }</td>
      				<td>${p.name }</td>
      				<td>${p.price }</td>
      				<td><img width="75" height="75" src="data:image/jpg;base64,${p.pic1 }" /></td>
      			</tr>
      		</c:forEach>
      	</tbody>
      </table>
    </div>
    <div class="col-sm-2">
      <h3></h3>
      
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