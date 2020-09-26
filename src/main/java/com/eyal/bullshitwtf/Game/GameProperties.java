package com.eyal.bullshitwtf.Game;

import androidx.annotation.NonNull;

public class GameProperties {
    private String language;
    private int amountOfQuestions;

    public GameProperties() {
    }

    @NonNull
    @Override
    public String toString() {
        return language + " " + amountOfQuestions;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getAmountOfQuestions() {
        return amountOfQuestions;
    }

    public void setAmountOfQuestions(int amountOfQuestions) {
        this.amountOfQuestions = amountOfQuestions;
    }

    public GameProperties(String language, int amountOfQuestions) {
        this.language = language;
        this.amountOfQuestions = amountOfQuestions;
    }
}

