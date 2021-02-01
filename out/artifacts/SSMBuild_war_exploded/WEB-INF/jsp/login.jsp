<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/login/loginCheck" method="post">
    用户名：<input type="text" id="name">
    密  码：<input type="text" id="pass">
    <input type="submit">
</form>
</body>
</html>
