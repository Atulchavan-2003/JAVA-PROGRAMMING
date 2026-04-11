package com.atul.ProductList;

import java.io.IOException;
import java.util.List;

import com.atul.Management.ProductDAO;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/products")

public class ProductListServlet extends HttpServlet{

    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        List<Product> products = ProductDAO.getAllProducts();
        
       
        req.setAttribute("products", products);

        RequestDispatcher rd =req.getRequestDispatcher("/Product.jsp");
        rd.forward(req, res);
    }
}
