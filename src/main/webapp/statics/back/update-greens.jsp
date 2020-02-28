<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/2/26
  Time: 20:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改菜品信息</title>
</head>
<body>
<div style="margin-left: 500px;margin-top:50px;border: #317eac solid 1px;width: 320px;height: 400px;padding-left: 100px">
    <h2>修改菜品信息</h2>
    <form method="get" action="/eat_war_exploded/updateGreens">
        <input type="hidden" name="greensId" value="${eatGreens.greensId}"/><br/>
        菜品名字：<br>
        &nbsp;&nbsp;<input type="text" name="greensName" value="${eatGreens.greensName}"/><br/>
        菜品价格：<br>
        &nbsp;&nbsp;<input type="text" name="greensPrice" value="${eatGreens.greensPrice}"/><br/>
        菜品地址：<br>
        &nbsp;&nbsp;<input  name="greensAddress" value="${eatGreens.greensAddress}"/><br/>
        菜品描述：<br>
        &nbsp;&nbsp;<input name="greensDetails" value="${eatGreens.greensDetails}"/><br/>
        菜系：<br>
        <select name="greensTypeId">
            <option value="1">蛋糕甜点</option>
            <option value="2">火锅</option>
            <option value="3">自助餐</option>
            <option value="4">小吃快餐</option>
            <option value="5">日韩料理</option>
            <option value="6">西餐</option>
            <option value="7">聚餐宴请</option>
            <option value="8">烧烤烤肉</option>
            <option value="9">东北菜</option>
            <option value="10">川湘菜</option>
            <option value="11">江浙菜</option>
            <option value="12">香锅烤鱼</option>
            <option value="13">粤菜</option>
            <option value="14">中式烧烤/烤串</option>
            <option value="15">西北菜</option>
            <option value="16">咖啡酒吧</option>
            <option value="17">云贵菜</option>
            <option value="18">东南亚菜</option>
            <option value="19">海鲜</option>
            <option value="20">素食</option>
            <option value="21">台湾/客家菜</option>
            <option value="22">创意菜</option>
            <option value="23">汤/粥/炖菜</option>
            <option value="24">蒙餐</option>
            <option value="25">新疆菜</option>
            <option value="26">其他美食</option>
            <option value="27">京菜鲁菜</option>
        </select>
        <br><br>
        &nbsp;&nbsp;<input type="submit" value="提交">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        &nbsp;&nbsp;<input type="reset" value="重置">
    </form>
</div>
</body>
</html>
