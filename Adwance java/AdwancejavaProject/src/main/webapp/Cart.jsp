<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.util.ArrayList" %>
<%@ page import="com.atul.ProductList.Product" %>

<%
    ArrayList<Product> cart = (ArrayList<Product>) session.getAttribute("cart");
    Integer totalPrice = (Integer) session.getAttribute("totalPrice");

    String userName = (String) session.getAttribute("userName");
    if(userName == null){
        userName = "Guest";
    }
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My Cart</title>

<style>
    body{
        font-family: Arial, sans-serif;
        background:#f4f6f9;
        padding:20px;
    }

    h2{
        text-align:center;
        margin-bottom:20px;
    }

    table{
        width:100%;
        border-collapse:collapse;
        background:white;
        box-shadow:0 4px 8px rgba(0,0,0,0.1);
    }

    th{
        background:#2c3e50;
        color:white;
        padding:12px;
    }

    td{
        padding:10px;
        text-align:center;
        border-bottom:1px solid #ddd;
    }

    tr:hover{
        background:#f1f1f1;
    }

    img{
        border-radius:6px;
    }

    .btn{
        padding:8px 14px;
        border-radius:6px;
        border:none;
        font-weight:bold;
        cursor:pointer;
        transition:0.3s;
    }

    .btn-remove{
        background:#e74c3c;
        color:white;
    }

    .btn-buy{
        background:#27ae60;
        color:white;
    }

    .empty{
        padding:20px;
        font-size:18px;
        color:#777;
    }

    .home-link{
        display:inline-block;
        margin-top:20px;
        text-decoration:none;
        font-weight:bold;
        color:#2980b9;
    }

    /* 🔥 TOTAL PRICE BOX */
    .total-box{
        margin-top:20px;
        padding:15px;
        background:white;
        box-shadow:0 4px 8px rgba(0,0,0,0.1);
        text-align:right;
        font-size:20px;
        font-weight:bold;
    }
</style>

</head>
<body>

<h2>🛒 My Cart</h2>

<table>
<tr>
    <th>User</th>
    <th>Product ID</th>
    <th>Name</th>
    <th>Image</th>
    <th>Price</th>
    <th>Remove</th>
    <th>Buy</th>
</tr>

<%
if(cart != null && !cart.isEmpty()){
    for(int i=0; i<cart.size(); i++){
        Product p = cart.get(i);
%>

<tr>
    <td><%= userName %></td>
    <td><%= p.getProductId() %></td>
    <td><%= p.getProductName() %></td>
    <td>
        <img src="<%= p.getProductImage() %>" width="80" height="80">
    </td>
    <td>₹ <%= p.getProductPrice() %></td>

    <td>
        <form action="Pservlet" method="post">
            <input type="hidden" name="action" value="remove">
            <input type="hidden" name="index" value="<%= i %>">
            <button class="btn btn-remove">Remove</button>
        </form>
    </td>

    <td>
        <form action="Pservlet" method="post">
            <input type="hidden" name="action" value="buy">
            <input type="hidden" name="index" value="<%= i %>">
            <button class="btn btn-buy">Buy</button>
        </form>
    </td>
</tr>

<%
    }
}else{
%>

<tr>
    <td colspan="7" class="empty">Your cart is empty 🛒</td>
</tr>

<% } %>
</table>

<% if(totalPrice != null && totalPrice > 0){ %>
    <div class="total-box">
        Total Price : ₹ <%= totalPrice %>
    </div>
<% } %>

 <% if(cart != null && !cart.isEmpty()){ %>
    <form action="Pservlet" method="post" style="text-align:right; margin-top:10px;">
        <input type="hidden" name="action" value="buyAll">
        <button class="btn btn-buy">Buy All Products</button>
    </form>
<% } %>


<a href="<%= request.getContextPath() %>/products" class="home-link">
    ← Continue Shopping
</a>

</body>
</html>
