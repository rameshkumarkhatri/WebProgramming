/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.example.model.*;
import java.util.Iterator;
import java.util.List;
/**
 *
 * @author rameshkumar
 */
public class BeerSelect extends HttpServlet {

    public void doPost(HttpServletRequest request,
        HttpServletResponse response)
        throws IOException, ServletException {
        response.setContentType("text/html");
        String c = request.getParameter("color");
        BeerExpert be = new BeerExpert();
        List result = be.getBrands(c);
        request.setAttribute("styles", result);
        
//        PrintWriter out = response.getWriter();
//        
//        out.println("Beer Selection Advice<br>");
//        Iterator it = result.iterator();
//        while(it.hasNext()) {
//        out.print("<br>try: " + it.next());
//        }
        
//OR by JSP

        request.getRequestDispatcher("results.jsp").forward(request, response);

        
//        out.println("<br>Got beer color "+ c);
    }
    
    
}
