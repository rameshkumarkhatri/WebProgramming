<%-- 
    Document   : ResultJSP
    Created on : Oct 8, 2018, 9:55:37 PM
    Author     : rameshkumar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Quiz result</title>
    </head>
    <body><h1>The Number Quiz</h1>
         
            
            <p>Your current score is ${score}.</p>
            <p>Your grade is <span id="grade">${grade}</span>.</p>
            <p>${question}</p>
            <br/>

    </body>
</html>
