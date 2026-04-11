<%@ page import="com.atul.ProductList.Product" %>
<%@ page import="java.util.*,com.atul.ProductList.Product" %>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Buy Now</title>
<style>

body{
    margin:0;
    font-family:Segoe UI;
    background:#f4f6fb;
}

.container{
    display:flex;
    flex-wrap:wrap;
    gap:25px;
    justify-content:center;
    padding:40px;
}

.card{
    width:260px;
    background:white;
    border-radius:15px;
    box-shadow:0 8px 25px rgba(0,0,0,.12);
    overflow:hidden;
    transition:.3s;
}

.card:hover{
    transform:translateY(-6px);
}

.card img{
    width:100%;
    height:180px;
    object-fit:contain;
    background:#f1f1f1;
}

.content{
    padding:15px;
    text-align:center;
}

.content h2{
    font-size:18px;
    margin:10px 0;
}

.price{
    color:#16a34a;
    font-size:20px;
    font-weight:bold;
}

button{
    margin-top:12px;
    width:100%;
    padding:10px;
    background:#2563eb;
    border:none;
    color:white;
    border-radius:8px;
    font-size:15px;
    cursor:pointer;
}

button:hover{
    background:#1d4ed8;
}

/* TOTAL BOX */

.totalBox{
    width:100%;
    text-align:center;
    margin-top:20px;
}

.totalBox h2{
    color:#dc2626;
}

/* Empty */

.no-product{
    font-size:20px;
    color:gray;
}

</style>

</head>
<body>
<div class="container">
<%
    Product product = (Product) request.getAttribute("product");
	ArrayList<Product> cart = (ArrayList<Product>) request.getAttribute("cart");
	Integer total = (Integer) request.getAttribute("totalPrice");
    if(product != null) {
%>
    <div class="card">
        <img src="<%= product.getProductImage() %>"alt="Product Image">
        <div class="content">
            <h2><%= product.getProductName() %></h2>
            <div class="price">Rs.<%= product.getProductPrice() %></div>
            <form action="payment.jsp" method="post">
                <input type="hidden" name="productId" value="<%= product.getProductId() %>">
                <input type="hidden" name="productName" value="<%= product.getProductName() %>">
                <input type="hidden" name="price" value="<%= product.getProductPrice() %>">
                <button>Confirm Order</button>
            </form>
        </div>
    </div>
<%
    } else if(cart != null){ %>

<!-- BUY ALL -->

<%
for(Product p : cart){
%>

<div class="card">
<img src="<%= p.getProductImage() %>">
<div class="content">
<h2><%= p.getProductName() %></h2>
<div class="price">Rs.<%= p.getProductPrice() %></div>
</div>
</div>

<%
}
%>

<h2 style="text-align:center;">Total: Rs.<%= total %></h2>

<form action="payment.jsp" method="post" style="width:400px;">
<input type="hidden" name="price" value="<%= total %>">
<button>Confirm All Orders</button>
</form>

<% }  else { %>

<p>No product available</p>

<% } %>


</div>
</body>
</html>
