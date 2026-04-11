package com.admin;

import java.io.IOException;
import java.util.List;

import com.atul.payment.Payment;
import com.atul.payment.PaymentDAO;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/viewPayments")
public class ViewPaymentsServlet extends HttpServlet {

    protected void service(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        HttpSession session = req.getSession(false);

      
        if (session == null || !"ADMIN".equals(session.getAttribute("role"))) {
            res.sendRedirect("login.jsp");
            return;
        }

        List<Payment> payments = PaymentDAO.getAllPayments();

        req.setAttribute("payments", payments);
        RequestDispatcher rd = req.getRequestDispatcher("viewPayments.jsp");
        rd.forward(req, res);
    }
}
