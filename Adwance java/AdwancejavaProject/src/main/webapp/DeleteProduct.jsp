<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*, com.atul.ProductList.Product,com.atul.Management.ProductDAO" %>

<%
   
    String role = (String) session.getAttribute("role");
    if (role == null || !role.equals("ADMIN")) {
        response.sendRedirect("login.jsp");
        return;
    }

    List<Product> products = ProductDAO.getAllProducts();
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete Product</title>

<style>
table {
    width: 80%;
    margin: auto;
    border-collapse: collapse;
}
th, td {
    padding: 10px;
    border: 1px solid #ccc;
}
th {
    background: #1e293b;
    color: white;
}
button {
    background: red;
    color: white;
    border: none;
    padding: 6px 12px;
    cursor: pointer;
}

 .msg {
        width: 50%;
        margin: 50px auto;
        padding: 15px;
        background-color: #d4edda;
        color: #155724;
        border: 1px solid #c3e6cb;
        border-radius: 5px;
        text-align: center;
        font-size: 18px;
    }
</style>
</head>

<body>

<h2 style="text-align:center;">❌ Delete Product</h2>

	<h2>
	
<%
    String msg = (String) session.getAttribute("msgdelete");
    if (msg != null) {
%>
        <div class="msg">
            <%= msg %>
        </div>
<%
        session.removeAttribute("msgdelete"); 
    }
%>
	
	
	
	</h2>
<table>
<tr>
    <th>ID</th>
    <th>Name</th>
    <th>Price</th>
    <th>Image</th>
    <th>Action</th>
</tr>

<%
if (products != null && !products.isEmpty()) {
    for (Product p : products) {
%>
<tr>
    <td><%= p.getProductId() %></td>
    <td><%= p.getProductName() %></td>
    <td>₹<%= p.getProductPrice() %></td>
    <td>
        <img src="<%= p.getProductImage() %>" width="60">
    </td>
    <td>
        <form action="<%= request.getContextPath() %>/DeleteProductServlet" method="post">
            <input type="hidden" name="productId" value="<%= p.getProductId() %>">
            <button type="submit" onclick="return confirm('Are you sure?')">
                Delete
            </button>
        </form>
    </td>
</tr>
<%
    }
} else {
%>
<tr>
    <td colspan="5" style="text-align:center;">No products found</td>
</tr>
<%
}
%>

</table>

</body>
</html>
