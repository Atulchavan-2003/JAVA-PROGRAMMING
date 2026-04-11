<%@page import="com.atul.Management.ProductDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    
    %>
 <%@ page import="java.util.*, com.atul.ProductList.Product" %>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	 <style>
     	
body{
    margin:0;
    font-family: 'Segoe UI', Arial, sans-serif;
    background:#f1f5f9;
}


.header{
    background:linear-gradient(90deg,#0f172a,#1e293b);
    color:white;
    padding:20px;
    font-size:26px;
    font-weight:bold;
    text-align:center;
    position:sticky;
    top:0;
    z-index:100;
}


.navbar{
    background:#020617;
    padding:12px;
    text-align:center;
}

.navbar a{
    color:#e5e7eb;
    margin:0 18px;
    text-decoration:none;
    font-weight:600;
}

.navbar a:hover{
    color:#38bdf8;
}

.container{
    padding:40px;
    display:grid;
    grid-template-columns:repeat(auto-fit,minmax(240px,1fr));
    gap:25px;
}


.product{
    background:white;
    border-radius:15px;
    padding:18px;
    text-align:center;
    box-shadow:0 10px 25px rgba(0,0,0,0.15);
    transition:all .3s ease;
}

.product:hover{
    transform:translateY(-8px);
    box-shadow:0 20px 35px rgba(0,0,0,0.25);
}

.product img{
    width:100%;
    height:180px;
    object-fit:contain;
    margin-bottom:10px;
}

.product h3{
    font-size:18px;
    margin:10px 0;
    color:#020617;
}

.price{
    font-size:20px;
    color:#16a34a;
    font-weight:bold;
    margin-bottom:15px;
}


.actions{
    display:flex;
    justify-content:space-between;
    gap:10px;
}

.product button{
    flex:1;
    padding:10px;
    border:none;
    border-radius:8px;
    font-weight:bold;
    cursor:pointer;
}


.product form:first-child button{
    background:#2563eb;
    color:white;
}

.product form:first-child button:hover{
    background:#1d4ed8;
}


.details-btn{
    background:#16a34a;
    color:white;
}

.details-btn:hover{
    background:#15803d;
}

.footer{
    background:#020617;
    color:#cbd5f5;
    text-align:center;
    padding:18px;
    margin-top:50px;
    font-size:14px;
}
.btn-buy{
    background: linear-gradient(135deg, #22c55e, #16a34a);
    color: white;
    border: none;
    padding: 10px 16px;
    border-radius: 8px;
    font-weight: bold;
    font-size: 14px;
    cursor: pointer;
    transition: all 0.3s ease;
}

.btn-buy:hover{
    background: linear-gradient(135deg, #16a34a, #15803d);
    transform: translateY(-2px);
    box-shadow: 0 6px 12px rgba(0,0,0,0.25);
}

.btn-buy:active{
    transform: scale(0.96);
}



@media(max-width:600px){
    .actions{
        flex-direction:column;
    }
    
}
     		
        
    </style>
</head>

<body>

 <%
String alert = (String) session.getAttribute("showAlert");

if(alert != null){
%>

<script>
alert(" Product Added To Cart Successfully");
</script>

<%
session.removeAttribute("showAlert");
}
%>
 



		

<div class="header">

<div style="text-align:right; 
 		   
 			
  ">
    <form action="<%=request.getContextPath()%>/products" method="get">
        <button type="submit">🔄</button>
    </form>
</div>
   
    MyShop – Online Store
</div>

<div class="navbar">
    <a href="Product.jsp">Home</a>
    
    <a href="Cart.jsp">View Cart</a>
    <%
       String user = (String) session.getAttribute("userName");
    	   if(user == null){
    %>
    <a href="login.jsp">Login</a>
    
    <%} %>
    <a href="<%= request.getContextPath() %>/logout">Logout</a>


    <%
    String userName = (String) session.getAttribute("userName");
    if (userName != null) {
%>
    <a href="<%= request.getContextPath() %>/profile">Profile</a>
<%
    }
%>
    







    <%
    	  
    	   
    String role = (String) session.getAttribute("role");
    if (role != null && role.equals("ADMIN")) {
	%>
 
</div>
    
    
    
	<%
    }
	%>
</div>


<div class="container">

 
<div class="product">
    <img src="IMAGE/APPLE.jpg">
    <h3>Apple iPhone</h3>
    <div class="price">₹79,999</div>

    <div class="actions">
        <form action="Pservlet" method="post">
            <input type="hidden" name="productId" value="1">
            <input type="hidden" name="productName" value="Apple iPhone">
            <input type="hidden" name="productPrice" value="79999">
            <input type="hidden" name="productImage" value="IMAGE/APPLE.jpg">
            <input type="hidden" name="action" value="add">
            <button>Add to Cart</button>
        </form>
        
         
         <form action="Pservlet" method="post">
            <input type="hidden" name="productId" value="1">
            <input type="hidden" name="productName" value="Apple iPhone">
            <input type="hidden" name="productPrice" value="79999">
            <input type="hidden" name="productImage" value="IMAGE/APPLE.jpg">
            <input type="hidden" name="action" value="buyNow">
            <button class="btn-buy">Buy Now</button>
        </form>
        

       <!--  <form action="ProductDetails.jsp" method="get">
            <input type="hidden" name="name" value="Apple iPhone">
            <input type="hidden" name="price" value="79999">
            <input type="hidden" name="image" value="IMAGE/APPLE.jpg">
            <input type="hidden" name="desc" value="Premium Apple smartphone with powerful performance">
            <button class="details-btn">View</button>
        </form> -->
    </div>
</div>

<div class="product">
    <img src="IMAGE/JBL.jpg">
    <h3>JBL Headphones</h3>
    <div class="price">₹2,499</div>

    <div class="actions">
        <form action="Pservlet" method="post">
            <input type="hidden" name="productId" value="2">
            <input type="hidden" name="productName" value="JBL Headphones">
            <input type="hidden" name="productPrice" value="2499">
            <input type="hidden" name="productImage" value="IMAGE/JBL.jpg">
            <input type="hidden" name="action" value="add">
            <button>Add to Cart</button>
        </form>


		 <form action="Pservlet" method="post">
            <input type="hidden" name="productId" value="2">
            <input type="hidden" name="productName" value="JBL Headphones">
            <input type="hidden" name="productPrice" value="2499">
            <input type="hidden" name="productImage" value="IMAGE/JBL.jpg">
            <input type="hidden" name="action" value="buyNow">
            <button class="btn-buy">Buy Now</button>
        </form>
        <!-- <form action="ProductDetails.jsp" method="get">
            <input type="hidden" name="name" value="JBL Headphones">
            <input type="hidden" name="price" value="2499">
            <input type="hidden" name="image" value="IMAGE/JBL.jpg">
            <input type="hidden" name="desc" value="High quality sound with deep bass">
            <button class="details-btn">View</button>
        </form> -->
    </div>
</div>


<div class="product">
    <img src="IMAGE/LAPTOP.jpg">
    <h3>Laptop</h3>
    <div class="price">₹55,000</div>

    <div class="actions">
        <form action="Pservlet" method="post">
            <input type="hidden" name="productId" value="3">
            <input type="hidden" name="productName" value="Laptop">
            <input type="hidden" name="productPrice" value="55000">
            <input type="hidden" name="productImage" value="IMAGE/LAPTOP.jpg">
            <input type="hidden" name="action" value="add">
            <button>Add to Cart</button>
        </form>
			
		<form action="Pservlet" method="post">
            <input type="hidden" name="productId" value="3">
            <input type="hidden" name="productName" value="Laptop">
            <input type="hidden" name="productPrice" value="55000">
            <input type="hidden" name="productImage" value="IMAGE/LAPTOP.jpg">
            <input type="hidden" name="action" value="buyNow">
            <button class="btn-buy">Buy Now</button>
        </form>
       <!--  <form action="ProductDetails.jsp" method="get">
            <input type="hidden" name="name" value="Laptop">
            <input type="hidden" name="price" value="55000">
            <input type="hidden" name="image" value="IMAGE/LAPTOP.jpg">
            <input type="hidden" name="desc" value="High performance laptop for work and study">
            <button class="details-btn">View</button>
        </form> -->
    </div>
</div>


<div class="product">
    <img src="IMAGE/MOTOROLA.jpg">
    <h3>Motorola Mobile</h3>
    <div class="price">₹19,999</div>

    <div class="actions">
        <form action="Pservlet" method="post">
            <input type="hidden" name="productId" value="4">
            <input type="hidden" name="productName" value="Motorola Mobile">
            <input type="hidden" name="productPrice" value="19999">
            <input type="hidden" name="productImage" value="IMAGE/MOTOROLA.jpg">
            <input type="hidden" name="action" value="add">
            <button>Add to Cart</button>
        </form>
        <form action="Pservlet" method="post">
            <input type="hidden" name="productId" value="4">
            <input type="hidden" name="productName" value="Motorola Mobile">
            <input type="hidden" name="productPrice" value="19999">
            <input type="hidden" name="productImage" value="IMAGE/MOTOROLA.jpg">
            <input type="hidden" name="action" value="buyNow">
            <button class="btn-buy">Buy Now</button>
        </form>
<!-- 
        <form action="ProductDetails.jsp" method="get">
            <input type="hidden" name="name" value="Motorola Mobile">
            <input type="hidden" name="price" value="19999">
            <input type="hidden" name="image" value="IMAGE/MOTOROLA.jpg">
            <input type="hidden" name="desc" value="Clean Android experience with strong battery">
            <button class="details-btn">View</button>
        </form> -->
    </div>
</div>


<div class="product">
    <img src="IMAGE/NOTHING.JPG">
    <h3>Nothing Phone</h3>
    <div class="price">₹32,999</div>

    <div class="actions">
        <form action="Pservlet" method="post">
            <input type="hidden" name="productId" value="5">
            <input type="hidden" name="productName" value="Nothing Phone">
            <input type="hidden" name="productPrice" value="32999">
            <input type="hidden" name="productImage" value="IMAGE/NOTHING.JPG">
            <input type="hidden" name="action" value="add">
            <button>Add to Cart</button>
        </form>
        
        <form action="Pservlet" method="post">
            <input type="hidden" name="productId" value="5">
            <input type="hidden" name="productName" value="Nothing Phone">
            <input type="hidden" name="productPrice" value="32999">
            <input type="hidden" name="productImage" value="IMAGE/NOTHING.JPG">
            <input type="hidden" name="action" value="buyNow">
            <button class="btn-buy">Buy Now</button>
        </form>

        <!-- <form action="ProductDetails.jsp" method="get">
            <input type="hidden" name="name" value="Nothing Phone">
            <input type="hidden" name="price" value="32999">
            <input type="hidden" name="image" value="IMAGE/NOTHING.JPG">
            <input type="hidden" name="desc" value="Unique transparent design with smooth performance">
            <button class="details-btn">View</button>
        </form> -->
    </div>
</div>


<div class="product">
    <img src="IMAGE/ONEPLUS.jpg">
    <h3>OnePlus Mobile</h3>
    <div class="price">₹41,999</div>

    <div class="actions">
        <form action="Pservlet" method="post">
            <input type="hidden" name="productId" value="6">
            <input type="hidden" name="productName" value="OnePlus Mobile">
            <input type="hidden" name="productPrice" value="41999">
            <input type="hidden" name="productImage" value="IMAGE/ONEPLUS.jpg">
            <input type="hidden" name="action" value="add">
            <button>Add to Cart</button>
        </form>
        <form action="Pservlet" method="post">
            <input type="hidden" name="productId" value="6">
            <input type="hidden" name="productName" value="OnePlus Mobile">
            <input type="hidden" name="productPrice" value="41999">
            <input type="hidden" name="productImage" value="IMAGE/ONEPLUS.jpg">
            <input type="hidden" name="action" value="buyNow">
            <button class="btn-buy">Buy Now</button>
        </form>
        
<!-- 
        <form action="ProductDetails.jsp" method="get">
            <input type="hidden" name="name" value="OnePlus Mobile">
            <input type="hidden" name="price" value="41999">
            <input type="hidden" name="image" value="IMAGE/ONEPLUS.jpg">
            <input type="hidden" name="desc" value="Fast performance with premium design">
            <button class="details-btn">View</button>
        </form> -->
    </div>
</div>

<div class="product">
    <img src="IMAGE/samsungS25Ultra.jpg">
    <h3>Samsung Mobile</h3>
    <div class="price">₹74,999</div>

    <div class="actions">
        <form action="Pservlet" method="post">
            <input type="hidden" name="productId" value="7">
            <input type="hidden" name="productName" value="Samsung Mobile">
            <input type="hidden" name="productPrice" value="74999">
            <input type="hidden" name="productImage" value="IMAGE/samsungS25Ultra.jpg">
            <input type="hidden" name="action" value="add">
            <button>Add to Cart</button>
        </form>
        
        <form action="Pservlet" method="post">
            <input type="hidden" name="productId" value="7">
            <input type="hidden" name="productName" value="Samsung Mobile">
            <input type="hidden" name="productPrice" value="74999">
            <input type="hidden" name="productImage" value="IMAGE/samsungS25Ultra.jpg">
            <input type="hidden" name="action" value="buyNow">
            <button class="btn-buy">Buy Now</button>
        </form>
<!-- 
        <form action="ProductDetails.jsp" method="get">
            <input type="hidden" name="name" value="Samsung Mobile">
            <input type="hidden" name="price" value="74999">
            <input type="hidden" name="image" value="IMAGE/samsungS25Ultra.jpg">
            <input type="hidden" name="desc" value="Flagship Samsung smartphone with great camera">
            <button class="details-btn">View</button>
        </form> -->
    </div>
</div>


<div class="product">
    <img src="IMAGE/XIAOME.jpg">
    <h3>Xiaomi Mobile</h3>
    <div class="price">₹21,999</div>

    <div class="actions">
        <form action="Pservlet" method="post">
            <input type="hidden" name="productId" value="8">
            <input type="hidden" name="productName" value="Xiaomi Mobile">
            <input type="hidden" name="productPrice" value="21999">
            <input type="hidden" name="productImage" value="IMAGE/XIAOME.jpg">
            <input type="hidden" name="action" value="add">
            <button class="btn-buy">Add to Cart</button>
        </form>
        
         <form action="Pservlet" method="post">
            <input type="hidden" name="productId" value="8">
            <input type="hidden" name="productName" value="Xiaomi Mobile">
            <input type="hidden" name="productPrice" value="21999">
            <input type="hidden" name="productImage" value="IMAGE/XIAOME.jpg">
            <input type="hidden" name="action" value="buyNow">
            <button class="btn-buy">Buy Now</button>
        </form>
<!-- 
        <form action="ProductDetails.jsp" method="get">
            <input type="hidden" name="name" value="Xiaomi Mobile">
            <input type="hidden" name="price" value="21999">
            <input type="hidden" name="image" value="IMAGE/XIAOME.jpg">
            <input type="hidden" name="desc" value="Best value smartphone with strong features">
            <button class="details-btn">View</button>
        </form> -->
    </div>
</div>
  
    
		
		<!--  (List<Product>) session.getAttribute("showListProduct") -->
<%
			


			List<Product> products = (List<Product>) request.getAttribute("products");


			if (products != null && !products.isEmpty()) {
    			for (Product product : products) {
%>
<div class="product">
    <img src="<%= product.getProductImage() %>">
    <h3><%= product.getProductName() %></h3>
    <div class="price">₹<%= product.getProductPrice() %></div>

    <div class="actions">

        <form action="Pservlet" method="post">
            <input type="hidden" name="productId" value="<%= product.getProductId() %>">
            <input type="hidden" name="productName" value="<%= product.getProductName() %>">
            <input type="hidden" name="productPrice" value="<%= product.getProductPrice() %>">
            <input type="hidden" name="productImage" value="<%= product.getProductImage() %>">
            <input type="hidden" name="action" value="add">
            <button>Add to Cart</button>
        </form>

		<form action="Pservlet" method="post">
    			<input type="hidden" name="action" value="buyNow">
   			<input type="hidden" name="productId" value="<%= product.getProductId() %>">
    			<input type="hidden" name="productName" value="<%= product.getProductName() %>">
		    <input type="hidden" name="productPrice" value="<%= product.getProductPrice() %>">
  		  	<input type="hidden" name="productImage" value="<%= product.getProductImage() %>">
   			 <button class="btn-buy">Buy Now</button>
		</form>
					



       <%-- 
        <form action="ProductDetails.jsp" method="get">
            <input type="hidden" name="id" value="<%= product.getProductId() %>">
            <input type="hidden" name="name" value="<%= product.getProductName() %>">
            <input type="hidden" name="price" value="<%= product.getProductPrice() %>">
            <input type="hidden" name="image" value="<%= product.getProductImage() %>">
            <button class="details-btn">View</button>
        </form> --%>
    </div>
</div>


<%
    }
} 
%>

</div>
	

<div class="footer">
    © 2025 MyShop | All Rights Reserved
</div>
	
</body>
</html>