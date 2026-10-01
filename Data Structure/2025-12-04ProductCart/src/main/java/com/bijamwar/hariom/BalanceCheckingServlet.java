package com.bijamwar.hariom;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/checkAmt")
public class BalanceCheckingServlet extends HttpServlet {

	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		
		HttpSession session=req.getSession();
		int ccno=Integer.parseInt(req.getParameter("ccno"));
		String cHolderName=req.getParameter("cholder");
		int cvv=Integer.parseInt(req.getParameter("cvv"));
		LocalDate expDate=LocalDate.parse(req.getParameter("expirydate"));
		int purchaseAmt=(int) session.getAttribute("totalAmt");
		BalanceChecking balanceChecking=new BalanceChecking();
		PrintWriter out=res.getWriter();
		if(balanceChecking.checkBalance(ccno, purchaseAmt))
		{
			out.println("sufficient balance to buy product and order is placed");
		}
		else
		{
			out.println("insufficient balance to place an order");
		}
	}
}
