<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Balance</title>
</head>
<body>
    
    
<%
    String balance ;
   	
	 balance = (String) session.getAttribute("balance");
%>

<h2>Your Account Balance</h2>

		<h3>Balance : <%= balance %> ₹</h3>  
		
    
    	
    <a href="card.html">Go Back</a>
</body>
</html>
    