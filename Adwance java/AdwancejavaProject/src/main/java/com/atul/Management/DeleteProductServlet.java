package com.atul.Management;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/DeleteProductServlet")
public class DeleteProductServlet extends HttpServlet {
	 protected void doPost(HttpServletRequest req, HttpServletResponse res)
	            throws ServletException, IOException {

	        HttpSession session = req.getSession(false);

	        if (session == null || !"ADMIN".equals(session.getAttribute("role"))) {
	            res.sendRedirect("login.jsp");
	            return;
	        }

	        int productId = Integer.parseInt(req.getParameter("productId"));

	        int result = ProductDAO.deleteProduct(productId);

	        session.setAttribute("msgdelete", "Product deleted successfully");
	        res.sendRedirect(req.getContextPath() + "/adminProducts");

	 }
}
