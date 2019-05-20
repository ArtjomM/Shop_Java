<%-- 
    Document   : showListProducts
    Created on : Apr 22, 2019, 10:13:31 AM
    Author     : user
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Список товара</title>
    </head>
    <body>
        <h1>Товары нашего магазина</h1>
        <ul>
            <c:forEach var="product" items="${listProducts}">
                Название: ${product.name}<br>
                Цена: ${product.price}<br>
                Количество: ${product.quantity};<br><br>
            </c:forEach>
        </ul>    
    </body>
</html>
