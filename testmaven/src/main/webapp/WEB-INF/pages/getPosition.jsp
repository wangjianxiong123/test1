<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 13765
  Date: 2018/4/25
  Time: 9:50
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
    <td>编号</td><td>名称</td><td>基本薪资</td><td>修改</td><td>删除</td><td>职位员工详情</td>
</tr>
<c:forEach items="${sessionScope.positions}" var="position">
    <tr>

        <form action="updatePosition" method="post">
            <td>${position.pos_id}</td>
            <td><input name="pos_name" value="${position.pos_name}"></td>
            <td><input name="pos_salary" value="${position.pos_salary}"></td>
        <td>
            <input type="submit" value="修改">
            <input type="hidden" name="pos_id" value="${position.pos_id}">
            <input type="hidden" name="pos_dept_id" value="${position.pos_dept_id}">
        </td>
        </form>
        <td>
            <form action="deletePosition" method="post">
                <input type="submit" value="删除">
                <input type="hidden" name="pos_id" value="${position.pos_id}">
                <input type="hidden" name="pos_dept_id" value="${position.pos_dept_id}">
            </form>
        </td>
        <td>
            <form action="seachPosition" method="post">
                <input type="submit" value="职位员工详情">
                <input type="hidden" name="pos_id" value="${position.pos_id}">
                <input type="hidden" name="pos_dept_id" value="${position.pos_dept_id}">
            </form>
        </td>
    </tr>
</c:forEach>
</table>
<form method="post" action="addPosition">
    职位名称<input name="pos_name" type="text"><br>
    职位薪资<input name="pos_salary" type="number">
    <input type="hidden" name="dept_id" value="${sessionScope.dept_id}">
    <input type="submit" value="添加职位">
</form>
</body>
</html>
