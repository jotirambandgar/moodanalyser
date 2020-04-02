package com.bridgelabz.moodanalyser;

public class MoodAnalyser {
    public String getMoode(String message) {
        if (message.contains("sad"))
            return "SAD";
        return "HAPPY";
    }
}
