package com.bijamwar.hariom;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet ("/validate")
public class CardValidationServlet extends HttpServlet{

	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		
		
		int ccno=Integer.parseInt(req.getParameter("ccno"));
		String cHolderName=req.getParameter("cholder");
		int cvv=Integer.parseInt(req.getParameter("cvv"));
		LocalDate expDate=LocalDate.parse(req.getParameter("expirydate"));
		
		HttpSession session =req.getSession();
		int purchaseAmt=(int) session.getAttribute("totalAmt");
//		int purchaseAmt=Integer.parseInt(req.getParameter("purchaseamt"));
		Verify verify=new Verify();
		PrintWriter out=res.getWriter();
		if( verify.verifyCardDetails(ccno,cHolderName,cvv,expDate))
		{
//			res.sendRedirect("validUserPage.html");
			RequestDispatcher rd=req.getRequestDispatcher("checkAmt");
			rd.forward(req, res);
		}
		else
		{
			res.sendRedirect("invalidUser.html");
		}
	}
}
