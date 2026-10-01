package com.atul.ProductList;

import java.io.IOException;
import java.util.ArrayList;

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
			
				
				String action = req.getParameter("action");
				
				HttpSession session = req.getSession();
				
				ArrayList<Product> cart = (ArrayList<Product>) session.getAttribute("cart");
				
				if(cart == null ) {
					cart = new ArrayList<Product>();
				}
				
				if("add".equals(action)) {
					
					String image = req.getParameter("image");
					String ProductName = req.getParameter("product");
					String price = req.getParameter("price");
					
					Product product = new Product(ProductName, image, price);
					System.out.println("add sucsesfull");
					cart.add(product);
					
					session.setAttribute("cart", cart);
					
				     res.sendRedirect("Product.html");
					
				}
				else if("remove".equals(action)) {
					int index = Integer.parseInt(req.getParameter("index"));
					
					if (index >= 0 && index < cart.size()) {
					cart.remove(index);
					}
					
					session.setAttribute("cart", cart);
				}
				
				
		
	}

}
