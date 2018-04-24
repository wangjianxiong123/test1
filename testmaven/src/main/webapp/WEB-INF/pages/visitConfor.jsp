<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 13765
  Date: 2018/4/23
  Time: 17:22
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
        <td>职位</td><td>薪水</td><td>面试地址</td><td>面试时间</td><td>确认</td>
    </tr>
    </thead>
    <c:forEach var="visit" items="${sessionScope.visits}">
        <tr>
            <td>${visit.visit_job}</td> <td>${visit.visit_salary}</td><td>${visit.visit_address}</td>
            <td>${visit.visit_time}</td>
            <td>
                <form method="post" action="confin">
                    <input type="submit" value="确认">
                    <input type="hidden" name="vito_id" value="${visit.visit_vito_id}">

                </form>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
