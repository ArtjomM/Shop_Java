<%-- 
    Document   : showListTakeProducts
    Created on : Apr 22, 2019, 10:13:58 AM
    Author     : user
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Выданные Товары</title>
    <link rel="stylesheet" href="CSS/showListTakeProducts.css" >
        <center>
        <h1>Список покупок!</h1>
           </center>
    <div>
        <table>
            <c:forEach var="history" items="${listHistories}">
                   <tr><th><p style="margin-left:20px"> <b>Название:</b> ${history.product.name}, 
                               <br><b>Куплена:</b> ${history.beginDate}, 
                               <br><b>Имя клиента:</b>  ${history.client.name}, 
                               <br><b>Фамилия клиента: ${history.client.surname}</b></p></th></tr>
            </c:forEach>
        </table>
</div>