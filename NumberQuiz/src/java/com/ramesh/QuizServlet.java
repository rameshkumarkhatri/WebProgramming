/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ramesh;

import com.ramesh.models.Quiz;
import com.ramesh.models.Type;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author rameshkumar
 */
public class QuizServlet extends HttpServlet {

    Quiz quiz = null;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String start = request.getParameter("start");
        HttpSession session = request.getSession();
        if ((start != null && start.equals("1")) || session.isNew()) {
            quiz = new Quiz(0, 0);
        } else {
            quiz = (Quiz) session.getAttribute("quiz");
            String answer = request.getParameter("answer");
            quiz.processAnswer(answer);
        }

        session.setAttribute("quiz", quiz);
        if (quiz.isQuizOver()) {
            getServletConfig().getServletContext().getRequestDispatcher("/results").forward(request, response);
            return;
//                out.println("<p>You have completed the Number Quiz, with score of "+quiz.getScore()+" out of "+Type.getQuestions().length+".</p>");
        }
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet QuizServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>The Number Quiz " + "</h1>");

            out.println("<form action = \"quiz\" method = \"post\">");
            out.println("<p>Your current score is " + quiz.getScore() + ".</p>");
//            out.println("<br/>");

            out.println("<p>Guess the next number in sequence.</p>");
//            out.println("<br/>");
            out.println("" + Type.getQuestions()[quiz.getType()]);
            out.println("<br/>");
            out.println("Your answer: <input type=\"text\" maxlength = \"5\" name=\"answer\"/>");
            out.println("<br/>");
            out.println("<input type=\"submit\"/>");

            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        }
    }

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
        processRequest(request, response);
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
        processRequest(request, response);
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

}
