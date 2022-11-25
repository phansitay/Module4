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
<h1 style="text-align: center;color: red;height: 50px;width: 100%;background-color: antiquewhite">CACULATOR</h1>
<form action="/save" method="post">
    <input type="text" name="a"value="${a}" style="width: 40%;left: 10%">
    <input type="text" name="b"value="${b}" style="width: 40%">
    <br>
    <button value="+" name="toan">Addition(+)</button>
    <button value="-" name="toan">Subtraction(-)</button>
    <button value="*" name="toan">Multiplycation(*)</button>
    <button value="/" name="toan">Division(/)</button>
</form>

<h1>${kq}</h1>
</body>
</html>
