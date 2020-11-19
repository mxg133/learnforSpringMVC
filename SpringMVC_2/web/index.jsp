<%--
  Created by IntelliJ IDEA.
  User: mxg
  Date: 2020/11/16
  Time: 10:15 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>index</title>
  </head>
  <body>
  <h4>

    <a href="mvc/test">test SpringMVC</a>

    <br/>

    <a href="mvc/testREST/12/hao">test testREST</a>

    <br/>
    <form action="mvc/test" method="post">
      <input type="text" name="username">
      <input type="submit" value="test乱码">
    </form>

    <br/>

  </h4>

    <form action="mvc/test1?username=admin" method="post"><br/>
      <input type="submit" value="sub!post">
    </form>

  </body>
</html>
