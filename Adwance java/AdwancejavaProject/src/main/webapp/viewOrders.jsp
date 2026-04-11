<%@ page import="java.util.*,com.atul.Order.Order, com.atul.Order.OrderDAO" %>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>My Orders</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<style>
    body{
        margin:0;
        font-family: "Segoe UI", Arial, sans-serif;
        background:#f1f5f9;
        padding:30px;
    }

    h2{
        text-align:center;
        margin-bottom:25px;
        color:#0f172a;
    }

    .table-container{
        max-width:1000px;
        margin:auto;
        background:#fff;
        border-radius:12px;
        box-shadow:0 12px 30px rgba(0,0,0,0.12);
        overflow:hidden;
    }

    table{
        width:100%;
        border-collapse:collapse;
    }

    thead{
        background:#0f172a;
        color:white;
    }

    th, td{
        padding:14px 12px;
        text-align:center;
        font-size:14px;
    }

    th{
        text-transform:uppercase;
        letter-spacing:0.5px;
        font-size:13px;
    }

    tbody tr{
        border-bottom:1px solid #e5e7eb;
        transition:background 0.2s;
    }

    tbody tr:hover{
        background:#f8fafc;
    }

    .price{
        font-weight:bold;
        color:#16a34a;
    }

    .payment{
        font-weight:600;
        color:#2563eb;
    }

    .empty{
        text-align:center;
        padding:30px;
        font-size:16px;
        color:#64748b;
    }

    .top-actions{
        max-width:1000px;
        margin:0 auto 20px;
        display:flex;
        justify-content:space-between;
        align-items:center;
    }

    .back-btn{
        text-decoration:none;
        padding:10px 16px;
        background:#16a34a;
        color:white;
        border-radius:8px;
        font-size:14px;
        transition:0.3s;
    }

    .back-btn:hover{
        background:#138d3a;
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
.btn{
       background:green;
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

<div class="top-actions">
    <h2> My Orders</h2>
   <a href="<%= request.getContextPath() %>/adminProducts" class="btn" > Back Admin Products</a>
</div>

<div class="table-container">
<table>
    <thead>
        <tr>
            <th>Order ID</th>
            <th>User</th>
            <th>Product ID</th>
            <th>Price</th>
            <th>Payment</th>
            <th>Date</th>
            <th>Action</th>
        </tr>
    </thead>

    <tbody>
<%
	 List<Order> orders = OrderDAO.getAllOrders();

    if(orders != null && !orders.isEmpty()){
        for(Order o : orders){
%>
        <tr>
            <td>#<%= o.getOrderId() %></td>
            <td><%= o.getUserName() %></td>
            <td><%= o.getProductId() %></td>
            <td class="price">Rs.<%= o.getPrice() %></td>
            <td class="payment"><%= o.getPaymentMode() %></td>
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
    } else {
%>
        <tr>
            <td colspan="6" class="empty">No orders found </td>
        </tr>
<%
    }
%>
    </tbody>
</table>
</div>

</body>
</html>
