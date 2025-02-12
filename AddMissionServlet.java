package com.example.mission;

import java.io.IOException;
import java.util.ArrayList;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/AddMissionServlet")
public class AddMissionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve mission data from the request parameters
        String title = request.getParameter("title");
        String objective = request.getParameter("objective");
        String difficultyStr = request.getParameter("difficulty");
        String timeStr = request.getParameter("time");

        // Check if any of the input fields are empty
        if (title == null || title.isEmpty() || objective == null || objective.isEmpty() ||
                difficultyStr == null || difficultyStr.isEmpty() || timeStr == null || timeStr.isEmpty()) {
            // Handle the case where one or more fields are empty
            // You can redirect the user back to the addmission.jsp page with an error message
            // For example: response.sendRedirect("addmission.jsp?error=Please fill in all fields");
            return;
        }

        // Create a new Mission object
        Mission newMission = new Mission(0, title, objective, Integer.parseInt(difficultyStr), Integer.parseInt(timeStr));

        // Add the new mission to MissionSystem
        MissionSystem.addMission(newMission);
        ArrayList<Mission> missions = MissionSystem.getMissions();
        System.out.println(missions);
        // Redirect back to the View Missions servlet
        response.sendRedirect("ViewMissionsServlet");
    }

}
