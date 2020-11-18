<%--
  Created by IntelliJ IDEA.
  User: mxg
  Date: 2020/11/16
  Time: 3:51 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>param</title>
</head>
<body>
<form action="param" method="post">
    username: <input type="text" name="username" value="好"><br/>
    password: <input type="text" name="password" value="hao123"><br/>
    age: <input type="text" name="age" value="12"><br/>
    province: <input type="text" name="address.province" value="河南省"><br/>
    city: <input type="text" name="address.city" value="洛阳市"><br/>
    country: <input type="text" name="address.country" value="偃师市"><br/>
    <input type="submit">
</form>
</body>
</html>
