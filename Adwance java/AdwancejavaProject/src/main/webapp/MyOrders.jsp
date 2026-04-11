<%@ page import="java.util.*, com.atul.Order.Order, com.atul.Order.OrderDAO" %>
<%
    String userName = (String) session.getAttribute("userName");

    if (userName == null) {
        response.sendRedirect("login.jsp");
        return;
    }

    List<Order> orders = OrderDAO.getOrdersByUser(userName);
%>

<!DOCTYPE html>
<html>
<head>
<title>My Orders</title>

<style>
body{
    margin:0;
    font-family: Arial, Helvetica, sans-serif;
    background:#f1f5f9;
}

.container{
    width:90%;
    max-width:1100px;
    margin:40px auto;
    background:white;
    padding:25px;
    border-radius:12px;
    box-shadow:0 10px 30px rgba(0,0,0,.15);
}

h2{
    text-align:center;
    margin-bottom:25px;
    color:#1e293b;
}

table{
    width:100%;
    border-collapse:collapse;
}

th{
    background:#2563eb;
    color:white;
    padding:12px;
    font-size:15px;
}

td{
    padding:12px;
    text-align:center;
    border-bottom:1px solid #e5e7eb;
    font-size:14px;
}

tr:hover{
    background:#f8fafc;
}

.price{
    font-weight:bold;
    color:#16a34a;
}

.payment{
    padding:5px 10px;
    border-radius:6px;
    background:#e0f2fe;
    color:#0369a1;
    font-size:13px;
}

.back{
    display:inline-block;
    margin-top:20px;
    text-decoration:none;
    background:#2563eb;
    color:white;
    padding:10px 20px;
    border-radius:8px;
}

.back:hover{
    background:#1e40af;
}

.cancel-btn{
    background:#dc2626;
    color:white;
    border:none;
    padding:6px 14px;
    border-radius:6px;
    cursor:pointer;
    font-size:13px;
}

.cancel-btn:hover{
    background:#b91c1c;
}

</style>
</head>

<body>

<div class="container">
    <h2> My Orders</h2>

    <table>
        <tr>
            <th>Order ID</th>
            <th>Product ID</th>
            <th>Price</th>
            <th>Payment</th>
            <th>Order Time</th>
            <th>Action</th>
            
        </tr>

        <%
            for (Order o : orders) {
        %>
        <tr>
            <td><%= o.getOrderId() %></td>
            <td><%= o.getProductId() %></td>
            <td class="price">Rs<%= o.getPrice() %></td>
            <td><span class="payment"><%= o.getPaymentMode() %></span></td>
            <td><%= o.getOrderTime() %></td>
         
  
            
     <td>
    <form action="<%=request.getContextPath()%>/cancelOrder" method="post"
          onsubmit="return confirm('Are you sure you want to cancel this order?');">
        <input type="hidden" name="orderId" value="<%= o.getOrderId() %>">
        <button type="submit" class="cancel-btn">Cancel</button>
    </form>
	</td>
	
	
            
        </tr>
        <%
            }
        %>
    </table>

    <div style="text-align:center;">
        <a href="<%= request.getContextPath() %>/products" class="back"> Back to Shop</a>
    </div>
</div>

</body>
</html>
