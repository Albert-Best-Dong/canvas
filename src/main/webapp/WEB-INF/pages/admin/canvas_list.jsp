<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>油画列表</title>
    <link rel="stylesheet" href="/css/index.css">
    <link rel="stylesheet" href="/css/bootstrap.min.css">
</head>

<body>
<header>
    <div class="container">
        <c:forEach items="${categoryList}" var="category">
        <nav>
            <a href="#" >${category.name}</a>
        </nav>
        </c:forEach>
        <nav>
            <a href="/admin/Category/list.do" >分类</a>
        </nav>
        <nav>
            <a href="#">${ACCOUNT.name}</a>
            <a href="#" onclick="alert('功能暂未开放');">注册</a>
        </nav>
    </div>
</header>
<section class="banner">
    <div class="container">
        <div>
            <h1>油画</h1>
            <p>油画列表</p>
        </div>
    </div>
</section>
<section class="main">
    <div class="container">
        <table class="table table-striped">
            <thead>
            <tr>
                <th>名称</th>
                <th>分类</th>
                <th>价格</th>
                <th>创建时间</th>
                <th>最后修改时间</th>
                <th>描述</th>
                <th>编辑</th>
                <th>删除</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${canvasList}" var="canvas">
            <tr>
                <td>${canvas.name}</td>
                <td>${canvas.categoryId}</td>
                <td>￥<fmt:formatNumber type="currency" pattern="#,#00.00#" value="${canvas.price}"/></td>
                <td><fmt:formatDate pattern="yyyy-MM-dd HH:mm:ss" value="${canvas.createTime}"/></td>
                <td><fmt:formatDate pattern="yyyy-MM-dd HH:mm:ss" value="${canvas.updateTime}"/></td>
                <td>${canvas.description}</td>
                <td><a href="/admin/Canvas/toEdit.do?id=${canvas.id}">编辑</a></td>
                <td><a href="/admin/Canvas/remove.do?id=${canvas.id}">删除</a>
            </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</section>
<section class="page">
    <div class="container">
        <div id="fatie">
            <a href="/admin/Canvas/toAdd.do"><button>新建</button></a>
        </div>
    </div>
</section>
<footer>
    copy@慕课网
</footer>
</body>
</html>