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
<form action="/chuyen" method="post">

    <label for="">CHỈ NHẬP MỘT TRONG CÁC TỪ SAU ĐÂY ("hello","list","student","teacher","goodbye","class","one","ten")</label>
    <br>
    <label for="">ENGLIST</label>
    <input type="text" value="${tu}" name="tu"><br>
    <label for="">VIETNAMES</label>
    <input type="text" value="${kq}" name="" id="">
    <input type="submit" value="ok">
</form>
</body>
</html>
