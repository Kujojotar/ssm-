<%--
  Created by IntelliJ IDEA.
  User: Jonny
  Date: 2021/3/8
  Time: 13:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    pageContext.setAttribute("APP_PATH",request.getContextPath());
%>
    <a href="${APP_PATH}/gotodelete">我要删除员工</a>
    <a href="${APP_PATH}/gotoadd">我要添加员工</a>
    <a href="${APP_PATH}/gotoupdate">我要修改员工</a>
    <form action="/emps">
        <input type="text" name="pn">请输入页数</input>
        <input type="submit" value="查看"/>
    </form>
</body>
</html>
