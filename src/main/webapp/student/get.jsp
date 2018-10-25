<%--
  Created by IntelliJ IDEA.
  User: zifeng.deng
  Date: 10/24/2018
  Time: 3:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>GetStudent</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/student/getStudent" >
    <table>
        <caption>根据id获取student</caption>
        <tr>
            <td>输入id:<input type="text" name="id"></td>
            <td><input type="submit" value="get"/></td>
        </tr>
    </table>
</form>
</body>
</html>
