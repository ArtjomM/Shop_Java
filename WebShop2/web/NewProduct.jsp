<%-- 
    Document   : NewProduct
    Created on : Apr 11, 2019, 9:37:40 PM
    Author     : artjo
--%>

<title>Создание продукта</title>
    <link rel="stylesheet" href="CSS/NewProduct.css">

        <center>
        <h1>Продукт!</h1>
        <form action="createProduct" method="POST">
            <p>Название продукта:</p>
            <input type="text" name="name">
            <p>Цена:</p>
            <input type="text" name="price">
            <p>Количество:</p>
            <input type="text" name="quantity"><br>
            <br><input type="submit" class="btn btn-success" value="Create">
            
        </form><br>
        </center>