package com.atul.CancelOrder;

import java.io.IOException;

import com.atul.Order.OrderDAO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/cancelOrder")
public class CancelOrderServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        int orderId = Integer.parseInt(req.getParameter("orderId"));

        HttpSession session = req.getSession();
        
        boolean cancelled = OrderDAO.cancelOrder(orderId);
        	String role = (String)session.getAttribute("role");
        	
        if(cancelled){
        		if(role.equalsIgnoreCase("user")) {
            res.sendRedirect("MyOrders.jsp?msg=cancelled");
        		}else {
        			res.sendRedirect("viewOrders.jsp");

        		}
        }else{
            res.sendRedirect("MyOrders.jsp?msg=error");
        }
    }
}
