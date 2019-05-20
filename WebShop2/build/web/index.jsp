<%-- 
    Document   : index
    Created on : Apr 5, 2019, 9:36:11 AM
    Author     : user
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Привет</h1>
        ${info}<br>
        <a href="showNewProduct">Новая обувь</a><br>
        <a href="showNewClient">Новый покупателб</a><br>
        <a href="showListProducts">Список обуви</a><br>
        <a href="showListClients">Список покупателей</a><br>
        <a href="showTakeProductToClient">Купить обувь</a><br>
        <a href="showListTakeProducts">Список покупок<br>
    </body>
</html>
