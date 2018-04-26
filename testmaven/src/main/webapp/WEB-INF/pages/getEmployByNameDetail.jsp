<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 13765
  Date: 2018/4/26
  Time: 13:48
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
        <td>姓名</td><td>年龄</td><td>性别</td><td>联系电话</td>
    </tr>
    <c:forEach var="employ" items="${sessionScope.employs}">
        <tr>
            <td>${employ.emp_name}</td><td>${employ.emp_age}</td><td>${employ.emp_sex}</td>
            <td>${employ.emp_phone}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
