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
    <script type="text/javascript" src="/WEB-INF/js/jquery-1.7.2.js"></script>
    <script type="text/javascript">
        $(function () {
            $(".del").click(function () {
                if (confirm("确认吗？")) {
                    //submit()将获得的form提交
                    $("form").attr("action", this.href).submit();
                    return false;//将超链接的默认跳转行为取消
                }
                return false;//将超链接的默认跳转行为取消
            });
        });
    </script>
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
        删除：<a class="del" href="emp/${emp.id}">删除</a><br/>
        <br/>
    </c:forEach>
    <a href="emp">ADD</a>
</table>

<form method="post">
    <input type="hidden" name="_method" value="DELETE">
</form>
</body>
</html>
