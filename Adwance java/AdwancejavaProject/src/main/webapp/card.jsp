<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Card Payment</title>
<style>
body{font-family:Arial;background:#f1f5f9}
.box{
    width:420px;
    margin:60px auto;
    background:white;
    padding:25px;
    border-radius:10px;
}
input,button{
    width:100%;
    padding:10px;
    margin:8px 0;
}
button{
    background:#2563eb;
    color:white;
    border:none;
}
.error{color:red}
</style>
</head>

<body>

<div class="box">
    <h2>💳 Enter Card Details</h2>

    <% if(request.getAttribute("error")!=null){ %>
        <p class="error"><%= request.getAttribute("error") %></p>
    <% } %>

    <form action="CardServlet" method="post">

        
        <input type="hidden" name="productId" value="<%= request.getParameter("productId") %>">
        <input type="hidden" name="productName" value="<%= request.getParameter("productName") %>">
        <input type="hidden" name="productPrice" value="<%= request.getParameter("productPrice") %>">
        <input type="hidden" name="paymentMode" value="CARD">

        <input type="text" name="cardNumber" placeholder="Card Number" required>
        <input type="text" name="cardName" placeholder="Card Holder Name" required>
        <input type="text" name="expiry" placeholder="MM/YY" required>
        <input type="password" name="cvv" placeholder="CVV" required>

        <button type="submit">Place Order</button>
    </form>
</div>

</body>
</html>
