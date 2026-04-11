package com.admin;

import java.io.IOException;
import java.util.List;

import com.user.User;
import com.user.UserDAO;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/viewUsers")
public class ViewUsersServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        HttpSession session = req.getSession(false);

       
        if (session == null || !"ADMIN".equals(session.getAttribute("role"))) {
            res.sendRedirect("login.jsp");
            return;
        }

        List<User> users = UserDAO.getAllUsers();

        req.setAttribute("users", users);
        
       RequestDispatcher rd = req.getRequestDispatcher("viewUsers.jsp");
       rd.forward(req, res);
    }
}


