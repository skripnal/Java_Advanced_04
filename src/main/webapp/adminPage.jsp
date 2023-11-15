<%@ page import="ua.skripnal.model.DataBase" %>
<%@ page import="ua.skripnal.model.Magazine" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Каталог журналів</title>
    <link rel="stylesheet" href="style/style.css">
</head>
<body>

<header>
    <h1 class="header-title">Каталог журналів</h1>
    <div class="header-link">
        <a href="/" class="login-link">Вийти</a>
    </div>
</header>

<div class="container">
    <div class="magazine">
        <form action="adminAddMagazineSetvlet" method="post">
            <label for="adminTitleInput">Назва журналу:</label>
            <input type="text" id="adminTitleInput" name="adminTitleInput" required><br>
            <label for="adminDescriptionInput">Опис журналу:</label>
            <input type="text" id="adminDescriptionInput" name="adminDescriptionInput" required><br>
            <label for="adminCostInput">Ціна журналу:</label>
            <input type="text" id="adminCostInput" name="adminCostInput" required>
            <button type="submit">Додати</button>
        </form>
    </div>

    <%for (Magazine magazine : DataBase.getInstance().getMagazineList()){%>
    <div class="magazine">
        <h3><%=magazine.getTitle()%></h3>
        <p><%=magazine.getDescription()%></p>
        <p class="price"><%=magazine.getPrice() + " грн."%></p>
    </div>
    <%}%>
</div>

</body>
</html>
