<%-- 
    Document   : Quiz
    Created on : Oct 8, 2018, 4:09:33 PM
    Author     : rameshkumar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Number Quiz</title>
    </head>
    <body>
        <form method="get"
                action="quiz">
            Welcome to number quiz using JSP<p>
                <input type="hidden"  name="start" value="1">
            <center>
                <input type="submit" value="Start"/>
            </center>
        </form>
    </body>
</html>
