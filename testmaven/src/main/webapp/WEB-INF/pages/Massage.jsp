<%--
  Created by IntelliJ IDEA.
  User: 13765
  Date: 2018/4/25
  Time: 13:28
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
<a href="seachMassage2">未发布</a>
<a href="seachMassage">已发布</a>
</body>
</html>
