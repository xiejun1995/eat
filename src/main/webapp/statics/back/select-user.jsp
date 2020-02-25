<%@ page import="java.text.SimpleDateFormat" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/2/23
  Time: 9:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>用户信息展示页面</title>
</head>
<body>
<h1>管理员查询用户信息列表</h1>
<div>
    <table border="1">
        <tr>
            <th>用户ID</th>
            <th>用户姓名</th>
            <th>用户密码</th>
            <th>出生日期</th>
            <th>电话号码</th>
            <th>邮箱</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${userList}" var="user">
            <tr>
                <td>${user.userId}</td>
                <td>${user.userName}</td>
                <td>${user.userPassword}</td>
                <td>${user.userBornDate}</td>
                <td>${user.userPhone}</td>
                <td>${user.userEmail}</td>
                <td><a href="${pageContext.request.contextPath}/user/toUpdateUser?userId=${user.userId}">修改</a>&nbsp;&nbsp;
                    <a href="${pageContext.request.contextPath}/user/deleteUser?userId=${user.userId}">删除</a>
                </td>
            </tr>
        </c:forEach>
    </table>
    <p><a href="${pageContext.request.contextPath}/user/toAddUser">添加用户</a></p>
</div>
</body>
</html>
