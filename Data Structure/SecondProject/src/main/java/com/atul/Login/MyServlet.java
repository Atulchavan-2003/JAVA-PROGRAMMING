package com.atul.Login;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/authenticate")

public class MyServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		
			
			String userName = req.getParameter("userName");
			String cardNo = req.getParameter("cardNO");
			String pin = req.getParameter("pin");
			
			VerifyCard ref = new VerifyCard();
			
			boolean result = ref.isValidCard(userName,cardNo,pin);
			
	
			
			PrintWriter out = res.getWriter() ;
			
			if(result == true ) {
//				res.sendRedirect("Valide.html");
				
				System.out.println("insede first");
				RequestDispatcher rd = req.getRequestDispatcher("/ViewBalance");
				rd.forward(req,res);
			}
			else
			{
				res.sendRedirect("Invalide.html");
			}
			
			
			
	}

}
