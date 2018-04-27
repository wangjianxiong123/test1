<%--
  Created by IntelliJ IDEA.
  User: 13765
  Date: 2018/4/27
  Time: 13:40
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
        <td>上班打卡时间:</td><td>${sessionScope.check_begin}</td>
    </tr>
    <tr>
        <td>下班打卡:</td>
        <td>
            <form method="post" action="updateCheck">
                <input type="submit" value="下班打卡">
                <input type="hidden" name="check_emp_id" value="${sessionScope.check_emp_id}">
                <input type="hidden" name="check_begin" value="${sessionScope.check_begin}">
            </form>
        </td>
    </tr>
</table>
</body>
</html>
