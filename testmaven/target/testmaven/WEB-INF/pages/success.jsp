<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 13765
  Date: 2018/4/20
  Time: 10:47
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
        <td>编号</td><td>名称</td><td>薪水</td><td>地址</td><td>投递</td>
    </tr>
    </thead>
    <c:forEach var="job" items="${sessionScope.jobs}">
        <tr>
            <td>${job.job_id}</td> <td>${job.job_name}</td><td>${job.job_salary}</td>
            <td>${job.job_address}</td>
            <td>
                <form method="post" action="send">
                    <input type="submit" value="投递">
                    <input type="hidden" name="id" value="${job.job_id}">

                </form>
            </td>
        </tr>
    </c:forEach>
</table>
${error}
${error1}
<form action="add" method="post">
    姓名:<input type="text" name="vito_name"><br>
    年龄:<input type="text" name="vito_age"><br>
    电话:<input type="text" name="vito_phone"><br>
    邮箱:<input type="text" name="vito_email"><br>
    <input type="submit" value="添加">
</form>
<a href="inform">面试通知</a>
</body>
</html>
