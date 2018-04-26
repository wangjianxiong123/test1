<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 13765
  Date: 2018/4/26
  Time: 13:43
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
        <td>编号</td><td>名称</td><td>创建时间</td><td>部门详情</td>
    </tr>
    <c:forEach items="${sessionScope.depts}" var="dept">
        <tr>
            <td>${dept.dept_id}</td><td>${dept.dept_name}</td><td>${dept.dept_ctime}</td>
            <td>
                <form action="seachDeptDetail" method="post">
                    <input type="submit" value="部门详情">
                    <input name="dept_id" value="${dept.dept_id}" type="hidden">
                </form>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
