<%@ page contentType="text/html;charset=UTF-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <title>index</title>

</head>
<body>
    <p>requeset.getContextPath() = </p><%= request.getContextPath()%><br>
    <%= basePath %><br>
    <%--pageContext.requset.contextPath = ${pageContext.requset.contextPath}</p>--%>
    <h2>Hello World!</h2>
    <form action="student/addStudent" method="get">
        <table>
            <caption>增加Student</caption>
            <tr>
                <td><label for="id">id</label></td>
                <td><input type="text" id="id"/></td>
            </tr>
            <tr>
                <td><label >姓名</label></td>
                <td><input type="text"  id="name"/></td>
            </tr>
            <tr>
                <td><label for="age">年龄</label></td>
                <td><input type="text" id="age"/></td>
            </tr>
            <tr>
                <td><label for="sex">性别</label> </td>
                <td><input type="text" id="sex"/></td>
            </tr>
            <tr>
                <td><input type="submit" value="add"/></td>
            </tr>
        </table>
    </form>
    <br>
    <br>
    <br>
    <form action="student/getStudent" >
        <table>
            <caption>根据id获取student</caption>
            <tr>
                <td>输入id:<input type="text" name="id"></td>
                <td><input type="submit" value="get"/></td>
            </tr>
        </table>
    </form>
    <br>
    <br>
    <br>

    <form action="student/deleteStudent" >
        <table>
            <caption>根据id删除student</caption>
            <tr>
                <td>输入id:<input type="text" name="id"></td>
                <td><input type="submit" value="delete"/></td>
            </tr>
        </table>
    </form>
    <br>
    <br>
    <br>
    <form action="student/udpateStudent" >
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
    <br>
    <br>
    <br>
    <form id="form1" action="/user/login" method="post">
        <table>
            <caption>Login</caption>
            <tr>
                <td>username</td><td><input type="text" name="username"/></td>
            </tr>
            <tr>
                <td>password</td><td><input type="password" name="password"/></td>
            </tr>
            <tr>
                <td><input type="submit" value="登陆"/></td>
                <td><button onclick="actionChange()">register</button></td>
            </tr>
        </table>
    </form>
<script>
    function actionChange(){
        document.getElementById("form1").action="/user/register";
    }
</script>
</body>
</html>
