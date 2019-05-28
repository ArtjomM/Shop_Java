<%-- 
    Document   : showTakeProductToClient
    Created on : Apr 22, 2019, 10:14:16 AM
    Author     : user
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Выдать товар покупателю</title>
    </head>
    <link rel="stylesheet" href="CSS/showTakeProductToClient.css">
    <body>
        <center>
        <form action="takeProductToClient" method="POST">
            
            Список покупателей:<br>
            <select name="clientId">
                <c:forEach var="client" items="${listClients}">
                    <option value="${client.id}">${client.name} ${client.surname}</option>
                </c:forEach>
            </select><br><br>
            Список товара:<br>
            <select name="productId">
                <c:forEach var="product" items="${listProducts}">
                    <option value="${product.id}">${product.name}, Цена:${product.price}</option>
                </c:forEach>
            </select><br><br>
            <input type="text" name="count" placeholder="Введите кол-во"></input><br>
            <input type="submit" value="Купить вещь">
        </form>
        </center>
    </body>
</html>
