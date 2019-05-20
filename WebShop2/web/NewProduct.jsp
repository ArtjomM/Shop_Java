<%-- 
    Document   : NewProduct
    Created on : Apr 11, 2019, 9:37:40 PM
    Author     : artjo
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
        
        <form action="createProduct" method="POST">
            Название продукта:<br>
            <input type="text" name="name">
            <br>Цена:<br>
            <input type="text" name="price">
            <br>Количество:<br>
            <input type="text" name="quantity"><br>
            <input type="submit" value="Create">
        </form>
    </body>
</html>
