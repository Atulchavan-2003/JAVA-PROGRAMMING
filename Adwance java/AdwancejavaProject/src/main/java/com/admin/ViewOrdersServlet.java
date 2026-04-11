package com.admin;

import java.io.IOException;
import java.util.List;

import com.atul.Order.Order;
import com.atul.Order.OrderDAO;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/viewOrders")
public class ViewOrdersServlet extends HttpServlet {
    
	
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

    	
    	   System.out.println("inside viewOrder servlet");
        HttpSession session = req.getSession(false);

        if (session == null || !"ADMIN".equals(session.getAttribute("role"))) {
            res.sendRedirect("login.jsp");
            return;
        }

        List<Order> orders = OrderDAO.getAllOrders();

        req.setAttribute("orders", orders);
        RequestDispatcher rd =req.getRequestDispatcher("viewOrders.jsp");
        rd.forward(req, res);
    }
}

