<%--
  Created by IntelliJ IDEA.
  User: mxg
  Date: 2020/11/16
  Time: 1:59 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>rest</title>
    <script type="text/javascript" src="js/jquery-1.7.2.js"></script>
    <script type="text/javascript">
        function test() {
            $.ajax({
               url:"testAjax_DELETE",
               type:"DELETE",
               data:{id:1001},
               dataType:"json",
               success:function (obj) {
                   alert(obj);
               }
            });
        }
    </script>
</head>
<body>
<%--查询 by id--%>
<a href="testREST/1001">test Get</a>

<br/>

<%-- 添加 在form里 --%>
<form action="testREST" method="post">
    <input type="submit" value="sub!Post">
</form>

<br/>

<%-- 修改 --%>
<form action="testREST" method="post">
    <input type="hidden" name="_method" value="put">
    <input type="submit" value="sub!Put">
</form>

<br/>

<%-- 删除 --%>
<form action="testREST/1001" method="post">
    <input type="hidden" name="_method" value="delete">
    <input type="submit" value="sub!Delete">
</form>

<%-- 通过ajax请求 --%>
<input onclick="test()" type="button" value="测试ajax">

</body>
</html>
