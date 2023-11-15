<%@ page import="ua.skripnal.model.DataBase" %>
<%@ page import="ua.skripnal.model.Magazine" %>
<%@ page import="ua.skripnal.model.User" %>


<%
    User user = (User) session.getAttribute("user");
%>



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
    <p><%=user.getEmail()%></p>
    <p>Баланс: <%=user.getBalance()%></p>
    <div class="header-link">
        <a href="/" class="login-link">Вийти</a>
    </div>
</header>

<div class="container">
    <%for (Magazine magazine : DataBase.getInstance().getMagazineList()){%>
    <div class="magazine">
        <h3><%=magazine.getTitle()%></h3>
        <p><%=magazine.getDescription()%></p>
        <p class="price"><%=magazine.getPrice() + " грн."%></p>
        <%if (user.getUserMagazineList().contains(magazine)){%>
            <form action="removeUserMagazineServlet" method="post">
                <button type="submit" name="magazineId" value="<%=magazine.getId()%>">Відписатися</button>
            </form>
        <%}else {%>
            <form action="addUserMagazineServlet" method="post">
                <button type="submit" name="magazineId" value="<%=magazine.getId()%>">Підписатися</button>
            </form>
        <%}%>
    </div>
    <%}%>
</div>

</body>
</html>
