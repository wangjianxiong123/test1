<%--
  Created by IntelliJ IDEA.
  User: 13765
  Date: 2018/4/27
  Time: 13:34
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
    <form method="post" action="addCheck">
        <input type="submit" name="check_begin" value="上班打卡">
    </form>

</body>
</html>
