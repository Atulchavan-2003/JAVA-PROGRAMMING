<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<html>
<head>
<title>Product Details</title>
<style>
body{font-family:Arial;background:#f4f4f4}
.card{
    background:white;
    width:400px;
    margin:40px auto;
    padding:20px;
    border-radius:10px;
    box-shadow:0 4px 10px rgba(0,0,0,.2);
}
.card img{width:100%;height:250px;object-fit:cover}
.price{color:green;font-size:20px;font-weight:bold}
</style>
</head>
<body>

<div class="card">
    <img src="<%= request.getParameter("image") %>">
    <h2><%= request.getParameter("name") %></h2>
    <div class="price">₹<%= request.getParameter("price") %></div>
<%--     <p><%= request.getParameter("desc") %></p> --%>

    <a href="Product.jsp">⬅ Back to Products</a>
</div>

</body>
</html>
