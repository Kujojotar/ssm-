<%--
  Created by IntelliJ IDEA.
  User: Jonny
  Date: 2021/3/11
  Time: 17:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    pageContext.setAttribute("APP_PATH",request.getContextPath());
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
      <form action="${APP_PATH}/delete">
          <input type="text" name="id">删除序号
          <input type="submit" name="删除">
      </form>
</body>
</html>
