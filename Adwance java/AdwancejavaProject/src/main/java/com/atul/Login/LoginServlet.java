package com.atul.Login;

import java.io.IOException;
import java.net.Authenticator.RequestorType;

import jakarta.security.auth.message.callback.PrivateKeyCallback.Request;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
			System.out.println("inside login servlet");
			  String userName = req.getParameter("userName");
			  String password = req.getParameter("password");
			  String role = req.getParameter("role");
			  
			  ValideUser v1= new ValideUser();
			  System.out.println("inside server");
			  HttpSession session = req.getSession();
			  
			 if("admin".equalsIgnoreCase(role)) {
				 if("Atul".equals(userName) && "Atul@123".equals(password)) {
					 
					 session.setAttribute("userName", userName);
					 
					 session.setAttribute("role", role);
					 
					 res.sendRedirect(req.getContextPath() + "/adminProducts");
					 return;
				 }
				 
			 } else if(!"user".equalsIgnoreCase(role)) {
	                session.setAttribute("error", "Invalid admin credentials");
	                res.sendRedirect("/login.jsp");
	                return;
	          }
			  
			 
				 if(password.length() < 6 ){
					 // !password.matches(".*[a-zA-Z].*")
					    session.setAttribute("passMsg"," password contains at least 6 character");
					  	res.sendRedirect("login.jsp");
					  	return;
				  }
				 

			 if( v1.isValide(userName,password)) {
				
				 session.setAttribute("role", role);
				 session.setAttribute("userName", userName);
				 res.sendRedirect(req.getContextPath() + "/products");

				 
			 }else {
				 
				 req.setAttribute("error", "You don't have an account.Please register first");
				 RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
		          rd.forward(req, res);
			 }
	}
	
}
