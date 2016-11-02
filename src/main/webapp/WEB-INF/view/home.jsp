<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Inventory Home</title>
</head>
<body>
	<div align="center">
		<h1>Welcome ${username}!</h1>
		<h3>Menu</h3>
		<ul>
			<li><a href="/Inventory/productlist">Your Products</a></li>
			<li><a href="/Inventory/addproduct">Add a new Product</a></li>
		</ul>		
	</div>
</body>
</html>