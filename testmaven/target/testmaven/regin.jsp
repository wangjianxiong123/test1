<%--
  Created by IntelliJ IDEA.
  User: 13765
  Date: 2018/4/20
  Time: 15:07
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
<fieldset>69
    <legend>REGIST</legend>
    <form action="regin" method="post">
        账号:<input name="v_name"><br>
        密码:<input type="password" name="v_pass"><br>
        <input type="submit" value="注册">
    </form>
    <h4 style="color: red">${error}</h4>
</fieldset>
</body>
</html>
