package com.atul.Login;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
			  String userName = req.getParameter("userName");
			  String password = req.getParameter("password");
			  
			  ValideUser v1= new ValideUser();
			  System.out.println("inside server");
			  
			  if(password.length() < 8){
				    resp.sendError(400, "Password must be at least 8 characters");
				    return;
				}

			 if( v1.isValide(userName,password)) {
				 resp.sendRedirect("Product.html");
			 }else {
				  resp.sendRedirect("Invalide.html");
			 }
	}
	
}
