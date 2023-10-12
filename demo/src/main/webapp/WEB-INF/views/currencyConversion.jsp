<%--
  Created by IntelliJ IDEA.
  User: ThinkPad
  Date: 10/12/2023
  Time: 2:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form method="POST" action="/currency">
        <fieldset>
            <legend>Currency Conversion Information</legend>
            <table>
                <tr>
                    <td>Input</td>
                    <td><input type="text" name="input" value="${input}"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Update"></td>
                </tr>
                <tr>
                    <td>Result</td>
                    <td>${result}</td>
                </tr>
            </table>
        </fieldset>
    </form>
</body>
</html>
