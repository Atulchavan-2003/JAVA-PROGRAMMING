<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
		
    <style>
        body {
            font-family: Arial, sans-serif;
            background: #f2f2f2;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .login-box {
            background: white;
            padding: 30px;
            width: 350px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0,0,0,0.2);
        
        }

        .login-box h2 {
            text-align: center;
            margin-bottom: 20px;
        }

        input[type="text"],
        input[type="password"] {
            width: 100%;
            padding: 12px;
            margin: 10px 0;
            border: 1px solid gray;
            border-radius: 5px;
        }

        button {
            width: 100%;
            padding: 12px;
            background: #4CAF50;
            color: white;
            border: none;
            border-radius: 5px;
            font-size: 17px;
            cursor: pointer;
        }

        button:hover {
            background: #45a049;
        }

        .register-link {
            text-align: center;
            margin-top: 15px;
        }

        .register-link a {
            text-decoration: none;
            color: blue;
        }
        
     		.error {
    background: #fdecea;
    color: #b71c1c;
    padding: 10px;
    border-radius: 6px;
    margin-bottom: 15px;
    text-align: center;
    font-weight: 600;
}

		.msg{
			background: #fdecea;
   			color: #b71c1c;
    		padding: 10px;
  			border-radius: 6px;
   			margin-bottom: 15px;
    		text-align: center;
    		font-weight: 600;
		}
	
        
    </style>
</head>

<body>



		

<div class="login-box">
    <h2>Login</h2>
    
    

    <form action="login" method="post"> 
    
<div style="margin: 10px 0;">
    <label>
        <input type="radio" name="role" value="USER" checked>
        User
    </label>

  

    <label>
        <input type="radio" name="role" value="ADMIN">
        Admin
    </label>
</div>
    	
    
    
    

        <input type="text" name="userName" placeholder="Enter username" required>
        
        
 	<%
        String error = (String) request.getAttribute("error");
        if (error != null) {
    %>
        <div class="error"><%= error %></div>
    <%
        }
    %>
    
    
      <%
        String msg = (String) session.getAttribute("msg");
        if (msg != null) {
   	 %>
        <div class="msg"><%= msg  %></div>
    <%
            session.removeAttribute("msg"); 
        }
    %>
    
    
    
    <%
    	String passMsg = (String)session.getAttribute("passMsg");
    	if(passMsg!=null){
    	
    %>
    
     <div class="passMsg" style="color :red"><%= passMsg %></div>
    
    
    <%
    	session.removeAttribute("passMsg");
    	}
    %>
		 <!--  pattern="(?=.*[A-Za-z]).{6,}" -->
        <input type="password" name="password" placeholder="Enter Password" required>

        <button type="submit">Login</button>

        <div class="register-link">
            <p>Don't have an account? <a href="Register.jsp">Register</a></p>
        </div>
        
       

    </form>
</div>
		
		
   
</body>
</html>