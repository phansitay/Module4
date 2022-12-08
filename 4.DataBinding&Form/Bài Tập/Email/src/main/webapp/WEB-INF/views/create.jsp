<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 05/12/2022
  Time: 6:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create</title>
</head>
<body>
<form:form action="create" method="post" modelAttribute="email">
    <label>English</label>
    <form:input type="text" path="language"/><br>
    <label>Page Size</label>
    <form:input type="text" path="size"/><br>
    <label>Spam filter</label>
    <form:checkbox path="spam">
        <form:options item ="enable spam filter"></form:options>
    </form:checkbox>
    <label>Gender</label>
    <%--    <form:select path="gender">--%>
    <%--        <form:options items="${genderList}"></form:options>--%>
    <%--    </form:select>--%>
    <%--    <form:checkboxes path="gender" items="${genderList}"></form:checkboxes>--%>
<%--    <form:radiobuttons path="gender" items="${genderList}"></form:radiobuttons>--%>
    <button type="submit">Create</button>

</form:form>
</body>
</html>
