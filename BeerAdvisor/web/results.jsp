<%-- 
    Document   : results
    Created on : Oct 10, 2018, 1:38:20 AM
    Author     : rameshkumar
--%>
<%@ page import="java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Result</title>
    </head>
    <body>

        <h1 align="center">Beer Recommendations JSP</h1> <p>
            <% List styles = (List) request.getAttribute("styles");
                Iterator it = styles.iterator();
                while (it.hasNext()) {

                    out.print("<br >try : " + it.next());
            }
            %>
            
            <!--OR-->
            
            <c:forEach var="style" items="${styles}" >
               <br> try:   ${style} 
            </c:forEach>
    </body>
</html>
