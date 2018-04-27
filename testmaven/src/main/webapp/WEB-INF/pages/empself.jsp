<%--
  Created by IntelliJ IDEA.
  User: 13765
  Date: 2018/4/25
  Time: 16:41
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
        <td>姓名</td><td>年龄</td><td>性别</td><td>电话</td><td>邮箱</td><td>入职日期</td><td>部门</td><td>职位</td><td>薪水</td><td>修改</td>
    </tr>
    <tr>
        <form action="updateEmploy" method="post">
        <td><input name="emp_name" value="${sessionScope.employ1.emp_name}"></td><td><input name="emp_age" value="${sessionScope.employ1.emp_age}"></td><td><input name="emp_sex" value="${sessionScope.employ1.emp_sex}"></td>
        <td><input name="emp_phone" value="${sessionScope.employ1.emp_phone}"></td><td>${sessionScope.employ1.emp_email}</td><td>${sessionScope.employ1.emp_time}</td>
        <td>${sessionScope.dept1.dept_name}</td><td>${sessionScope.position1.pos_name}</td><td>${sessionScope.employ1.emp_sal}</td>
            <td><input type="submit" value="修改">
            <input type="hidden" name="emp_id" value="${sessionScope.employ1.emp_id}">
            </td>
        </form>
    </tr>
</table>

</body>
</html>
