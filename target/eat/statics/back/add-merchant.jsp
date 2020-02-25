<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/2/24
  Time: 14:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>增加商家页面</title>
</head>
<body>
<div>
    <h2>管理员添加商家信息</h2>
    <form method="get" action="/eat_war_exploded/addMerchant">
        商家电话号码：<input name="merchantPhone"/><br/>
        商家地址：<input type="text" name="merchantAddress"/><br/>
        商家状态：<input type="text" name="merchantStatus"/><br/>
        商家邮箱：<input  name="merchantEmail"/><br/>
        商家名称：<input name="merchantName"/><br/>
        食品安全档案ID：<input name="merchantSecurityId"/><br/>
        <input type="submit" value="提交">&nbsp;&nbsp;
        <input type="reset" value="重置">
    </form>
</div>
</body>
</html>
