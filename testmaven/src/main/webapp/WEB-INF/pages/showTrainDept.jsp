<%--
  Created by IntelliJ IDEA.
  User: 13765
  Date: 2018/4/26
  Time: 13:10
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
        <td>主题</td><td>内容</td><td>部门</td><td>职位</td><td>开始时间</td><td>结束时间</td><td>培训地点</td>
    </tr>
    <tr>
        <td>${sessionScope.trains.train_theme}</td><td>${sessionScope.trains.train_content}</td><td>${sessionScope.trains.train_dept}</td>
        <td>${sessionScope.trains.train_position}</td><td>${sessionScope.trains.train_begin}</td><td>${sessionScope.trains.train_end}</td>
        <td>${sessionScope.trains.train_address}</td>
    </tr>
</table>
</body>
</html>
