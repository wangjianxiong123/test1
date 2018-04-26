<%--
  Created by IntelliJ IDEA.
  User: 13765
  Date: 2018/4/20
  Time: 15:00
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
<a href="seachEmp">查看个人信息</a>
<a href="seachDeptMessag">查看部门信息</a>
<a href="trains">查看培训信息</a>
<a href="">奖惩</a>
<a href="">打卡</a>

</body>
</html>
