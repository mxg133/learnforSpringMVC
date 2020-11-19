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
<form:form action="${pageContext.servletContext.contextPath}/emp" method="post" modelAttribute="emp">

    <c:if test="${empty emp.id}" var="flag"></c:if>
    <c:if test="${!flag}">
        <%-- 修改的时候 必须这两个代码 添加的时候不能要！！ --%>
        <form:hidden path="id"/>
        <%-- _method这个必须老方式 仅仅是请求的参数  <form:hidden path="_method"--%>
        <input type="hidden" name="_method" value="PUT">
    </c:if>

    <c:if test="${flag}">添加操作</c:if>
    <c:if test="${!flag}">修改操作</c:if>
    姓名<form:input path="lastName"/>
    邮箱<form:input path="email"/>
    <%-- radiobuttons自动遍历 genders gender.key-value gender.value-内容  --%>
    性别<form:radiobuttons path="gender" items="${genders}"/>
    部门<form:select path="department.id" items="${depts}" itemLabel="departmentName" itemValue="id"/>

    <c:if test="${flag}">
        <input type="submit" value="add提交">
    </c:if>
    <c:if test="${!flag}">
        <input type="submit" value="sub提交">
    </c:if>
</form:form>
</body>
</html>
