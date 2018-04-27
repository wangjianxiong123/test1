<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 13765
  Date: 2018/4/27
  Time: 10:42
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
        <td>编号</td><td>金额</td><td>时间</td><td>原因</td><td>员工编号</td><td>修改</td><td>删除</td>
    </tr>
    <c:forEach items="${sessionScope.pushiment}" var="pushi">
        <tr>
            <form action="updatePush" method="post">
                <td>${pushi.push_id}</td><td><input name="push_money" value="${pushi.push_money}"></td><td>${pushi.push_time}</td>
                <td><input name="push_cause" value="${pushi.push_cause}"></td>
                <td><input name="push_emp_id" value="${pushi.push_emp_id}"></td>
                <td><input type="submit" value="修改">
                    <input name="push_id" value="${pushi.push_id}" type="hidden">
                </td>
            </form>
            <td>
                <form action="deletePush" method="post">
                    <input type="submit" value="删除">
                    <input name="push_id" value="${pushi.push_id}" type="hidden">
                </form>
            </td>
        </tr>
    </c:forEach>
</table>
<form method="post" action="addPush">
    金额:<input type="number" name="push_money"><br>
    原因:<input type="text" name="push_cause"><br>
    员工工号:<input type="number" name="push_emp_id"><br>
    <input type="submit" value="添加">
</form>
</body>
</html>
