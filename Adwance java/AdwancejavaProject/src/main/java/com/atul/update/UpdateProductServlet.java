package com.atul.update;

import java.io.IOException;

import com.atul.Management.ProductDAO;
import com.atul.ProductList.Product;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/updateProductForm")
public class UpdateProductServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    		System.out.println("inside updateproductForm");
        int productId = Integer.parseInt(request.getParameter("productId"));

        Product product = ProductDAO.getProductById(productId);

        request.setAttribute("product", product);
       RequestDispatcher rd = request.getRequestDispatcher("/UpdateForm.jsp");
               rd.forward(request, response);
    }
}

