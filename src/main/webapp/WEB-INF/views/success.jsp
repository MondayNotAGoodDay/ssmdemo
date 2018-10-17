<%--
  Created by IntelliJ IDEA.
  User: zifeng.deng
  Date: 9/11/2018
  Time: 3:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>login successfully</title>
    <style>
        .error{
            color: red;
        }
    </style>
</head>

<body>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

    <c:if test="{allErrors}!=null">
        <c:forEach var="errors" items="${allErrors}">
            <p color="red">${errors.defaultMessage}</p><br/>
        </c:forEach>
    </c:if>

    <br>
    basePath:       <%= basePath %><br>
    ctx:            ${pageContext.request.contextPath}
    <br>
    student.id =    ${student.id}<br>
    student.name =  ${student.name}<br>
    student.age =   ${student.age}<br>
    student.sex =   ${student.sex}<br>
    user's pwd: =   ${user.password}<br>
    user's username=${user.username}<br>

    <sf:form method="post" commandName="student" >
        <sf:input path="id" /><br>
        <sf:input path="name"/><br>
        <sf:input path="age"/><sf:errors cssClass="error" path="age"/><br>
        <sf:input path="sex"/><br>

    </sf:form>
</body>
</html>
