package com.bridgelabz.moodanalyser;

import com.bridgelabz.moodanalyser.exceptions.MoodAnalysisException;

public class MoodAnalyser {

    String message;

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public MoodAnalyser() {
    }

    public String analyseMood() throws MoodAnalysisException {

        try {
            if (this.message.contains("Sad"))
                return "SAD";

            return "HAPPY";

        } catch (NullPointerException nullPointerException) {


                throw new MoodAnalysisException("Invalid Message");

        }
    }
}
