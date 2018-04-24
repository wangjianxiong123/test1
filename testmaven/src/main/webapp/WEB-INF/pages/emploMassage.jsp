<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 13765
  Date: 2018/4/23
  Time: 13:28
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
        <td>编号</td><td>名称</td><td>薪水</td><td>地址</td><td>修改</td><td>删除</td><td>查看详情</td>
    </tr>
    </thead>
    <c:forEach var="job" items="${sessionScope.jobs}">
        <tr>

            <form action="" method="post">
            <td>${job.job_id}</td> <td><input name="job_name" value="${job.job_name}"></td><td> <input name="job_salary" value="${job.job_salary}"></td>
            <td><input name="job_address" value="${job.job_address}"></td>
                <td><input type="submit" value="修改"></td>
            </form>
            <td>
                <form method="post" action="send">
                    <input type="submit" value="删除">
                    <input type="hidden" name="id" value="${job.job_id}">
                </form>
            </td>
            <td>
                <form method="post" action="recordMessage">
                    <input type="submit" value="投递记录">
                    <input type="hidden"  name="rid" value="${job.job_id}">

                </form>
            </td>
        </tr>
    </c:forEach>
</table>
<a href="machsee">面试效果</a>
</body>
</html>
