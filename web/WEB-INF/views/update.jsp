<%--
  Created by IntelliJ IDEA.
  User: Jonny
  Date: 2021/3/11
  Time: 17:06
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
      <form action="${APP_PATH}/update">
          <input type="text" name="empId">序号
          <input type="text" name="empName">姓名
          <input type="text" name="gender">性别
          <input type="text" name="email">邮箱
          <input type="text" name="dId">部门id
          <input type="submit" value="提交">
      </form>
</body>
</html>
