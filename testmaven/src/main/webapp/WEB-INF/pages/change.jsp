<%--
  Created by IntelliJ IDEA.
  User: 13765
  Date: 2018/4/25
  Time: 16:27
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
    <script type="text/javascript">
        var country = ["上海","北京","广州"];
        var city=[
            ["闵行区","静安区","徐汇区"],
            ["朝阳区","海淀区"],
            ["白云区","乌云区"]
        ];

        function createOp(array,id) {
            var oS = document.getElementById(id);
            //清空option
            oS.options.length=0;
            for (var i = 0; i < array.length; i++) {
                var oP = document.createElement("option");
                oP.innerHTML = array[i];
                oP.value = array[i];
                //添加到select
                oS.options.add(oP);
            }

        }
        window.onload = init;
        function init(){
            createOp(country,"country");
            createOp(city[0],"city");
        }

        function changeCity(index){
            createOp(city[index],"city");
        }
    </script>
</head>
<body>
<select id="country" onchange="changeCity(this.selectedIndex)">

</select>
<select id="city">

</select>
</body>
</html>
