<%@ page import="com.user.User" %>
<%
    User user = (User) request.getAttribute("user");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Profile</title>

<style>
body{
    margin:0;
    padding:0;
    font-family: 'Segoe UI', Tahoma, sans-serif;
    background: linear-gradient(120deg,#2563eb,#1e40af);
    min-height:100vh;
    display:flex;
    justify-content:center;
    align-items:center;
}

.profile-box{
    width:420px;
    background:white;
    padding:30px;
    border-radius:15px;
    box-shadow:0 15px 35px rgba(0,0,0,.25);
    animation: fadeIn .6s ease;
}

@keyframes fadeIn{
    from{opacity:0; transform:translateY(20px);}
    to{opacity:1; transform:translateY(0);}
}

.profile-box h2{
    text-align:center;
    margin-bottom:25px;
    color:#1e3a8a;
}

.profile-box p{
    font-size:16px;
    margin:12px 0;
    color:#374151;
}

.profile-box p b{
    color:#111827;
}

.btn-group{
    margin-top:25px;
    display:flex;
    gap:12px;
}

.btn{
    flex:1;
    text-align:center;
    padding:10px;
    text-decoration:none;
    font-size:15px;
    border-radius:8px;
    font-weight:600;
    transition:.3s;
}

.btn-orders{
    background:#2563eb;
    color:white;
}

.btn-orders:hover{
    background:#1e40af;
}

.btn-back{
    background:#e5e7eb;
    color:#111827;
}

.btn-back:hover{
    background:#d1d5db;
}
</style>
</head>

<body>

<div class="profile-box">
    <h2>< <%=session.getAttribute("role") %>></h2>
	
	  <%
String role1 = (String) session.getAttribute("role");
	  if ("user".equalsIgnoreCase(role1)) { %>

	    <p><b>User ID:</b> <%= user.getId() %></p>
	    <p><b>Username:</b> <%= user.getUserName() %></p>

	<% } else { %>

	    <p><b>Admin ID:</b> <%= user.getId() %></p>
	    <p><b>Admin Name:</b> <%= user.getUserName() %></p>

	<% } %>

    <p><b>Email:</b> <%= user.getEmail() %></p>
    <p><b>Mobile:</b> <%= user.getMobileNO() %></p>
      <hr>
     
    <%
    
String role = (String) session.getAttribute("role");
    
    
    
    if ("user".equalsIgnoreCase(role)) {
%>

    <div class="btn-group">
        <a href="MyOrders.jsp" class="btn btn-orders"> My Orders</a>
        <a href="<%= request.getContextPath() %>/products" class="btn btn-back"> Back to Shop</a>
    </div>
    
    
    
<%
}else{
%>
<a href="<%= request.getContextPath() %>/adminProducts" class="btn btn-orders" > Back Admin Products</a>

 
 <%} %>
</div>

</body>
</html>
