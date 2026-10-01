<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
   <style type="text/css">
 			/* common button style */
.btn{
    padding: 8px 16px;
    border-radius: 6px;
    border: none;
    font-size: 14px;
    font-weight: bold;
    cursor: pointer;
    transition: all 0.3s ease;
}

/* Remove button */
.btn-remove{
    background-color: #e74c3c;   /* red */
    color: white;
}

.btn-remove:hover{
    background-color: #c0392b;
    transform: scale(1.05);
}

/* Buy button */
.btn-buy{
    background-color: #27ae60;   /* green */
    color: white;
}

.btn-buy:hover{
    background-color: #1e8449;
    transform: scale(1.05);
}
 			
   </style>

</head>
<body>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.atul.ProductList.Product" %>

<%
    ArrayList<Product> cart = (ArrayList<Product>) session.getAttribute("cart");
%>

<h2>My Cart</h2>
<table border="1" cellpadding="10">
<tr>
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
    <td><%= p.getProductName() %></td>
    <td><img src="<%= p.getImage() %>" width="80"></td>
    <td>₹ <%= p.getPrice() %></td>

   
    <td>
        <form action="ProductServlet" method="post">
            <input type="hidden" name="action" value="remove">
            <input type="hidden" name="index" value="<%= i %>">
            <button class="btn btn-remove">Remove</button>
        </form>
    </td>

  
    <td>
        <form action="ProductServlet" method="post">
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
<tr><td colspan="5">Cart is empty</td></tr>
<% } %>
</table>

</body>
</html>