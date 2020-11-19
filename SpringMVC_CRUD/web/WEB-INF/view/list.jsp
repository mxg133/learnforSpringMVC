<%--
  Created by IntelliJ IDEA.
  User: mxg
  Date: 2020/11/19
  Time: 2:37 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage = "true" %>
<html>
<head>
    <title>emps</title>
</head>
<body>
<table>
    <c:forEach items="${emps}" var="emp">
        I  D：${emp.id}<br/>
        姓名：${emp.lastName}<br/>
        邮箱：${emp.email}<br/>
        性别：${emp.gender==0?'女':'男'}<br/>
        部门：${emp.department.departmentName}<br/>
        修改：<a href="emp/${emp.id}">修改</a><br/>
        删除：<a href="emp">删除</a><br/>
        <br/>
    </c:forEach>
    <a href="emp">ADD</a>
</table>
</body>
</html>
