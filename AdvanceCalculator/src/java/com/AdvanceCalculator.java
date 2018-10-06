package com;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class AdvanceCalculator extends HttpServlet {

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.append("<form action=\"Adv-Calc.do\" method=\"post\">\n"
                + "            <input type =\"text\" name=\"v_1_p\" size = \"6\" maxlength=\"6\" value=\"" + request.getParameter("v_1_p") + "\"/> + \n"
                + "            <input type =\"text\" name=\"v_2_p\" size = \"6\" maxlength=\"6\" value=\"" + request.getParameter("v_2_p") + "\"/> =\n"
                + "            <input type =\"text\" name=\"addition\" size = \"6\" maxlength=\"6\" value=\"" + getSum(request) + "\"/> \n"
                + "              <br/>\n"
                + "           <input type =\"text\" name=\"v_1_m\" size = \"6\" maxlength=\"6\" value=\"" + request.getParameter("v_1_m") + "\"/> * \n"
                + "           <input type =\"text\" name=\"v_2_m\" size = \"6\" maxlength=\"6\" value=\"" + request.getParameter("v_2_m") + "\"/> =\n"
                + "           <input type =\"text\" name=\"multiply\" size = \"6\" maxlength=\"6\" value=\"" + getMultiply(request) + "\"/> \n"
                + "            <br/>\n"
                + "            <input type =\"submit\"/>\n"
                + "            \n"
                + "        </form>");
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private String getSum(HttpServletRequest request) throws IOException {
        if (!request.getParameter("v_1_p").isEmpty() && !request.getParameter("v_2_p").isEmpty()) {
            int sum = Integer.parseInt(request.getParameter("v_1_p")) + Integer.parseInt(request.getParameter("v_2_p"));
            return String.valueOf(sum);
        }
        return "";
    }

    private String getMultiply(HttpServletRequest request) throws IOException {
        if (!request.getParameter("v_1_m").isEmpty() && !request.getParameter("v_2_m").isEmpty()) {
            int sum = Integer.parseInt(request.getParameter("v_1_m")) * Integer.parseInt(request.getParameter("v_2_m"));
            return String.valueOf(sum);
        }
        return "";
    }
}
