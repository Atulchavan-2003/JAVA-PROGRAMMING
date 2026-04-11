package com.atul.Management;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.util.List;

import com.atul.ProductList.Product;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/ProductManagementServlet")
public class ProductManagementServlet extends HttpServlet{
		
	  protected void doPost(HttpServletRequest req, HttpServletResponse res)
	            throws ServletException, IOException {
		  	
		  System.out.println("inside add product");
		    
	        HttpSession session = req.getSession(false);

	         String action = req.getParameter("action");
	         
	        if (session == null || !"ADMIN".equals(session.getAttribute("role"))) {
	            session.setAttribute("msg", "Access denied. Admin only.");
	            res.sendRedirect("login.jsp");
	            return;
	        }
	       
	        
	        if("addProduct".equals(action)) {
	        	
	          
		        String productName = req.getParameter("productName");
		        String price = req.getParameter("productPrice");
		        String image = req.getParameter("productImage");

		        Product product = new Product(productName, image, price);
		        
		        
		       if( ProductDAO.save(product) == 1) { 
		    	   
		    	   System.out.println("add product in show list");
		        	 List<Product> Products = ProductDAO.getAllProducts();
		        	 
		        	 session.setAttribute("showListProduct", Products);
		        	 res.sendRedirect(req.getContextPath() + "/adminProducts");
		    	  
		       }
		       else {
		    	   System.out.println("data not add some issue");
		    	   session.setAttribute("ProductAdd", "product not added");
		    	   res.sendRedirect(req.getContextPath()+"/addProduct.jsp");
		       }
		       
	        }
	        else if("showProduct".equals(action)) {
	        	
	        	 res.sendRedirect(req.getContextPath() + "/products");
	        }
	    
	    }
	
}
