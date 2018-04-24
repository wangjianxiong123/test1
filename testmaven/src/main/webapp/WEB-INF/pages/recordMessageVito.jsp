<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 13765
  Date: 2018/4/23
  Time: 14:42
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
        <td>编号</td><td>姓名</td><td>年龄</td><td>性别</td><td>学历</td><td>联系电话</td><td>邮箱</td><td>状态</td><td>通知面试</td>
    </tr>
    <c:forEach var="jobs" items="${sessionScope.job1.vitos}">
        <tr>
            <td>${jobs.vito_id}</td><td>${jobs.vito_name}</td><td>${jobs.vito_age}</td>
            <td>${jobs.vito_sex}</td><td>${jobs.vito_school}</td><td>${jobs.vito_phone}</td>
            <td>${jobs.vito_email}</td><td>${jobs.vito_state}</td>
            <td>
                <form method="post" action="seeVistoty">
                    <input type="submit" value="通知面试">
                    <input type="hidden"  name="job_id" value="${sessionScope.job1.job_id}">
                    <input type="hidden" name="visitory_id" value="${jobs.vito_vis_id}">
                    <input type="hidden" name="vito_id" value="${jobs.vito_id}">
                </form>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
