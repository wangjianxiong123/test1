<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 13765
  Date: 2018/4/24
  Time: 9:49
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
        <td>编号</td><td>名称</td><td>创建时间</td><td>修改</td><td>删除</td><td>部门员工详情</td>
    </tr>
    <c:forEach items="${sessionScope.depts}" var="dept">
        <tr>
            <form action="updateDept" method="post">
            <td>
            ${dept.dept_id}</td><td><input name="dept_name" value="${dept.dept_name}"></td><td>${dept.dept_ctime}</td>
                <td><input type="submit" value="修改">
                <input name="dept_id" value="${dept.dept_id}" type="hidden">
                </td>
            </form>
            <td>
            <form action="deleteDept" method="post">
                <input type="submit" value="删除">
                <input name="dept_id" value="${dept.dept_id}" type="hidden">
            </form>
            </td>
            <td>
            <form action="seachDept" method="post">
                <input type="submit" value="部门员工详情">
                <input name="dept_id" value="${dept.dept_id}" type="hidden">
            </form>
            </td>
        </tr>
    </c:forEach>
</table>
<form action="addDept" method="post">
    部门名称:<input name="dept_name"  type="text">
    <input type="submit" value="创建部门">
</form>
<h4 style="color: red">${error}</h4>
</body>
</html>
