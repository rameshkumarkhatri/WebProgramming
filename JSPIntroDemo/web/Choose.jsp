<%-- 
    Document   : Choose
    Created on : Oct 8, 2018, 2:33:05 PM
    Author     : rameshkumar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Choose</title>
    </head>
    <body>
        <form method='post' action='ChooseServlet'>
            <p>Is JSP cool?</p>
            <input type='radio' value='1' name='radioJSPCool' 
                   ${radioJSPCool.yes}
                           ><span>Yes</span><br/>
            <input type='radio' value='0' name='radioJSPCool'  ${radioJSPCool.no}><span>No</span><br/>
            <input type='submit' name='btnSubmit' value='Submit'/>
            <p>Is JSF way cool?</p>
            <input type='radio' value='1' name='JSFwayCool'  ${JSFwayCool.yes} ><span>Yes</span><br/>
            <input type='radio' value='0' name='JSFwayCool'  ${JSFwayCool.no}><span>No</span><br/>
            <input type='submit' name='btnSubmit' value='Submit'/>
            <p>Is the moon made of cheese?</p>
            <input type='radio' value='1' name='moonCheese'  ${moonCheese.yes}><span>Yes</span><br/>
            <input type='radio' value='0' name='moonCheese'  ${moonCheese.no}><span>No</span><br/>
            <input type='submit' name='btnSubmit' value='Submit'/>
        </form>
    </body>
</html>
