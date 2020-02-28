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
<div style="margin-left: 500px;margin-top:50px;border: #317eac solid 1px;width: 320px;height: 500px;padding-left: 100px">
    <h2>修改商家信息</h2>
    <form method="get" action="/eat_war_exploded/updateMerchant">
        <input type="hidden" name="merchantId" value="${eatMerchant.merchantId}"/><br/>
        商家电话号码：<br>
        &nbsp;&nbsp;<input type="text" name="merchantPhone" value="${eatMerchant.merchantPhone}"/><br/>
        商家地址：<br>
        &nbsp;&nbsp;<input type="text" name="merchantAddress" value="${eatMerchant.merchantAddress}"/><br/>
        商家状态：<br>
        &nbsp;&nbsp;<input  name="merchantStatus" value="${eatMerchant.merchantStatus}"/><br/>
        商家邮箱：<br>
        &nbsp;&nbsp;<input name="merchantEmail" value="${eatMerchant.merchantEmail}"/><br/>
        商家名称：<br>
        &nbsp;&nbsp;<input name="merchantName" value="${eatMerchant.merchantName}"/><br/>
        食品安全档案ID：<br>
        &nbsp;&nbsp;<input name="merchantSecurityId" value="${eatMerchant.merchantSecurityId}"/><br/>
        &nbsp;&nbsp;<input type="submit" value="提交">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <input type="reset" value="重置">
    </form>
</div>
</body>
</html>
