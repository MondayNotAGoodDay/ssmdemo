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
    <title>AddStudent${pageContext.request.contextPath}</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/student/addStudent" method="post">
    <table border="1px">
        <caption>增加Student</caption>
        <tr>
            <td><label for="id">id</label></td>
            <td><input type="text" id="id" name="id"/></td>
        </tr>
        <tr>
            <td><label >姓名</label></td>
            <td><input type="text"  id="name" name="name"/></td>
        </tr>
        <tr>
            <td><label for="age">年龄</label></td>
            <td><input type="text" id="age" name="age"/></td>
        </tr>
        <tr>
            <td><label for="sex">性别</label> </td>
            <td><input type="text" id="sex" name="sex"/></td>
        </tr>
        <tr>
            <td colspan="1"><input type="submit" value="add"/></td>
        </tr>
    </table>
</form>
</body>
</html>
