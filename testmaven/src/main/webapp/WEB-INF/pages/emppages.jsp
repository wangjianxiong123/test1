<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 13765
  Date: 2018/4/23
  Time: 11:01
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
        <td>编号</td><td>部门</td><td>职位</td><td>薪水</td><td>地址</td><td>修改</td><td>删除</td><td>查看详情</td>
    </tr>
    </thead>
    <c:forEach var="job" items="${sessionScope.jobs1}">
        <tr>

            <form action="updateAll" method="post">
                <td>${job.job_id}</td>
                <td><input name="job_dept_name" value="${job.job_dept_name}"></td>
                <td><input name="job_name" value="${job.job_name}"></td><td> <input name="job_salary" value="${job.job_salary}"></td>
                <td><input name="job_address" value="${job.job_address}"></td>
                <td>
                    <input type="submit" value="修改">
                    <input type="hidden" name="job_id" value="${job.job_id}">
                </td>
            </form>
            <td>
                <form method="post" action="/deleteG">
                    <input type="submit" value="删除">
                    <input type="hidden" name="job_id" value="${job.job_id}">
                </form>
            </td>
            <td>
                <form method="post" action="sendMessage">
                    <input type="submit" value="发布">
                    <input type="hidden"  name="job_id" value="${job.job_id}">

                </form>
            </td>
        </tr>
    </c:forEach>
</table>
<form method="post" action="addG">
    职位:<input name="job_name" type="text"><br>
    部门:<input name="job_dept_name"><br>
    薪资:<input name="job_salary" type="number"><br>
    地址:<input name="job_address" type="text"><br>
    <input type="submit" value="招聘">
</form>
</body>
</html>
