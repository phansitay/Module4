<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 21/11/2022
  Time: 6:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/save" method="post">
    <input type="checkbox" value="Lettuce" name="condiment">Lettuce
    <input type="checkbox" value="Tomato" name="condiment">Tomato
    <input type="checkbox" value="Mustard" name="condiment">Mustard
    <input type="checkbox" value="Sprouts" name="condiment">Sprouts
    <br>
    <button type="submit">Save</button>
</form>

<h1>${kq}</h1>
</body>
</html>
