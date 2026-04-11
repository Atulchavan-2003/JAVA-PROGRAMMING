<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*, com.atul.payment.Payment" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Payment Details</title>
<style>
    table {
        border-collapse: collapse;
        width: 90%;
        margin: 20px auto;
    }
    th, td {
        border: 1px solid #333;
        padding: 8px;
        text-align: center;
    }
    th {
        background: #2563eb;
        color: white;
    }
</style>
</head>
<body>

<h2 style="text-align:center;">All Payments</h2>

<table>
    <tr>
        <th>Payment ID</th>
        <th>Order ID</th>
        <th>User Name</th>
        <th>Amount</th>
        <th>Payment Date</th>
    </tr>

<%
    List<Payment> payments = (List<Payment>) request.getAttribute("payments");

    if (payments != null && !payments.isEmpty()) {
        for (Payment p : payments) {
%>
    <tr>
        <td><%= p.getPaymentId() %></td>
        <td><%= p.getOrderId() %></td>
        <td><%= p.getUserName() %></td>
        <td>₹<%= p.getAmount() %></td>
        <td><%= p.getPaymentDate() %></td>
    </tr>
<%
        }
    } else {
%>
    <tr>
        <td colspan="5">No payments found</td>
    </tr>
<%
    }
%>

</table>

</body>
</html>
