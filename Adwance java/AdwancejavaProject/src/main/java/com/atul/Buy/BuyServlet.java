package com.atul.Buy;

import java.io.IOException;
import java.util.ArrayList;

import com.atul.ProductList.Product;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/buy")
public class BuyServlet extends HttpServlet {

    protected void service(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
    	
    	
       System.out.println("inside buyServlet");
    	    HttpSession session = req.getSession();
    	    
    	   
    	    		Product product = (Product) req.getAttribute("product");
    	    		ArrayList<Product> cart = (ArrayList<Product>) req.getAttribute("cart");
    	    	    Integer totalPrice = (Integer) req.getAttribute("totalPrice");

    	    		
    	    	    if (product != null) {
            System.out.println("inside buy now and buy");
    	    
    	    		req.setAttribute("product", product);
    	    		RequestDispatcher rd = req.getRequestDispatcher("/BuyNow.jsp");
    	    		rd.forward(req, res);
    	    		
    	    	    } else if (cart != null && !cart.isEmpty()) {
    	    	    			System.out.println("inside buy all");
    	    	    			req.setAttribute("cart", cart);
    	    	            req.setAttribute("totalPrice", totalPrice);
    	    	            req.getRequestDispatcher("BuyNow.jsp").forward(req, res);

    	    	   } else {
    	    	            res.sendRedirect("Cart.jsp");
    	        }
    	    		
    	    		
    	    		
    	    		
//    	    		if(product == null){
//	    				res.sendRedirect("Cart.jsp");
//	    				return;
//	    			}
    	    		
        
//    	    }else {
//    	        ArrayList<Product> cart = (ArrayList<Product>) session.getAttribute("cart");
//    	        Integer totalPrice = (Integer) session.getAttribute("totalPrice");
//
//    	   
//    	        if (cart == null || cart.isEmpty()) {
//    	            res.sendRedirect("Cart.jsp");
//    	            return;
//    	        }
//
//    	        System.out.println("Inside Buy All Servlet");
//    	        System.out.println("Total Price: " + totalPrice);
//
//    	        
//    	        req.setAttribute("cart", cart);
//    	        req.setAttribute("totalPrice", totalPrice);
//    	     
//    	        RequestDispatcher rd = req.getRequestDispatcher("/BuyNow.jsp");
//    	        rd.forward(req, res);
//    	    }
    }
}
