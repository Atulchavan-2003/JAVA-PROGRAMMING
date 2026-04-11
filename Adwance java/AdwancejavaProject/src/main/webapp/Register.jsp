<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>

<style>
    body{
        font-family: Arial;
        background:#f2f2f2;
        display:flex;
        justify-content:center;
        align-items:center;
        height:100vh;
    }
    .box{
        background:white;
        padding:25px;
        width:320px;
        border-radius:8px;
        box-shadow:0 0 10px rgba(0,0,0,0.2);
    }
    input, button{
        width:100%;
        padding:10px;
        margin:8px 0;
    }
    button{
        background:#2563eb;
        color:white;
        border:none;
        cursor:pointer;
    }
</style>
</head>

<body>

<div class="box">
    <h2>User Registration</h2>

    <form action="<%=request.getContextPath()%>/RegisterServlet" method="post">

        <input type="text" name="userName" placeholder="Enter Username" required>

        <input type="password" name="password" placeholder="Enter Password" required>

		<input type="email" name="email" placeholder="Enter Gmail" required pattern="[a-zA-Z0-9._%+-]+@gmail\.com" title="Only @gmail.com email is allowed">
	
		<input type="text" name="mobileNo" placeholder="Enter Mobile Number"  required  pattern="[6-9][0-9]{9}" title="Enter valid 10 digit mobile number (starts with 6-9)">
		
       

        <button type="submit">Register</button>
    </form>

    <p>Already registered? <a href="login.jsp">Login</a></p>
</div>

</body>
</html>
    