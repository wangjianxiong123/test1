<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 13765
  Date: 2018/4/26
  Time: 13:46
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
<table border="1" cellpadding="0" cellspacing="0">
<tr>
    <td>编号</td><td>名称</td><td>基本薪资</td><td>职位员工详情</td>
</tr>
<c:forEach items="${sessionScope.positions}" var="position">
    <tr>
        <td>${position.pos_id}</td>
        <td>${position.pos_name}</td>
        <td>${position.pos_salary}</td>
        <td>
            <form action="seachPositionDetail" method="post">
                <input type="submit" value="职位员工详情">
                <input type="hidden" name="pos_id" value="${position.pos_id}">
                <input type="hidden" name="pos_dept_id" value="${position.pos_dept_id}">
            </form>
        </td>
    </tr>
</c:forEach>
</table>
</body>
</html>
