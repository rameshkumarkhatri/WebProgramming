<%-- 
    Document   : index
    Created on : Oct 10, 2018, 2:24:51 AM
    Author     : rameshkumar
--%>
<%@ taglib prefix='mytag' uri="./WEB-INF/tlds/SimpleTagLib.tld"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <mytag:Head thecolor="red" words="Hello world" />
    </body>
</html>
