package com.atul.Login;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/ViewBalance")
public class SecondServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String pin = req.getParameter("pin");
		
		Connectivity con = new AuthenticateUser();
		String result = con.checkBalance(pin);
		
		HttpSession session = req.getSession();
		
		if(result !=null) {
			
            session.setAttribute("balance", result);

            res.sendRedirect("ShowBalance.jsp");
//            RequestDispatcher rd = req.getRequestDispatcher("ShowBalance.jsp");
//            rd.forward(req, resp);
		}
	}
	
}
