/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ramesh;

/**
 *
 * @author rameshkumar
 */
public class RadioState {
    String yes = "";
    String no = "";

    RadioState(String radioJSPCool) {
        if(radioJSPCool.equals("1"))
            yes = "checked";
        else no = "checked";
    }

    public String getYes() {
        return yes;
    }

    public String getNo() {
        return no;
    }
    
}
