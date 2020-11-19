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
<%-- modelAttribute自定义回显对象属性的名 --%>
<%--<form:form action="emp" method="post" modelAttribute="emp">--%>
<form:form action="emp" method="post">

    姓名<input type="text" name="lastName"><br/>
        <form:input path="lastName"/>
    邮箱<input type="text" name="email"><br/>
        <form:input path="email"/>
    性别<input type="radio" name="gender" value="1">男
    <input type="radio" name="gender" value="0">女<br/>

    <form:radiobuttons path="gender" items="${genders}"/>


    部门<select name="${department.id}">
    <c:forEach items="${depts}" var="dept">
        <option value="${dept.id}">${dept.departmentName}</option>
    </c:forEach>
</select><br/>
    <form:select path="department.id" items="${depts}" itemLabel="departmentName" itemValue="id"/>

    <input type="submit" value="提交">
</form:form>
</body>
</html>
