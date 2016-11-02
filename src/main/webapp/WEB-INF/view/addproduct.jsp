<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>       
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Inventory | Add Product</title>
</head>
<body>
	<div align="center">
		<h1>Add a Product</h1>
	</div>
    <form:form method="POST" action="saveproduct">
        <div align="center">
            <table>
                <tr>
                    <td>Name</td>
                    <td><form:input path="name" /></td>
                </tr>
                <tr>
                    <td>Description</td>
                    <td><form:input path="description" /></td>
                </tr>
                <tr>
                    <td>Price</td>
                    <td><form:input path="price" /></td>
                </tr>
                <tr>
                    <td>Category</td>
                    <td><form:input path="category" /></td>
                </tr>
                <tr>
                    <td>Category Path</td>
                    <td><form:input path="categoryPath" /></td>
                </tr>
                <tr>
                    <td>Supplier</td>
                    <td><form:input path="supplier" /></td>
                </tr>                
                <tr>
                    <td></td>
                    <td><input type="submit" value="Add Product" /></td>
                </tr>
            </table>
        </div>
    </form:form>
</body>
</html>