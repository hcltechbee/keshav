<%-- 
    Document   : login.jsp
    Created on : 27 Oct, 2020, 2:34:19 PM
    Author     : hppc--
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>ENTER CREDENTIALS!</h1>
        <form method="POST" action="j_security_check">
            
            ENTER USERNAME :- <input type="text" name="j_username"><br>
            <br>
            ENTER PASSWORD :- <input type="text" name="j_password">
            <br>
            <br>
            
            <input type="submit" value="login">
            
        </form>
    </body>
</html>
