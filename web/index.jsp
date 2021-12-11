<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: 姝、
  Date: 2021/8/31
  Time: 17:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
        <h1>Welcome...</h1>
        <%
            // 获取req, resp
            String name = request.getParameter("name");
            String pwd = request.getParameter("pwd");
            // 打印在控制台
//            System.out.println(name + ", " + pwd);
            // 打印到浏览器
            out.print("Good good study, day day up.");
        %>

<%--        <%--%>
<%--            // 获取作用域--%>
<%--            String userName = (String) request.getAttribute("name");--%>

<%--            out.print("姓名: " + userName);--%>

<%--            List<String> list = (List<String>) request.getAttribute("list");--%>
<%--//            out.print(list.get(0));--%>
<%--        %>--%>
  </body>
</html>
