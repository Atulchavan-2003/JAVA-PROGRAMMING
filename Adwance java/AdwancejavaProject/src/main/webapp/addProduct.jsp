<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
    
    String role = (String) session.getAttribute("role");
    if (role == null || !"ADMIN".equals(role)) {
        session.setAttribute("msg", "Access denied. Admin only.");
        response.sendRedirect("login.jsp");
        return;
    }
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Product</title>

<style>
    body {
        font-family: Arial;
        background: #f2f2f2;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
    }
    .box {
        background: white;
        padding: 25px;
        width: 350px;
        border-radius: 8px;
        box-shadow: 0 0 10px rgba(0,0,0,0.2);
    }
    input, button {
        width: 100%;
        padding: 10px;
        margin: 8px 0;
    }
    button {
        background: #2196F3;
        color: white;
        border: none;
        cursor: pointer;
    }
</style>
</head>

<body>

<div class="box">
    <h2>Add Product</h2>

   <form action="<%=request.getContextPath()%>/ProductManagementServlet" method="post">

    	<!-- <input type="text" name="productId" placeholder="Product Id" required> -->
        <input type="text" name="productName" placeholder="Product Name" required>
        <input type="text" name="productPrice" placeholder="Price" required>
        <input type="text" name="productImage" placeholder="Image URL" required>
         <input type="hidden" name="action" placeholder="addProduct"  value ="addProduct"required>

        <button type="submit">Add Product</button>
       
    </form>
   <%--  <form action="<%=request.getContextPath()%>/ProductManagementServlet" method ="post">
    	<label>
    		<input type="hidden" name="action" placeholder="addProduct"  value ="showProduct"required>
      		<button type="submit">Check Added Product ON Home</button>
    	</label>
    </form> --%>
    <%
    		String productAdd = (String)session.getAttribute("ProductAdd");
    		if(productAdd!= null){
    %>
    
    	<div style ="color:green"><%= productAdd %></div>
    	
    		
    	<% 
    		}
    	%>
    	
    	<a ref="Product.jsp"></a>
    	
</div>

</body>
</html>
