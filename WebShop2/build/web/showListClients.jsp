<%-- 
    Document   : showListClients
    Created on : May 17, 2019, 8:54:26 AM
    Author     : user
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Список клиентов</title>
    </head>
    <body>
        фыв
        <ul>
            <c:forEach var="client" items="${listClients}">
               Имя: ${client.name}<br>
               Фамилия: ${client.surname}<br>
               Деньги ${client.money}<br>
               Телефон: ${client.phone}<br>
                <br>
            </c:forEach>
    </body>
</html>
