package com.atul.Register;

import java.io.IOException;

import com.user.User;
import com.user.UserDAO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        String userName = req.getParameter("userName");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        String mobileNo = req.getParameter("mobileNo");
        
        User user = new User(userName, password, email, mobileNo);
        
        boolean success = UserDAO.registerUser(userName, password, email, mobileNo);
        
        if (success) {
        		
            res.sendRedirect("login.jsp");
        } else {
            res.sendRedirect("Register.jsp");
        }
    }
}

