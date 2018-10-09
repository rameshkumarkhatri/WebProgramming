/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ramesh;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author rameshkumar
 */
public class ChooseServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
//        if (session.isNew()) {
//            session.setAttribute("radioJSPCool", new RadioState());
//            session.setAttribute("JSFwayCool", new RadioState());
//            session.setAttribute("moonCheese", new RadioState());
//
//        }

        RequestDispatcher dispatch = request.getRequestDispatcher("Choose.jsp");
        dispatch.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        
        String radioJSPCool = request.getParameter("radioJSPCool");
        String JSFwayCool = request.getParameter("JSFwayCool");
        String moonCheese = request.getParameter("moonCheese");
        if(radioJSPCool != null)
            session.setAttribute("radioJSPCool", new RadioState(radioJSPCool));
        if(JSFwayCool != null)
            session.setAttribute("JSFwayCool", new RadioState(JSFwayCool));
        if(moonCheese != null)
            session.setAttribute("moonCheese", new RadioState(moonCheese));
//        if (choice != null) {
//            System.out.println("choice= " + choice);
//            
//        } else {
//            System.out.println("No choice made");
//        }
        RequestDispatcher dispatch = request.getRequestDispatcher("Choose.jsp");
        dispatch.forward(request, response);
    }

}
