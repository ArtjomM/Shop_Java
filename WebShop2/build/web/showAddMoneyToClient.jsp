<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="CSS/showAddMoneyToClient.css">
        <title>Добавить количество товара</title>
        <br><center>
        <form action="AddMoneyToClient" method="POST">
            <p>Список клиентов</p>
            <select name="clientId1">
                <c:forEach var="client1" items="${listClients}">
                    <option value="${client1.id}"> ${client1.name}</option>
                </c:forEach>
            </select><br><br>
            <input type="text" name="money1" placeholder="Введите кол-во"></input><br><br>
            <input type="submit" class="btn btn-success" value="Добавить кол-во денег"><br>
        </form><br>
             </center>