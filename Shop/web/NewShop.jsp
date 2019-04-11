<%-- 
    Document   : NewBook
    Created on : Apr 11, 2019, 12:56:29 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form action="createShop" method="POST">
        Название продукта: <br>
        <input type="text" name="name"><br>
        цена: <br>
        <input type="text" name="price"><br>
        количество: <br>
        <input type="text" name="quantity"><br>
        <input type="submit" value="Создать">
        </form>
    </body>
</html>
