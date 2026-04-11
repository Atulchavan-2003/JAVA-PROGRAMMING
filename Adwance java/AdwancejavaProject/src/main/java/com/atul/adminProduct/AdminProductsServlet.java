package com.atul.adminProduct;

import java.io.IOException;
import java.util.ArrayList;

import com.atul.Management.ProductDAO;
import com.atul.ProductList.Product;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/adminProducts")
public class AdminProductsServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ProductDAO dao = new ProductDAO();
        ArrayList<Product> products = (ArrayList<Product>) dao.getAllProducts();

        request.setAttribute("products", products);
        request.getRequestDispatcher("adminDashbord.jsp")
               .forward(request, response);
    }
}

