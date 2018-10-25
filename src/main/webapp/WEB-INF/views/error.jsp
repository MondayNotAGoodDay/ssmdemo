<%--
  Created by IntelliJ IDEA.
  User: zifeng.deng
  Date: 10/23/2018
  Time: 10:26 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>error</title>
    <style>
        .error{
            color: red;
        }
    </style>
</head>
<body>
    <sf:form method="post" commandName="student" >
        <sf:input path="id" /><br>
        <sf:input path="name"/><sf:errors cssClass="error" path="name"/><br>
        <sf:input path="age"/><sf:errors cssClass="error" path="age"/><br>
        <sf:input path="sex"/><br>
    </sf:form>
</body>
</html>
