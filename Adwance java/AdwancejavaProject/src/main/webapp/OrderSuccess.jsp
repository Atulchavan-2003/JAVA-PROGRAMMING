<%@ page import="com.atul.Order.Order" %>
<%
    Order order = (Order) session.getAttribute("order");
%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Order Success</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<style>
    body{
        margin:0;
        font-family: "Segoe UI", Arial, sans-serif;
        background: linear-gradient(135deg, #e6f7ec, #f1f5f9);
        display:flex;
        justify-content:center;
        align-items:center;
        min-height:100vh;
    }

    .success-card{
        width:420px;
        background:#fff;
        border-radius:14px;
        padding:30px;
        box-shadow:0 15px 40px rgba(0,0,0,0.15);
        text-align:center;
        animation: fadeIn 0.6s ease;
    }

    @keyframes fadeIn{
        from{opacity:0; transform:translateY(20px);}
        to{opacity:1; transform:translateY(0);}
    }

    .success-icon{
        font-size:60px;
        color:#16a34a;
        margin-bottom:10px;
    }

    h2{
        margin:10px 0 20px;
        color:#0f172a;
    }

    .details{
        text-align:left;
        margin:20px 0;
        border-top:1px solid #e5e7eb;
        border-bottom:1px solid #e5e7eb;
        padding:15px 0;
    }

    .row{
        display:flex;
        justify-content:space-between;
        margin:8px 0;
        font-size:15px;
        color:#334155;
    }

    .row span{
        font-weight:600;
        color:#0f172a;
    }

    .price{
        font-size:20px;
        font-weight:bold;
        color:#16a34a;
    }

    .actions{
        margin-top:25px;
        display:flex;
        gap:12px;
    }

    .btn{
        flex:1;
        padding:12px;
        border-radius:8px;
        text-decoration:none;
        font-size:15px;
        font-weight:600;
        text-align:center;
        transition:0.3s;
    }

    .btn-shop{
        background:#2563eb;
        color:white;
    }

    .btn-shop:hover{
        background:#1e40af;
    }

    .btn-orders{
        background:#16a34a;
        color:white;
    }

    .btn-orders:hover{
        background:#138d3a;
    }

    .footer-text{
        margin-top:15px;
        font-size:13px;
        color:#64748b;
    }
</style>
</head>

<body>

<%
if(order != null){
%>
    <div class="success-card">
        <div class="success-icon">DONE</div>
        <h2>Order Placed Successfully!</h2>

        <div class="details">
            <div class="row">
                <div>User</div>
                <span><%= order.getUserName() %></span>
            </div>
            <div class="row">
                <div>Product ID</div>
                <span>#<%= order.getProductId() %></span>
            </div>
            <div class="row">
                <div>Payment Mode</div>
                <span><%= order.getPaymentMode() %></span>
            </div>
            <div class="row">
                <div>Order Time</div>
                <span><%= order.getOrderTime() %></span>
            </div>
            <div class="row price">
                <div>Total</div>
                <span>RS.<%= order.getPrice() %></span>
            </div>
        </div>

        <div class="actions">
            <a href="<%= request.getContextPath() %>/products" class="btn btn-shop">Continue Shopping</a>
            <a href="MyOrders.jsp" class="btn btn-orders">My Orders</a>
        </div>

        <div class="footer-text">
            Thank you for shopping with us 
        </div>
    </div>
<%
}else{
%>
    <h3>Order information not found.</h3>
<%
}
%>

</body>
</html>
