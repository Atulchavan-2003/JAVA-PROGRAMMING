<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Dashboard</title>

<style>
   
    * {
        margin: 0;
        padding: 0;
        box-sizing: border-box;
    }

    body {
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        background: #f5f7fa;
        color: #1f2937;
    }

    .header {
        background: linear-gradient(90deg, #2563eb, #3b82f6);
        color: white;
        padding: 20px;
        text-align: center;
        font-size: 28px;
        font-weight: bold;
        letter-spacing: 1px;
        box-shadow: 0 4px 6px rgba(0,0,0,0.1);
    }

    .navbar {
        display: flex;
        justify-content: center;
        gap: 20px;
        background: #1e293b;
        padding: 12px 0;
    }

    .navbar a {
        color: #f1f5f9;
        text-decoration: none;
        font-weight: 600;
        padding: 8px 15px;
        border-radius: 5px;
        transition: background 0.3s, color 0.3s;
    }

    .navbar a:hover {
        background: #2563eb;
        color: white;
    }

    .container {
        display: flex;
        flex-wrap: wrap;
        justify-content: center;
        padding: 40px 20px;
        gap: 25px;
    }

    .card {
        background: white;
        width: 240px;
        padding: 25px 20px;
        border-radius: 12px;
        box-shadow: 0 6px 15px rgba(0,0,0,0.1);
        text-align: center;
        transition: transform 0.3s, box-shadow 0.3s;
    }

    .card:hover {
        transform: translateY(-5px);
        box-shadow: 0 10px 20px rgba(0,0,0,0.15);
    }

    .card h3 {
        font-size: 20px;
        margin-bottom: 15px;
        display: flex;
        align-items: center;
        justify-content: center;
        gap: 8px;
    }

    .card a {
        display: block;
        background: #2563eb;
        color: white;
        padding: 10px;
        border-radius: 8px;
        text-decoration: none;
        margin-top: 10px;
        font-weight: 600;
        transition: background 0.3s;
    }

    .card a:hover {
        background: #1d4ed8;
    }

    .footer {
        background: #1e293b;
        color: #cbd5e1;
        text-align: center;
        padding: 15px;
        margin-top: 40px;
        font-size: 14px;
    }
 
  
    /* @media (max-width: 768px) {
        .container {
            flex-direction: column;
            align-items: center;
        } */
        
        
        
        /* Admin action buttons wrapper */
.admin-actions{
    display: flex;
    gap: 12px;
    justify-content: center;
    margin-top: 15px;
}

.admin-actions form{
    flex: 1;
}

/* Common button style */
.btn{
    width: 100%;
    padding: 10px 0;
    border: none;
    border-radius: 8px;
    font-size: 14px;
    font-weight: 600;
    cursor: pointer;
    transition: all 0.3s ease;
}

/* Update button */
.btn-update{
    background: linear-gradient(135deg, #2563eb, #1d4ed8);
    color: #ffffff;
}

.btn-update:hover{
    background: linear-gradient(135deg, #1d4ed8, #1e40af);
    transform: translateY(-2px);
    box-shadow: 0 6px 12px rgba(0,0,0,0.25);
}

/* Delete button */
.btn-delete{
    background: linear-gradient(135deg, #dc2626, #b91c1c);
    color: #ffffff;
}

.btn-delete:hover{
    background: linear-gradient(135deg, #b91c1c, #991b1b);
    transform: translateY(-2px);
    box-shadow: 0 6px 12px rgba(0,0,0,0.25);
}

/* Mobile responsiveness */
/* @media (max-width: 600px){
    .admin-actions{
        flex-direction: column;
    }
} */
        
    }
</style>
</head>

<body>

<div class="header">
    ADMIN DASHBOARD
</div>

<div class="navbar">
     <!--  <div class="card">
        <h3>👤 Users</h3> -->
        <a href="<%=request.getContextPath()%>/viewUsers">View Users</a>
   <!--  </div> -->

  <!--   <div class="card">
        <h3>📑 Orders</h3> -->
        <a href="<%=request.getContextPath()%>/viewOrders">View Orders</a>
  <!--   </div> -->
    <a href="addProduct.jsp">Add Product</a>
   <!--  <a href="updateProduct.jsp">Update Product</a>
    <a href="DeleteProduct.jsp">Delete Product</a> -->
    <a href="<%=request.getContextPath()%>/logout">Logout</a>
      <%
    String userName = (String) session.getAttribute("userName");
    if (userName != null) {
%>
    <a href="<%= request.getContextPath() %>/profile">Profile</a>
<%
    }
%>
    
</div>

<div class="container">
<%@ page import="java.util.*, com.atul.ProductList.Product" %>

<h2 style="text-align:center;margin-top:30px;">🛒 All Products</h2>

<div class="container">
<%
    List<Product> products =
        (List<Product>) request.getAttribute("products");

    if(products != null && !products.isEmpty()){
        for(Product p : products){
%>

    <div class="card">
        <img src="<%= p.getProductImage() %>" 
             style="width:100%;height:140px;object-fit:contain">

        <h3><%= p.getProductName() %></h3>
        <p><b>₹ <%= p.getProductPrice() %></b></p>

       
    <div class="admin-actions">

        <form action="<%= request.getContextPath() %>/updateProductForm" method="get">
            <input type="hidden" name="productId" value="<%= p.getProductId() %>">
            <button type="submit" class="btn btn-update">
                ✏️ Update
            </button>
        </form>

        <form action="<%= request.getContextPath() %>/DeleteProductServlet" method="post">
            <input type="hidden" name="productId" value="<%= p.getProductId() %>">
            <button type="submit" class="btn btn-delete"
                    onclick="return confirm('Are you sure you want to delete this product?')">
                ❌ Delete
            </button>
        </form>

    </div>



				
      <%--   <a href="DeleteProductServlet?id=<%= p.getProductId() %>"
           style="background:#dc2626;margin-top:8px;">
            ❌ Delete
        </a> --%>
    </div>

<%
        }
    } else {
%>
    <p>No products available</p>
<%
    }
%>
</div>

     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
   <%--  <div class="card">
        <h3>👤 Users</h3>
        <a href="<%=request.getContextPath()%>/viewUsers">View Users</a>
    </div>

    <div class="card">
        <h3>📑 Orders</h3>
        <a href="<%=request.getContextPath()%>/viewOrders">View Orders</a>
    </div> --%>
<%-- 
    <div class="card">
        <h3>💳 Payments</h3>
        <a href="<%=request.getContextPath()%>/viewPayments">Payment Details</a>
    </div> --%>

</div>

<div class="footer">
    © 2025 MyShop | Admin Panel
</div>

</body>
</html>
