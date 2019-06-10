<%-- 
    Document   : showProductInfo
    Created on : Jun 4, 2019, 1:55:35 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<br><center><h3>Подробная информация о продукте</h3>
<link rel="stylesheet" href="CSS/showProductInfo.css">
<ul>
    <center>
        <div>
    Цена: ${product.price}<br>
    имя ${product.name}<br>
    Кол-во: ${product.quantity}<br>
    </div>
    </center><br>
</ul>
