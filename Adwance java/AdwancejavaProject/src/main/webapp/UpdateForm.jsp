<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="com.atul.ProductList.Product" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Product</title>

<style>
    body{
        font-family: Arial, Helvetica, sans-serif;
        background:#f2f2f2;
    }
    .container{
        width:400px;
        margin:60px auto;
        background:white;
        padding:20px;
        border-radius:8px;
        box-shadow:0 0 10px rgba(0,0,0,0.2);
    }
    input{
        width:100%;
        padding:8px;
        margin:8px 0;
    }
    button{
        width:100%;
        padding:10px;
        background:green;
        color:white;
        border:none;
        cursor:pointer;
        font-size:16px;
    }
</style>

</head>
<body>

<div class="container">
    <h2>Update Product</h2>
		
<%
    Product product = (Product) request.getAttribute("product");
   if(product!=null){
%>
    <form action="updateProduct" method="post">

       
        <input type="hidden" name="productId"
               value="<%= product.getProductId() %>">

        Product Name:
        <input type="text" name="productName"
               value="<%= product.getProductName() %>" required>

        Product Image:
        <input type="text" name="productImage"
               value="<%= product.getProductImage() %>" required>

        Product Price:
        <input type="text" name="productPrice"
               value="<%= product.getProductPrice() %>" required>

        <button type="submit">Update Product</button>
    </form>
    <%
    }else{%>
    <h1>product is null</h1>
    <%
    }%>
</div>

</body>
</html>
