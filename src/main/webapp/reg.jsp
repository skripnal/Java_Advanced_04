<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="style/log-reg.css">
</head>
<body>

<div class="container">
    <h2>Реєстрація</h2>
    <form action="registrationServlet" method="post">
        <label for="firstName">Ім'я</label>
        <input type="text" id="firstName" name="firstName" required>

        <label for="lastName" >Прізвище</label>
        <input type="text" id="lastName" name="lastName" required>

        <label for="email">Електронна пошта:</label>
        <input type="email" id="email" name="email" required>

        <label for="password">Пароль:</label>
        <input type="password" id="password" name="password" required>

        <button type="submit">Зареєструватися</button>
    </form>
</div>
</body>
</html>