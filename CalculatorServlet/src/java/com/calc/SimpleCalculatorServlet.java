/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.calc;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author rameshkumar
 */
public class SimpleCalculatorServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        response.setContentType("text/html");
        int value1P = 0, value2P = 0;
        int value1M = 0, value2M = 0;
        boolean canShowPlus = false, canShowMultiply = false;
        if(request.getParameter("value_1_p").length() != 0){
           canShowPlus = true;
           value1P = Integer.parseInt(request.getParameter("value_1_p"));
        }
        
        if(request.getParameter("value_2_p").length() != 0){
           canShowPlus = true;
           value2P = Integer.parseInt(request.getParameter("value_2_p"));
        }
        
        PrintWriter writer = response.getWriter();
        if(canShowPlus)
        writer.append("<p>"+value1P+" + "+value2P+" = "+(value1P+value2P));
        
        if(request.getParameter("value_1_m").length() != 0){
           canShowMultiply = true;
           value1M = Integer.parseInt(request.getParameter("value_1_m"));
        }
        
        if(request.getParameter("value_2_m").length() != 0){
           canShowMultiply = true;
           value2M = Integer.parseInt(request.getParameter("value_2_m"));
        }
        
        if(canShowPlus)
        writer.append("<p>"+value1M+" + "+value2M+" = " +(value1M+value2M));
        
    }
  
}
