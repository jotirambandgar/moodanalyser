package com.bridgelabz.moodanalyser;

public class MoodAnalyser {
    String message;

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public MoodAnalyser() {
    }

    public String analyseMood() {
        try {
        if (this.message.contains("Sad"))
            return "SAD";
        return "HAPPY";
        }catch (NullPointerException nullPointerException){
            return "HAPPY";
        }
    }
}
