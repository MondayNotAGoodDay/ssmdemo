<%--
  Created by IntelliJ IDEA.
  User: zifeng.deng
  Date: 10/24/2018
  Time: 3:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<form action="user/login" method="post">
    <table>
        <caption>Login</caption>
        <tr>
            <td>username:</td>
            <td><input type="text" name="username"/></td>
        </tr>
        <tr>
            <td>password:</td>
            <td><input type="password" name="password"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="Login"/></td>
            <td><input type="button" value="注册" id="register"/></td>
        </tr>
    </table>
</form>
<script>

</script>
</body>
</html>
