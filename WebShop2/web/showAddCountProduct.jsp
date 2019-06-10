<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="CSS/showAddCountProduct.css">
        <title>Добавить количество товара</title>
        <center>
        <form action="AddCountProduct" method="POST">
            <br><p>Список товара</p>
            <select name="productId1">
                <c:forEach var="product1" items="${listProducts}">
                    <option value="${product1.id}">${product1.name}, Цена: ${product1.price}</option>
                </c:forEach>
            </select><br><br>
            <input type="text" name="count1" placeholder="Введите кол-во"></input><br><br>
            <input type="submit" class="btn btn-success" value="Добавить кол-во вещи"><br>
        </form><br>
             </center>