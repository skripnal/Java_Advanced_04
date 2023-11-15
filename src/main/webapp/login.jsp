<%--
  Created by IntelliJ IDEA.
  User: skrip
  Date: 14.11.2023
  Time: 16:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="style/log-reg.css">
</head>
<body>
<div class="container">
    <h2>Логін</h2>
    <form action="loginServlet" method="post">
        <label for="email">Електронна пошта:</label>
        <input type="email" id="email" name="email" required>

        <label for="password">Пароль:</label>
        <input type="password" id="password" name="password" required>

        <button type="submit">Увійти</button>
    </form>
</div>
</body>
</html>
