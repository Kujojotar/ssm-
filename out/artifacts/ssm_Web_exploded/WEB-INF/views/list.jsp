<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
    pageContext.setAttribute("APP_PATH",request.getContextPath());
%>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="../static/js/jquery.min.js"></script>
    <link href="../static/bootstrap-3.3.7-dist/css/bootstrap-theme.min.css">
    <script src="../static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body>
<div class="row">
    <div class="col-md-12">
        <h1>SSM_CRUD</h1>
    </div>
</div>
<div class="row">
    <div class="col-md-4 col-md-offset-8">
        <button class="btn btn-primary">
            新增
        </button>
        <button class="btn btn-danger">
            删除
        </button>
    </div>
</div>
<div class="row">
    <table class="table">
        <tr>
            <th>#</th>
            <th>empName</th>
            <th>gender</th>
            <th>email</th>
            <th>deptName</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${pageInfo.list}" var="emp">
            <tr>
                <th>${emp.empId}</th>
                <th>${emp.empName}</th>
                <th>${emp.gender}</th>
                <th>${emp.email}</th>
                <th>${emp.department.deptName}</th>
            </tr>
        </c:forEach>
    </table>
</div>
<div class="row">
    总共${pageInfo.pageNum}页.第${pageInfo.pages}页，总共${pageInfo.total}条记录
</div>
</body>
</html>