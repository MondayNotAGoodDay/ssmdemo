<%--
  Created by IntelliJ IDEA.
  User: zifeng.deng
  Date: 9/11/2018
  Time: 3:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>login successfully</title>
</head>

<body>
    basePath:       <%= basePath %><br>
    ctx:            ${pageContext.request.contextPath}
    <br>
    student.id =    ${student.id}<br>
    student.name =  ${student.name}<br>
    student.age =   ${student.age}<br>
    student.sex =   ${student.sex}<br>
    user's pwd: =   ${user.password}<br>
    user's username=${user.username}<br>

    <c:out value="shit" escapeXml="true">fuck you</c:out>
    <table border="1px">
        <caption>学生列表</caption>
        <tr>
            <th>id</th><th>姓名</th><th>年龄</th><th>性别</th>
        </tr>
        <c:forEach items="${list}" var="stua">
            <tr>
                <td>${stua.id}</td>
                <td>${stua.name}</td>
                <td>${stua.age}</td>
                <td>${stua.sex}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
