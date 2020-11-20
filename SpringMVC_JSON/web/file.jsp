<%--
  Created by IntelliJ IDEA.
  User: mxg
  Date: 2020/11/20
  Time: 4:34 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>file</title>
</head>
<body>
<a href="down">下载</a><br/>
<form action="up" method="post" enctype="multipart/form-data">
    请上传：<input type="file" name="uploadFile"/><br/>
<%--    请上传：<input type="file" name="uploadFile"/><br/>--%>
<%--    请上传：<input type="file" name="uploadFile"/><br/>--%>
    请描述：<input type="text" name="desc"/><br/>
    <input type="submit" value="确认"/>
</form>

</body>
</html>
