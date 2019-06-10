<%@page contentType="text/html" pageEncoding="UTF-8"%>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Новый покупатель</title>
    <link rel="stylesheet" href="CSS/showNewClient.css">
        <center>
        <h1>Покупатель!</h1>
        <form action="createClient" method="POST">
            <p>Имя:</p>
            <input type="text" name="nameClient">
            <br><p>Фамалия:</p>
            <input type="text" name="surname">
            <br><p>Деньги:</p>
            <input type="text" name="money">
            <br><p>Телефон</p>
            <input type="text" name="phone"><br>
            <br><input type="submit" class="btn btn-success" value="Create">
        </form>
        </center>
