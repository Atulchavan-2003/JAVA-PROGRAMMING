package com.atul.ProductList;

import java.io.IOException;
import java.util.ArrayList;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/Pservlet")
public class ProductServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
			    
				System.out.println("inside product servlet");
				String action = req.getParameter("action");
				
				HttpSession session = req.getSession();
				
				ArrayList<Product> cart = (ArrayList<Product>) session.getAttribute("cart");
				
				if(cart == null ) {
					cart = new ArrayList<Product>();
				}
				
		if(session.getAttribute("userName")!=null) {					
				if("add".equals(action)) {
					   
					   
					
							
						System.out.println("inside add cart");
						int productId =Integer.parseInt(req.getParameter("productId"));
						String productName = req.getParameter("productName");
						String image = req.getParameter("productImage");
						String price = req.getParameter("productPrice");

//						totalPrice += Integer.parseInt(price);			
//						session.setAttribute("totalPrice",totalPrice);
						
						
						
						
						System.out.println(productName);
						Product product = new Product(productName, image, price);
						product.setProductId(productId);
						System.out.println("add sucsesfull");
						cart.add(product);
					     
						
						
						  int totalPrice = 0;
						    for (Product p : cart) {
						        totalPrice += Integer.parseInt(p.getProductPrice());
						    }
						
						  session.setAttribute("totalPrice", totalPrice);
						
						session.setAttribute("cart", cart);
						session.setAttribute("showAlert", "yes");						 
						res.sendRedirect(req.getContextPath() + "/products");
						
						
					
					   
					
				}
				else if ("remove".equals(action)) {

				
				   

				        int index = Integer.parseInt(req.getParameter("index"));
				        cart.remove(index);

				        int totalPrice = 0;
				        for (Product p : cart) {
				            totalPrice += Integer.parseInt(p.getProductPrice());
				        }

				        session.setAttribute("cart", cart);
				        session.setAttribute("totalPrice", totalPrice);

				        res.sendRedirect("Cart.jsp");
				   

				    
				    
				}else if ("buy".equals(action)) {
					
				     int index = Integer.parseInt(req.getParameter("index"));
				     
				     Product product = (Product) cart.get(index);
				     req.setAttribute("product", product);
				     
				     
					RequestDispatcher rd = req.getRequestDispatcher("/buy");
					rd.forward(req, res);
					
				}else if ("buyNow".equals(action)) {

					
					
				    System.out.println("inside buyNow");

				    int productId = Integer.parseInt(req.getParameter("productId"));
				    String productName = req.getParameter("productName");
				    String image = req.getParameter("productImage");
				    String price = req.getParameter("productPrice");

				    Product product = new Product(productName, image, price);
				    product.setProductId(productId);

				  
				    req.setAttribute("product", product);

				    RequestDispatcher rd = req.getRequestDispatcher("/buy");
				    rd.forward(req, res);
				    
				    
				}else if ("buyAll".equals(action)) {

				    System.out.println("inside buyAll");

				    if (cart == null || cart.isEmpty()) {
				        res.sendRedirect("Cart.jsp");
				        return;
				    }

				 
				    int totalPrice = 0;
				    
				    for (Product p : cart) {
				        totalPrice += Integer.parseInt(p.getProductPrice());
				    }

				   
				    req.setAttribute("cart", cart);
				    req.setAttribute("totalPrice", totalPrice);
				    req.setAttribute("buyAll", "yes");
				 
				    RequestDispatcher rd = req.getRequestDispatcher("/buy");
				    rd.forward(req, res);
				}
				
		}else {
			
			 session.setAttribute("msg", "Please login first Guest users cannot add items to cart");
			 
			 res.sendRedirect("login.jsp");
		}		
		
	}

}
