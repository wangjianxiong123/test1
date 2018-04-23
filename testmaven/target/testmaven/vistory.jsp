<%--
  Created by IntelliJ IDEA.
  User: 13765
  Date: 2018/4/20
  Time: 11:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>"/>
    <title></title>
</head>
<body>
<fieldset>
    <legend>LOGIN</legend>
    <form action="login" method="post">
        账号:<input name="v_name"><br>
        密码:<input type="password" name="v_pass"><br>
        <input type="submit" value="登录">
    </form>
    <a href="regin.jsp">注册</a>
</fieldset>
</body>
</html>
