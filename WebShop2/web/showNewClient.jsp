<%-- 
    Document   : NewClient
    Created on : Apr 11, 2019, 9:57:43 PM
    Author     : artjo
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <link rel="stylesheet" href="CSS/showNewClient.css">
    <body>
        <center>
        <h1>Hello World!</h1>
        
        <form action="createClient" method="POST">
            Имя:<br>
            <input type="text" name="nameClient">
            <br>Фамалия:<br>
            <input type="text" name="surname">
            <br>Деньги:<br>
            <input type="text" name="money">
            <br>Телефон<br>
            <input type="text" name="phone"><br>
            <input type="submit" value="Create">
        </form>
        </center>
    </body>
</html>
