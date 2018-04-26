<%--
  Created by IntelliJ IDEA.
  User: 13765
  Date: 2018/4/23
  Time: 10:51
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
<a href="checkDept">查看部门</a>
<a href="seachMassage1">招聘信息</a>
<a href="trainCompany">公司培训</a>
<a></a>
</body>
</html>
