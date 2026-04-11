package com.atul.BuyAll;



import java.io.IOException;
import java.util.ArrayList;

import com.atul.ProductList.Product;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/buyAllServlet")
public class BuyAllServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        HttpSession session = req.getSession();


        ArrayList<Product> cart = (ArrayList<Product>) session.getAttribute("cart");
        Integer totalPrice = (Integer) session.getAttribute("totalPrice");

   
        if (cart == null || cart.isEmpty()) {
            res.sendRedirect("Cart.jsp");
            return;
        }

        System.out.println("Inside Buy All Servlet");
        System.out.println("Total Price: " + totalPrice);

        
        req.setAttribute("cart", cart);
        req.setAttribute("totalPrice", totalPrice);
     
        RequestDispatcher rd = req.getRequestDispatcher("orderSuccess.jsp");
        rd.forward(req, res);

        
    }
}
