<%--
  Created by IntelliJ IDEA.
  User: zifeng.deng
  Date: 10/24/2018
  Time: 3:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>UpdateStudent</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/student/udpateStudent" >
    <table>
        <caption>根据id更新student</caption>
        <tr>
            <td>输入id:</td><td><input type="text" name="id"></td>
        </tr>
        <tr>
            <td>输入要更改的姓名:</td><td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td><input type="submit" value="update"/></td>
        </tr>
    </table>
</form>
</body>
</html>
