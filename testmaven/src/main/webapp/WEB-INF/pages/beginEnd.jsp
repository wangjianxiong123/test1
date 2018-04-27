<%--
  Created by IntelliJ IDEA.
  User: 13765
  Date: 2018/4/27
  Time: 14:17
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
    <tr>
        <td>上班打卡时间:</td><td>${sessionScope.checkWork.check_begin}</td>
    </tr>
    <tr>
        <td>下班打卡时间:</td>
        <td>
            ${sessionScope.checkWork.check_end}
        </td>
    </tr>
</table>
<a href="backrsu">返回</a>
</body>
</html>
