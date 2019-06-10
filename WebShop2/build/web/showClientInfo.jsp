<%-- 
    Document   : showClientInfo
    Created on : Jun 5, 2019, 9:15:44 AM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<br><center><h3>Подробная информация о покупателе</h3>
<link rel="stylesheet" href="CSS/showProductInfo.css">
<ul>
<div>
    Цена: ${client.name}<br>
    имя: ${client.surname}<br>
    Деньги: ${client.money}<br>
    Телефон: ${client.phone}<br>
</div>
</ul>
