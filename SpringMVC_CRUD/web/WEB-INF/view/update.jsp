<%--
  Created by IntelliJ IDEA.
  User: mxg
  Date: 2020/11/19
  Time: 4:33 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>update</title>
</head>
<body>
<form action="${pageContext.servletContext.contextPath}/emps" method="post">
    <input type="hidden" name="_method" value="put">
    <input type="hidden" name="id" value="${emp.id}">
    姓名<input type="text" name="lastName" value="${emp.lastName}"><br/>
    邮箱<input type="text" name="email" value="${emp.email}"><br/>
    性别<input type="radio" name="gender" value="1" <c:if test="${emp.gender==1}">checked="checked"</c:if> />男
        <input type="radio" name="gender" value="0" <c:if test="${emp.gender==0}">checked="checked"</c:if>>女<br/>
    部门<select name="${department.id}">
    <c:forEach items="${depts}" var="dept">
        <option value="${dept.id}" ${dept.id==emp.department.id?'selected':''}>${dept.departmentName}</option>
    </c:forEach>
</select><br/>
    <input type="submit" value="提交">
</form>
</body>
</html>
