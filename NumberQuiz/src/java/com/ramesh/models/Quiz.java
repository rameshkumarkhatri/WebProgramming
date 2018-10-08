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
    private int type = 0;
    private int score = 0;
    private boolean isQuizOver = false;
    
    public Quiz(int type, int score){
    this.type = type;
    this.score = score;
    }

    public int getScore() {
        return score;
    }

    public int getType() {
        return type;
    }

    
    public void processAnswer(String answer) {
        
        
        
        if(type < Type.getAnswers().length && Type.getAnswers()[type].equals(answer))
        {
           
            score++;
        }
            type++;
        if(type == Type.getAnswers().length)
            isQuizOver = true;
    }

    public boolean isQuizOver(){
        return isQuizOver;
    }
    
}
