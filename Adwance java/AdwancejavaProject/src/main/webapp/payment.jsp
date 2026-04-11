<html>
<head>
<title>Select Payment</title>

<style>
body{
font-family:Segoe UI;
background:#f1f5f9
}

.box{
width:420px;
margin:70px auto;
background:white;
padding:30px;
border-radius:12px;
box-shadow:0 10px 25px rgba(0,0,0,.2);
}

h2{text-align:center}

.option{
margin:15px 0;
font-size:16px;
}

button{
width:100%;
padding:12px;
background:#2563eb;
color:white;
border:none;
border-radius:8px;
font-size:16px;
cursor:pointer;
}

button:hover{
background:#1d4ed8;
}
</style>
</head>

<body>

<div class="box">

<h2>Payment</h2>

<form action="card.jsp" method="post">

<h2>Total Amount : Rs.<%= request.getParameter("price") %></h2>

<input type="hidden" name="productId" value="<%= request.getParameter("productId") %>">
<input type="hidden" name="productName" value="<%= request.getParameter("productName") %>">
<input type="hidden" name="productPrice" value="<%= request.getParameter("price") %>">

 <input type="hidden" name="buyAll" value="<%= request.getParameter("buyAll") %>">
 
<div class="option">
<input type="radio" name="paymentMode" value="CARD" required>
Debit / Credit Card
</div>

<button>Pay Now</button>

</form>

</div>

</body>
</html>
