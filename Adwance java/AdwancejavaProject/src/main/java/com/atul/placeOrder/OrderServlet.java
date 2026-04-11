package com.atul.placeOrder;

import java.io.IOException;
import java.time.LocalDateTime;

import com.atul.Order.Order;
import com.atul.Order.OrderDAO;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;



@WebServlet("/placeOrder")
public class OrderServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        HttpSession session = req.getSession(false);
        String userName = (String) session.getAttribute("userName");

        if(userName == null){
            res.sendRedirect("login.jsp");
            return;
        }

        int productId = Integer.parseInt(req.getParameter("productId"));
        double price = Double.parseDouble(req.getParameter("productPrice"));
        String paymentMode = req.getParameter("paymentMode");

        LocalDateTime orderTime = LocalDateTime.now();
        
        Order order = new Order(userName,productId,price,paymentMode,orderTime);
        
        	if(OrderDAO.saveOrder(order)==1) {
        	      System.out.println("order sucsessfull");
        	      session.setAttribute("order", order);
        	      res.sendRedirect("OrderSuccess.jsp");
        	      
        	}else {
        		 res.sendRedirect("PaymentFailed.jsp");
        	}
        
//
//        if(){
//            OrderDAO.saveOrder(userName, productId, price, paymentMode);
//            res.sendRedirect("OrderSuccess.jsp");
//        }else{
//            res.sendRedirect("PaymentFailed.jsp");
//        }
    }
}
