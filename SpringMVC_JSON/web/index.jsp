<%--
  Created by IntelliJ IDEA.
  User: mxg
  Date: 2020/11/20
  Time: 12:17 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>index</title>
    <script type="text/javascript" src="js/jquery-1.7.2.js"></script>
    <script type="text/javascript">
      $(function () {
        $("#btn").click(function () {
          $.ajax({
            url:"testJson",
            type:"POST",
            // data:{},
            dataType:"json",
            success:function (msg) {
              // alert(msg);

              //第1种方式
              var tb = "<table>";
              tb += "<tr><th>id</th><th>lastName</th><th>email</th><th>gender</th><th>departmentName</th></tr>"
              for (var i in msg) {
                var emp = msg[i];
                tb += "<tr><td>"+ emp.id +"</td><td>"+ emp.lastName +"</td><td>"+ emp.email +"</td><td>"+ emp.gender +"</td><td>"+ emp.departmentName +"</td></tr>";
              }
              tb += "</table>"

              //追加到 body
              $("body").append(tb);

              //第2种方式
              $("body").append("<table></table>");
              $("table").append("<tr><th>id</th><th>lastName</th><th>email</th><th>gender</th><th>departmentName</th></tr>");
              for (var i in msg) {
                var emp = msg[i];
                $("table").append("<tr><td>"+ emp.id +"</td><td>"+ emp.lastName +"</td><td>"+ emp.email +"</td><td>"+ emp.gender +"</td><td>"+ emp.departmentName +"</td></tr>");
              }
            }
          });
        });
      });
    </script>
  </head>
  <body>

  <input id="btn" type="button" value="测试Ajax"><br/>

  <a href="testJson">测试Json</a>
  </body>
</html>
