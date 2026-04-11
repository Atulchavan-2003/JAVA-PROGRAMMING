package com.atul.update;

import java.io.IOException;

import com.atul.Management.ProductDAO;
import com.atul.ProductList.Product;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/updateProduct")
public class UpdateProductSaveServlet1 extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int productId = Integer.parseInt(request.getParameter("productId"));
        String productName = request.getParameter("productName");
        String productPrice = request.getParameter("productPrice");
        String productImage = request.getParameter("productImage");

        Product p = new Product();
        p.setProductId(productId);
        p.setProductName(productName);
        p.setProductPrice(productPrice);
        p.setProductImage(productImage);

        int status = ProductDAO.update(p);

        if (status > 0) {
            request.getSession().setAttribute("msgupdate", "Product Updated Successfully");
        } else {
            request.getSession().setAttribute("msgupdate", "Product Update Failed");
        }

        response.sendRedirect(request.getContextPath() + "/adminProducts");
    }
}

