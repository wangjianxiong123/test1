<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 13765
  Date: 2018/4/26
  Time: 9:27
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
        <td>编号</td><td>主题</td><td>内容</td><td>部门</td><td>职位</td><td>开始时间</td><td>结束时间</td><td>培训地点</td><td>修改</td><td>删除</td>
    </tr>
    <c:forEach var="train" items="${sessionScope.trains}">
        <tr>
            <td>${train.train_id}</td>
            <form action="updateTrain" method="post">
                <td><input name="train_theme" value="${train.train_theme}"></td>
                <td><input name="train_content" value="${train.train_content}"></td>
                <td><input name="train_dept" value="${train.train_dept}"></td>
                <td><input name="train_position" value="${train.train_position}"></td>
                <td><input name="train_begin" value="${train.train_begin}"></td>
                <td><input name="train_end" value="${train.train_end}"></td>
                <td><input name="train_address" value="${train.train_address}"></td>
                <td>
                    <input type="submit" value="修改">
                    <input type="hidden" name="train_id" value="${train.train_id}">
                </td>
            </form>
            <td>
                <form method="post" action="deleteTrain">
                    <input type="submit" value="删除">
                    <input type="hidden" name="train_id" value="${train.train_id}">
                </form>
            </td>
        </tr>
    </c:forEach>
</table>
<form method="post" action="addTrain">
    主题:<input name="train_theme" type="text"><br>
    内容:<input name="train_content" type="text"><br>
    部门:<input name="train_dept" type="text"><br>
    职位:<input name="train_position" type="text"><br>
    开始时间:<input type="datetime-local" name="train_begin"><br>
    结束时间:<input type="datetime-local" name="train_end"><br>
    培训地点:<input type="text" name="train_address"><br>
    <input type="submit" value="添加">
</form>
</body>
</html>
