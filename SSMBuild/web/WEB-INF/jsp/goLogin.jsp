<%--
  Created by IntelliJ IDEA.
  User: 99347
  Date: 2020/12/15
  Time: 9:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>起始页</title>
    <script type="text/javascript" src="/static/js/jquery-3.5.1.js"></script>
    <script type="text/javascript">
        function login() {
            $.ajax({
                url:"/login/loginCheck",
                data:{},
                success:function (data) {

                },
                error:function () {
                    alert("跳转到登录页面失败！")
                }
            })
        }
        function home() {
            $.ajax({
                url:"/login/goHome",
                data:{},
                success:function (data) {
                },
                error:function () {
                    alert("跳转到主页失败！")
                }
            })
        }
    </script>
</head>
<body>
<h1><a href="${pageContext.request.contextPath}/login/loginCheck">登录</a></h1>
<h1><a href="${pageContext.request.contextPath}/login/goHome">主页</a></h1>
<%--<input type="button" value="登录" onclick="login()">
<input type="button" value="主页" onclick="home()">--%>
</body>
</html>
