<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 13765
  Date: 2018/4/24
  Time: 9:13
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
        <td>姓名</td><td>年龄</td><td>性别</td><td>联系电话</td><td>邮箱</td><td>学历</td><td>录用</td>
    </tr>
    <c:forEach items="${sessionScope.vitos}" var="vito">
        <tr>
            <td>${vito.vito_name}</td><td>${vito.vito_age}</td><td>${vito.vito_sex}</td>
            <td>${vito.vito_phone}</td><td>${vito.vito_email}</td><td>${vito.vito_school}</td>
            <td>
                <form method="post" action="duke">
                    <input value="录用" type="submit">
                    <input type="hidden" name="vito_vis_id" value="${vito.vito_vis_id}">
                    <input type="hidden" name="vito_id" value="${vito.vito_id}">
                </form>
            </td>
        </tr>
    </c:forEach>
    </thead>
</table>
</body>
</html>
