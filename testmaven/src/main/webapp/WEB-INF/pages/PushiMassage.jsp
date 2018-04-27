<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 13765
  Date: 2018/4/27
  Time: 11:18
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
        <td>编号</td><td>金额</td><td>时间</td><td>原因</td>
    </tr>
    <c:forEach items="${sessionScope.pushiment}" var="pushi">
        <tr>
            <td>${pushi.push_id}</td><td>${pushi.push_money}</td><td>${pushi.push_time}</td>
            <td>${pushi.push_cause}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
