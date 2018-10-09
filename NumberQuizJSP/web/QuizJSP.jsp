<%-- 
    Document   : QuizJSP
    Created on : Oct 8, 2018, 4:17:26 PM
    Author     : rameshkumar
--%>
<%@ page import = "com.ramesh.models.Type" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Quiz</title>
    </head>
    <body>
         <h1>The Number Quiz</h1>
         
            <form action = "quiz" method = "post">
            <p>Your current score is ${score}.</p>
            <p>Guess the next number in sequence.</p>
            <p>${question}</p>
            <br/>
            Your answer: <input type="text" maxlength = "5" name="answer" />
            <input type ="hidden" name="number" value ="${questionNumber}" />
            <br/>
            <input type="submit"/>

    </body>
</html>
