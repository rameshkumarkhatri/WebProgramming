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
public class QuizServlet extends HttpServlet {

   public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       request.getSession().setAttribute("score", 0);
       request.getSession().removeAttribute("1");
       request.getSession().removeAttribute("2");
       request.getSession().removeAttribute("3");
       request.getSession().removeAttribute("4");
       request.getSession().removeAttribute("0");
       request.getSession().setAttribute("questionNumber", 0);
       request.getSession().setAttribute("0", new Quiz(0,0));
       request.setAttribute("question", Type.getQuestions()[0]);

       RequestDispatcher dispatcher = request.getRequestDispatcher("QuizJSP.jsp");
       dispatcher.forward(request, response);
   }
   
   public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

       HttpSession session = request.getSession();
       int score = (int) session.getAttribute("score");
       int questionNumber = -1;
       if(session.getAttribute("questionNumber") != null){
            questionNumber =  (int) session.getAttribute("questionNumber");
       }
       if(questionNumber == -1){
           questionNumber = 0;
           session.setAttribute("0", new Quiz(0,0));
       }else {
           Quiz quiz = (Quiz) session.getAttribute(questionNumber+"");
           if(quiz == null) quiz = new Quiz(0,0);
           if(quiz.processAnswer(request.getParameter("answer"))){
               score+=quiz.getScore();
               session.setAttribute("score", score);
               questionNumber++;
               session.setAttribute(""+questionNumber, new Quiz(questionNumber,0));               
           }else session.setAttribute(""+questionNumber, quiz);
       }
       session.setAttribute("questionNumber", questionNumber);
       if(questionNumber>=5){
          session.setAttribute("grade", Quiz.calculateGrade(score));
       }else request.setAttribute("question", Type.getQuestions()[questionNumber]);
       
       RequestDispatcher dispatcher = request.getRequestDispatcher(questionNumber>=5? "ResultJSP.jsp":"QuizJSP.jsp");
       dispatcher.forward(request, response);
   }
   
   
}
