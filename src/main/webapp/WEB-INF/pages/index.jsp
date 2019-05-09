<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>首页</title>
    <link rel="stylesheet" type="text/css" href="style/common.css"/>
    <link rel="stylesheet" type="text/css" href="style/index.css"/>
</head>
<body>
<div class="header">
    <div class="logo f1">
        <img src="/image/logo.png">
    </div>
    <div class="auth fr">
        <ul>
            <li><a href="/admin/Category/toLogin.do">登录</a></li>
            <li><a href="#">注册</a></li>
        </ul>
    </div>
</div>
<div class="content">
    <div class="banner">
        <img class="banner-img" src="/image/welcome.png" width="732px" height="372" alt="图片描述">
    </div>
    <div class="container">
        <c:forEach items="${categoryList}" var="category">
            <nav style="float: right">
                <a href="/index.do?cid=${category.id}">${category.name}&nbsp;</a>
            </nav>
        </c:forEach>
        <nav style="float: right">
            <a href="/index.do">全部&nbsp;&nbsp;</a>
        </nav>
    </div>
    <div class="img-content">
        <ul>
            <c:forEach items="${pageInfo.list}" var="canvas">
                <li>
                    <img class="img-li-fix" src="${canvas.smallImg}" alt="${canvas.name}">
                    <div class="info">
                        <h3 class="img_title">${canvas.name}</h3>
                        <p>
                            图片描述可以分为多种，一种是单一说明，就比如直接的告诉看图者这篇文
                            章是要介绍什么样子的内容，一些配图可以分为含蓄类型的，这样的配图一般会
                            图片描述可以分为多种.
                        </p>
                        <div class="btn">
                            <a href="/detail.do?id=${canvas.id}" class="edit">详情</a>
                        </div>
                    </div>
                </li>
            </c:forEach>
        </ul>
    </div>
    <div class="page-nav">
        <ul>
            <li><a href="/index.do?pageNum=1">首页</a></li>
            <li><a href="/index.do?pageNum=${pageInfo.pageNum-1}">上一页</a></li>
            <li><span class="first-page"></span></li>
            <li>共${pageInfo.total}条 ${pageInfo.pageNum}/${pageInfo.pages}</li>
            <li><a href="/index.do?pageNum=${pageInfo.pageNum+1}">下一页</a></li>
            <li><a href="/index.do?pageNum=${pageInfo.pages}">尾页</a></li>
        </ul>
    </div>
</div>

<div class="footer">
    <p><span>M-GALLARY</span>©2017 POWERED BY IMOOC.INC</p>
</div>
</body>
</html>
