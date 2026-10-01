package com.atul.ShopingServer;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/ProductServlet")

public class ProductServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
			String[] productId = req.getParameterValues("productId");
//			String[] productname = req.getParameterValues("productName");
			
			ProductBusinessLogic bl = new ProductBusinessLogic();
			
			int total = bl.getTotalProduct(productId);
			HttpSession session = req.getSession();
			
			if(total != 0) {
				session.setAttribute("totalAmt", total);
				res.sendRedirect("Card.html");
			}
			else {
				System.out.println("product is not available");
			}
			
		 
	}

}
