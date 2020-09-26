import java.util.Arrays;
package com.eyal.bullshitwtf.Game;

public class Question {
    private String question;
    private String answer;
    private String[] bullshits;

    public Question(String question, String answer, String[] bullshits) {
        this.question = question;
        this.answer = answer;
        this.bullshits = bullshits;
    }

    public String getAnswer(){
        return this.answer;
    }

    public String getQuestion() {
        return question;
    }

    public String[] getNumOfBullshits(int numOfBullshits){
        if (numOfBullshits >= this.bullshits.length) {
            throw new IndexOutOfBoundsException(numOfBullshits);
        }
        return Arrays.copyOfRange(Utils.shuffleArray(this.bullshits), 0, 2);
    }
}
