<%--
  Created by IntelliJ IDEA.
  User: 13765
  Date: 2018/4/23
  Time: 15:40
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
        <td>职位:</td><td>${sessionScope.job.job_name}</td>
        <td>薪水:</td><td>${sessionScope.job.job_salary}</td>
    </tr>
    <tr>
        <td>面试地址:</td><td>${sessionScope.job.job_address}</td>
        <form action="addVisit" method="post">
            <td>
                面试时间:<input type="datetime-local" name="time">
                <input type="submit" value="发送">
                <input type="hidden" name="job_name" value="${sessionScope.job.job_name}">
                <input type="hidden" name="job_salary" value="${sessionScope.job.job_salary}">
                <input type="hidden" name="job_address" value="${sessionScope.job.job_address}">
                <input type="hidden" name="vistory_id" value="${sessionScope.visitory_id}">
                <input type="hidden" name="vito_id" value="${sessionScope.vito_id}">
            </td>
        </form>
    </tr>
</table>
</body>
</html>
