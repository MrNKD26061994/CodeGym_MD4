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
    <form method="post" action="/create">
        <fieldset>
            <legend>Customer Information</legend>
            <table>
                <tr>
                    <td>ID</td>
                    <td><input type="text" name="id" value="${customer.id}" hidden="hiddens"></td>
                </tr>
                <tr>
                    <td>Name</td>
                    <td><input type="text" name="name" value="${customer.name}"></td>
                </tr>
                <tr>
                    <td>Email</td>
                    <td><input type="text" name="email" value="${customer.email}"></td>
                </tr>
                <tr>
                    <td>Address</td>
                    <td><input type="text" name="address" value="${customer.address}"></td>
                </tr>

                <tr>
                    <td></td>
                    <td><input type="submit" value="Update"></td>
                </tr>
            </table>
        </fieldset>
    </form>
</body>
</html>
