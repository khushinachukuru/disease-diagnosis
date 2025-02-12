package com.example.mission;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MissionSystem {
    private static HashMap<String, String> userCredentials = new HashMap<>();
    public static ArrayList<Mission> missions = new ArrayList<>();
    private static ArrayList<Mission> agentMissions = new ArrayList<>();
    public static void initializeMissions() {
        System.out.println("Initializing missions...");
        missions.add(new Mission(1, "Mission 1", "Objective 1", 3, 120));
        missions.add(new Mission(2, "Mission 2", "Objective 2", 2, 90));
        missions.add(new Mission(3, "Mission 3", "Objective 3", 4, 180));
    }

//    public MissionSystem() {
//        // Constructor for initialization if needed
//    }

    public static void main(String[] args) {
        // Your main method code here
        missions.add(new Mission(1, "Mission 1", "Objective 1", 3, 120));
        missions.add(new Mission(2, "Mission 2", "Objective 2", 2, 90));
        missions.add(new Mission(3, "Mission 3", "Objective 3", 4, 180));
    }

    public static ArrayList<Mission> getMissions() {
        return missions;
    }

    public static void addMission(Mission mission) {
        missions.add(mission);
    }
}
