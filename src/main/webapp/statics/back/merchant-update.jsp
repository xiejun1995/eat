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
    <form method="post" action="${pageContext.request.contextPath}/merchant/updateById">
        <p>商家ID:<input name="merchantId" type="text" value="${eatMerchant.merchantId}" readonly ></p>
        <p>商家名称:<input name="merchantName" type="text" value="${eatMerchant.merchantName}"></p>
        <p>商家电子邮箱:<input name="merchantEmail" type="text" value="${eatMerchant.merchantEmail}"></p>
        <p>商家联系电话:<input name="merchantPhone" type="text" value="${eatMerchant.merchantPhone}"></p>
        <p>商家营业状态:<input name="merchantStatus" type="text" value="${eatMerchant.merchantStatus}"></p>
        <p>商家地址:<input name="merchantAddress" type="text" value="${eatMerchant.merchantAddress}"></p>
        <p>商家食品安全档案ID:<input name="merchantSecurityId" type="text" value="${eatMerchant.merchantSecurityId}"></p>
        <p><input type="submit" value="修改商家"></p>
    </form>
</div>
</body>
</html>
