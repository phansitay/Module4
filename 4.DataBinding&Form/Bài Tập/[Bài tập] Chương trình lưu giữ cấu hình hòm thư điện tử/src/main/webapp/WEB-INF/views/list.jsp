<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 05/12/2022
  Time: 6:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/create">Create Student</a>
<p style="color: blue">${msg}</p>
<table border="1">
    <tr>
        <th>LANGUAGES</th>
        <th>PAGE SIZE</th>
        <th>SPAMS FILTER</th>
        <th>SIGNATURE</th>
    </tr>
    <c:forEach var="temp" items="${emailList}">
        <tr>
            <td>
                    ${temp.language}
            </td>
            <td>
                    ${temp.size}
            </td>
            <td>
                    ${temp.spam}
            </td>
            <td>
                    ${temp.signature}
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
