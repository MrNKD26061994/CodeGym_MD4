<%--
  Created by IntelliJ IDEA.
  User: ThinkPad
  Date: 10/12/2023
  Time: 11:02 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3 style="color:red">${message}</h3>
<h1>Hello Spring MVC</h1>
<h1>Hello: ${name}</h1>
<h1>Hello: ${email}</h1>

<span>Current time in ${city}: <strong>${date}</strong></span>
<form id="locale" action="world-clock" method="get">
    <select name="city" onchange="document.getElementById('locale').submit()">
        <option value="Asia/Ho_Chi_Minh" selected>Select a city</option>
        <option value="Asia/Ho_Chi_Minh">Ho Chi Minh</option>
        <option value="Singapore">Singapore</option>
        <option value="Asia/Hong_Kong">Hong Kong</option>
        <option value="Asia/Tokyo">Tokyo</option>
        <option value="Asia/Seoul">Seoul</option>
        <option value="Europe/London">London</option>
        <option value="Europe/Madrid">Madrid</option>
        <option value="America/New_York">New York</option>
        <option value="Australia/Sydney">Sydney</option>
        <option value="Argentina/Buenos_Aires">Buenos Aires</option>
    </select>
</form>

<form action="sandwich/send" method="post">
    <input type="checkbox" id="vehicle1" name="condiment" value="Lettuce">
    <label for="vehicle1">Lettuce</label><br>
    <input type="checkbox" id="vehicle2" name="condiment" value="Tomato">
    <label for="vehicle2">Tomato</label><br>
    <input type="checkbox" id="vehicle3" name="condiment" value="Mustard">
    <label for="vehicle3">Mustard</label><br>
    <input type="checkbox" id="vehicle4" name="condiment" value="Sprouts">
    <label for="vehicle4">Sprouts</label><br>

    <button>Send</button>
</form>
<c:forEach items="${condiment}" var="item">
    <h1>${item}</h1>
</c:forEach>
</body>
</html>
