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
public class Type {
//    PI,
//    FIBONACCI,
//    SQUARES,
//    PRIMES,
//    POWERS
    private static String[] questions = {"3, 1, 4, 1, 5",
    "1, 1, 2, 3, 5",
    "1, 4, 9, 16, 25",
    "2, 3, 5, 7, 11",
    "1, 2, 4, 8, 16"};
    private static String[] answers = {"9", "8", "36", "13", "32"};

    public static String[] getAnswers() {
        return answers;
    }

    public static String[] getQuestions() {
        return questions;
    }
    
    
}
