package com.example.mission;

public class Mission {
    private int missionId;
    private String title;
    private String objective;
    private int estimatedDifficulty;
    private int estimatedTime;

    public Mission(int missionId, String title, String objective, int estimatedDifficulty, int estimatedTime) {
        this.missionId = missionId;
        this.title = title;
        this.objective = objective;
        this.estimatedDifficulty = estimatedDifficulty;
        this.estimatedTime = estimatedTime;
    }

    public int getMissionId() {
        return missionId;
    }

    public void setMissionId(int missionId) {
        this.missionId = missionId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    }

    public int getEstimatedDifficulty() {
        return estimatedDifficulty;
    }

    public void setEstimatedDifficulty(int estimatedDifficulty) {
        this.estimatedDifficulty = estimatedDifficulty;
    }

    public int getEstimatedTime() {
        return estimatedTime;
    }

    public void setEstimatedTime(int estimatedTime) {
        this.estimatedTime = estimatedTime;
    }

    @Override
    public String toString() {
        return "Mission ID: " + missionId + "\nTitle: " + title + "\nObjective: " + objective
                + "\nDifficulty: " + estimatedDifficulty + "\nTime: " + estimatedTime;
    }
}
