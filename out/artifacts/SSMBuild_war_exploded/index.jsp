
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/js/jquery-3.5.1.js"></script>
    <script type="text/javascript">
        function aa() {
            $.ajax({
                type: "post",
                url:"/user/select",
                data:{"name":$("#username").val()},
                success:function (data) {
                    alert("userList:"+ JSON.stringify(data));
                },
                error:function () {
                    alert("失败");
                }

        });
        }

        function bb() {
            document.getElementById("aa").style.display = 'none';
            document.getElementById("bb").style.display = '';
        }
        function cc() {
            document.getElementById("bb").style.display = 'none';
            document.getElementById("aa").style.display = '';
        }
        function dd() {
            $("#cc").removeClass("btn1").addClass("dianji");
        }
    </script>
    <style>
      .btn1{
        width: 50px;
        height: 50px;
        color: red;
        position:absolute;
        top: 100px;
        left: 10px;
      }
      .btn2{
        width: 50px;
        height: 50px;
        color: blue;
        position:absolute;
        top: 200px;
      }
      .btn3{
        width: 50px;
        height: 50px;
        color: blue;
        position:absolute;
        top: 400px;
      }
      .dianji{
        width: 100px;
        height: 100px;
        color: bisque;
        background: green;
        position:absolute;
        top: 100px;
      }
    </style>
  </head>

  <body>
      <a href="${pageContext.request.contextPath}/user/select">点击</a>

      <%--失去焦点--%>
      <input type="text" id="username" onfocus="aa()">

      <input type="button" id="aa" value="1" onclick="bb()" class="btn1">
      <input type="button" id="bb" value="2" onclick="cc()" class="btn2">
      <input type="button" id="cc" value="3" onclick="dd()" class="btn3">

      <a href="${pageContext.request.contextPath}/login/goLogin">主页</a>

  </body>
</html>
