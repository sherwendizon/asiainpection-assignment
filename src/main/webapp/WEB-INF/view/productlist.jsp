<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>       
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Inventory | Product List</title>
</head>
<body>
	<div align="center">
		<h1>Product List</h1>
		<table border="2" width="70%" cellpadding="2">  
		<tr>
			<th>Product ID</th>
			<th>Name</th>
			<th>Description</th>
			<th>Price</th>
			<th>Category</th>
			<th>Category Path</th>
			<th>Supplier</th>						
			<th>Edit</th>
			<th>Delete</th>
		</tr>  
		<c:forEach var="product" items="${list}">   
			<tr>  
				<td>${product.product_id}</td> 
				<td>${product.name}</td> 			 
				<td>${product.description}</td>  
				<td>${product.price}</td>  
				<td>${product.category}</td>
				<td>${product.categoryPath}</td> 
				<td>${product.supplier}</td>								  
				<td><a href="/Inventory/editproduct/${product.product_id}">Edit</a></td>  
				<td><a href="/Inventory/deleteproduct/${product.product_id}">Delete</a></td> 
			</tr>  
		</c:forEach>  
		</table>  
		<br/>  
		<a href="/Inventory/addproduct">Add New Product</a> 
	</div> 
</body>
</html>