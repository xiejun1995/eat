<%--
  Created by IntelliJ IDEA.
  User: Allen
  Date: 2020/2/23
  Time: 12:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>骑手信息修改</title>
</head>
<body>
<div>
    <form method="post" action="${pageContext.request.contextPath}/horseman/updateByPrimaryKey?horsemanPhone=${eatHorseman.horsemanPhone}">
        <p>姓名:<input name="horsemanName" type="text" value="${eatHorseman.horsemanName}"/></p>
        <p>密码:<input name="horsemanPassword" type="password" value="${eatHorseman.horsemanPassword}"/></p>
        <p>出生日期:<input name="horsemanBornDate" type="date" value="${eatHorseman.horsemanBornDate}"/></p>
        <p>联系电话:<input name="horsemanPhone" type="text" value="${eatHorseman.horsemanPhone}" readonly /></p>
        <p>联系地址:<input name="horsemanAddress" type="text" value="${eatHorseman.horsemanAddress}/"></p>
        <p><input type="submit" value="修改骑手"></p>
    </form>
</div>
</body>
</html>
