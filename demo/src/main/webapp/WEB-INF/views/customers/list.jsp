<%--
  Created by IntelliJ IDEA.
  User: ThinkPad
  Date: 10/12/2023
  Time: 2:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1 style="text-align: center;">CustomerList</h1>
<table id="a">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Email</th>
        <th>Address</th>
    </tr>

    <c:forEach var="customer" items="${customers}">
        <tr>
            <td><a href="customer?id=${customer.id}">${customer.id}</a></td>
            <td>${customer.name}</td>
            <td>${customer.email}</td>
            <td>${customer.address}</td>
        </tr>
    </c:forEach>
</table>
<script>
    let a = document.getElementById("a");
</script>
</body>
</html>
