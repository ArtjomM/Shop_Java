<%-- 
    Document   : showListTakeProducts
    Created on : Apr 22, 2019, 10:13:58 AM
    Author     : user
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Выданные Товары</title>
    </head>
    <body>
        <h1>Список выданых товаров!</h1>
        <ul>
            <c:forEach var="history" items="${listHistories}">
                <li> 
                    Обувь: 
                    ${history.id}, Название ${history.product.name}, Куплена: ${history.beginDate}, Имя клиента: ${history.client.surname}
                </li>
            </c:forEach>
        </ul>
    </body>
</html>
