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
            <a href="login.jsp" class="login-link">Логін</a>
            <a href="reg.jsp" class="reg-link">Реєстрація</a>
        </div>
    </header>

    <div class="container">
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
