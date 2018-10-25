<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <title>index</title>
</head>
<body>
    <h1 style="align-content: center">学生信息管理系统</h1>
    <table>
        <tr>
            <td><a href="${pageContext.request.contextPath}/student/add.jsp">添加学生</a></td>
            <td><a href="${pageContext.request.contextPath}/student/delete.jsp">删除学生</a></td>
            <td><a href="${pageContext.request.contextPath}/student/get.jsp">查询学生</a></td>
            <td><a href="${pageContext.request.contextPath}/student/update.jsp">更新学生</a></td>
        </tr>
    </table>
</body>
</html>
