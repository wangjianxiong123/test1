<%--
  Created by IntelliJ IDEA.
  User: 13765
  Date: 2018/4/23
  Time: 11:01
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
<table border="1" cellspacing="0" cellpadding="0">
    <thead>
    <tr>
        <td>姓名</td><td>年龄</td><td>性别</td><td>联系电话</td><td>部门</td><td>职位</td><td>薪水</td><td>地址</td><td>邮箱</td>
    </tr>
    </thead>
</table>
</body>
</html>
