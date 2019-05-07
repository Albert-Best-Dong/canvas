<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>慕课网用户管理中心</title>
    <link rel="stylesheet" href="lib/bootstrap-3.3.7-dist/css/bootstrap.min.css">
    <script src="lib/2.2.4/jquery-1.12.4.min.js"></script>
    <script src="lib/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="page-header">
            <h1>慕课网后台管理系统 <small>用户数据管理中心</small></h1>
        </div>
    </div>
    <div class="row">
        <div class="jumbotron">
            <h1>MyBatis基础入门课程!</h1>
            <p>通过一个项目来完成基础部分的学习</p>
            <p><a class="btn btn-primary btn-lg" href="#" role="button">查看更多，请上慕课网</a></p>
            <p><a class="btn btn-primary btn-lg" href="${pageContext.request.contextPath}/addstudent.jsp" role="button">新增用户</a></p>
        </div>
    </div>
    <div class="row">
        <table class="table table-hover table-striped">
            <tr>
                <th>用户编号</th>
                <th>学号</th>
                <th>姓名</th>
                <th>性别</th>
                <th>年龄</th>
                <th>年级</th>
                <th>专业</th>

            </tr>
            <c:forEach var="student" items="${studentList}">
                <tr>
                    <td>${student.id}</td>
                    <td>${student.regNo}</td>
                        <%--<td>${student.studentname}</td>--%>
                    <td>${student.name}</td>

                    <td>${student.sex}</td>
                    <td>${student.age}</td>
                    <td>${student.grade}</td>
                    <td>${student.major}</td>
                    <td>
                        <a href="${pageContext.request.contextPath}/detail?id=${student.id}">查看</a>

                        <a href="${pageContext.request.contextPath}/deluser?id=${student.id}&type=del">删除</a>
                    </td>

            </c:forEach>
        </table>
    </div>
</div>
</body>
</html>
