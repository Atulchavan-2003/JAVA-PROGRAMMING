package com.bijamwar.hariom;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet ("/productCart")
public class ProductServlet extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		String [] products=req.getParameterValues("car");
		PrintWriter out=res.getWriter();
		ProductTotalBusiness business=new ProductTotalBusiness();
		
	
		int total=business.totalCartVal(products);
		HttpSession session=req.getSession();
		session.setAttribute("totalAmt", total);
		
		res.setContentType("text/html");
		out.println("<form action='validate' method='post'>");
		out.println("<label>Credit Card Number:</label><br>");
		out.println("<input type='text' placeholder='Enter credit card number' name='ccno'><br><br>");
		out.println("<label>Card Holder Name:</label><br>");
		out.println("<input type='text' placeholder='Enter card holder name' name='cholder'><br><br>");
		out.println("<label>CVV:</label><br>");
		out.println("<input type='text' placeholder='Enter CVV' name='cvv'><br><br>");
		out.println("<label>Card Expiry (yyyy-mm-dd):</label><br>");
		out.println("<input type='text' placeholder='Enter expiry of card (yyyy-mm-dd)' name='expirydate'><br><br>");
		out.println("<input type='submit' value='Submit' id='btn'>");
		out.println("</form>");


	}
}
