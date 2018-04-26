<%--
  Created by IntelliJ IDEA.
  User: 13765
  Date: 2018/4/26
  Time: 9:09
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
<a href="trainDept">部门培训</a>
<a href="trainPosition">职位培训</a>
<a href="trainDeptPosition">专业培训</a>
</body>
</html>
