package com.atul.card;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.atul.ProductList.Product;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/CardServlet")
public class CardServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws IOException, ServletException {

        String cardNo = req.getParameter("cardNumber");
        String cvv = req.getParameter("cvv");
        String buyAll = req.getParameter("buyAll"); // yes if BuyAll
        HttpSession session = req.getSession();

        boolean valid = CardDAO.isValidCard(cardNo, cvv);

        if (valid) {
            System.out.println("inside valid card");

            List<Product> cart = (List<Product>) session.getAttribute("cart");

            if ("yes".equals(buyAll)) {
               
                if (cart != null) {
                    cart.clear(); 
                }
            } else {
             
                String productIdStr = req.getParameter("productId");
                if (productIdStr != null && !productIdStr.isEmpty() && cart != null) {
                    int productId = Integer.parseInt(productIdStr);
                    cart.removeIf(p -> p.getProductId() == productId);
                }
            }

            session.setAttribute("cart", cart);
            req.getRequestDispatcher("placeOrder").forward(req, res);

        } else {
            req.setAttribute("error", "Invalid Card Details");
            req.getRequestDispatcher("card.jsp").forward(req, res);
        }
    }
}
