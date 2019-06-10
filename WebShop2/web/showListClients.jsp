<%-- 
    Document   : showListClients
    Created on : May 17, 2019, 8:54:26 AM
    Author     : user
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Список клиентов</title>
    <link rel="stylesheet" href="CSS/showListClients.css">
 
        <br><h1>Наши клиенты</h1>

        <ul>
            <div>
            <c:forEach var="client" items="${listClients}">
               Имя: ${client.name}<br>
               Фамилия: ${client.surname}<br>
               <a href="showClientInfo?ClientId=${client.id}">Подробная информация</a><br>
            </c:forEach>
                </div><br>
                </ul>