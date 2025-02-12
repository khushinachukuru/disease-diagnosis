package com.example.mission;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        HttpSession session = request.getSession();

        // Invalidate the session to log the user out
        session.invalidate();

        // Redirect the user to the login page or any other appropriate page
        response.sendRedirect("login.jsp"); // Change to the appropriate login page URL
    }
}
