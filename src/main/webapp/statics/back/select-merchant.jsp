<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/2/24
  Time: 10:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>商家信息展示</title>
</head>
<body>
<h1>管理员查询商家信息列表</h1>
<div>
    <table border="1">
        <tr>
            <th>商家ID</th>
            <th>商家电话号码</th>
            <th>商家地址</th>
            <th>商家状态</th>
            <th>商家邮箱</th>
            <th>商家名称</th>
            <th>食品安全档案ID</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${listMerchant}" var="merchant">
            <tr>
                <td>${merchant.merchantId}</td>
                <td>${merchant.merchantPhone}</td>
                <td>${merchant.merchantAddress}</td>
                <td>${merchant.merchantStatus}</td>
                <td>${merchant.merchantEmail}</td>
                <td>${merchant.merchantName}</td>
                <td>${merchant.merchantSecurityId}</td>
                <td><a href="${pageContext.request.contextPath}/toUpdateMerchant?merchantId=${merchant.merchantId}">修改</a>&nbsp;&nbsp;
                    <a href="${pageContext.request.contextPath}/deleteMerchant?merchantId=${merchant.merchantId}">删除</a>
                </td>
            </tr>
        </c:forEach>
    </table>
    <p><a href="${pageContext.request.contextPath}/toAddMerchant">添加商家</a></p>
</div>
</body>
</html>
