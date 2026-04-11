package com.atul.profile;

import java.io.IOException;

import com.user.User;
import com.user.UserDAO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/profile")
public class ProfileServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    		System.out.println("inside profile servlet");
        HttpSession session = request.getSession(false);

        if (session == null || session.getAttribute("userName") == null) {
            response.sendRedirect("login.jsp");
            return;
        }
          

        String username = (String) session.getAttribute("userName");

        User user = UserDAO.getUserByUsername(username);

        request.setAttribute("user", user);
        request.getRequestDispatcher("profile.jsp").forward(request, response);
    }
}

