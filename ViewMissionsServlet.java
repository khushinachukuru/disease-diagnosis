package com.example.mission;

import java.io.IOException;
import java.util.ArrayList;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ViewMissionsServlet")
public class ViewMissionsServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve the list of missions from MissionSystem
        ArrayList<Mission> missions = MissionSystem.getMissions();
        System.out.println(missions);
        // Set the list of missions as an attribute in the request
        request.setAttribute("missions", missions);

        // Forward the request to a JSP page to display the missions
        request.getRequestDispatcher("viewmissions.jsp").forward(request, response);
    }
}