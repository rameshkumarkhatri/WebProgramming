/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ramesh.models;

/**
 *
 * @author rameshkumar
 */
public class Quiz {

    public static String calculateGrade(int score) {
        if( score >=45 && score<=50)
            return "A";
        if( score >=35 && score<=44)
            return "B";
        if( score >=25 && score<=34)
            return "C";
        else
            return "NC";

    }

    private int type = 0;
    private int score = 0;
    private int attempts = 0;
    private boolean isQuizOver = false;

    public Quiz(int type, int score) {
        this.type = type;
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public int getType() {
        return type;
    }

    public boolean processAnswer(String answer) {
        attempts++;

        if (Type.getAnswers()[type].equals(answer)) {
            if (attempts == 1) {
                score = 10;
            } else if (attempts == 2) {
                score = 5;
            } else {
                score = 2;
            }
            return true;
        }
        if(attempts>=3)return true;

        return false;
    }

    public boolean isQuizOver() {
        return isQuizOver;
    }

}
