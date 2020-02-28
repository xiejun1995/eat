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
<div style="margin-left: 500px;margin-top:50px;border: #317eac solid 1px;width: 320px;height: 500px;padding-left: 100px">
    <h2>添加商家信息</h2>
    <form method="get" action="/eat_war_exploded/addMerchant">
        商家电话：<br>
        &nbsp;&nbsp;<input name="merchantPhone" required title="" placeholder="请输入电话号码"/><br/>
        商家地址：<br>
        &nbsp;&nbsp;<input type="text" name="merchantAddress" required title="" placeholder="请输入商家地址"/><br/>
        商家状态：<br>
        &nbsp;&nbsp;<input type="text" name="merchantStatus" required title="" placeholder="请输入商家状态"/><br/>
        商家邮箱：<br>
        &nbsp;&nbsp;<input  name="merchantEmail" required title="" placeholder="请输入商家邮箱"/><br/>
        商家名称：<br>
        &nbsp;&nbsp;<input name="merchantName" required title="" placeholder="请输入商家名称"/><br/>
        食品安全档案：<br>
        <select name="merchantSecurityId">
            <option value="1">餐饮 酒水</option>
        </select>
        <br><br>
        &nbsp;&nbsp;<input type="submit" value="提交">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <input type="reset" value="重置">
    </form>
</div>
</body>
</html>
