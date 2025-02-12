package com.example.mission;

import jakarta.servlet.annotation.WebServlet; // Jakarta EE annotation
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.HashMap;

@WebServlet(name = "loginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private static HashMap<String, String> userCredentials = new HashMap<>();
    static {
        userCredentials.put("chief123", "chiefpass");
        userCredentials.put("agent456", "agentpass");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (userCredentials.containsKey(username) && userCredentials.get(username).equals(password)) {
            // Successful login
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            response.sendRedirect("dashboard");
        } else {
            // Invalid credentials
            request.setAttribute("errorMessage", "Invalid username or password");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    }
}