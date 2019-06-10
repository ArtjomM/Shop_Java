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
<link rel="stylesheet" href="CSS/showListProducts.css" >
    <body>
        <center>
        <h1>Товары нашего магазина</h1>
        </center>
          <div align="center">
        <table>
          
            <c:forEach var="product" items="${listProducts}">
                <tr><th><p style="margin-left:20px">
                   
                <b>Название:</b> ${product.name}<br>
                <b>Цена:</b> ${product.price}<br>
                <b>Количество:</b> ${product.quantity};</p>
                        <a href="showProductInfo?ProductId=${product.id}">Подробная информация</a>
                </th></tr>
            </c:forEach>              
        </table>  
              </div>

    </body>
</html>
