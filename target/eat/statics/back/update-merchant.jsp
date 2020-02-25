<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/2/24
  Time: 15:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改商家信息</title>
</head>
<body>
<div>
    <h2>管理员修改商家信息</h2>
    <form method="get" action="/eat_war_exploded/updateMerchant">
        <input type="hidden" name="merchantId" value="${eatMerchant.merchantId}"/><br/>
        商家电话号码：<input type="text" name="merchantPhone" value="${eatMerchant.merchantPhone}"/><br/>
        商家地址：<input type="text" name="merchantAddress" value="${eatMerchant.merchantAddress}"/><br/>
        商家状态：<input  name="merchantStatus" value="${eatMerchant.merchantStatus}"/><br/>
        商家邮箱：<input name="merchantEmail" value="${eatMerchant.merchantEmail}"/><br/>
        商家名称：<input name="merchantName" value="${eatMerchant.merchantName}"/><br/>
        食品安全档案ID：<input name="merchantSecurityId" value="${eatMerchant.merchantSecurityId}"/><br/>
        <input type="submit" value="提交">&nbsp;&nbsp;
        <input type="reset" value="重置">
    </form>
</div>
</body>
</html>
