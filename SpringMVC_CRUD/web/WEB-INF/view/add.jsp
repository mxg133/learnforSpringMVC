<%--
  Created by IntelliJ IDEA.
  User: mxg
  Date: 2020/11/19
  Time: 3:13 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>add</title>
</head>
<body>
<form action="emp" method="post">
    姓名<input type="text" name="lastName"><br/>
    邮箱<input type="text" name="email"><br/>
    性别<input type="radio" name="gender" value="1">男
        <input type="radio" name="gender" value="0">女<br/>
    部门<select name="${department.id}">
    <c:forEach items="${depts}" var="dept">
        <option value="${dept.id}">${dept.departmentName}</option>
    </c:forEach>
    </select><br/>
    <input type="submit" value="提交">
</form>
</body>
</html>
