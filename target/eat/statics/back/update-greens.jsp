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
<div>
    <h2>修改菜品信息</h2>
    <form method="get" action="/eat_war_exploded/updateGreens">
        <input type="hidden" name="greensId" value="${eatGreens.greensId}"/><br/>
        菜品名字：<input type="text" name="greensName" value="${eatGreens.greensName}"/><br/>
        菜品价格：<input type="text" name="greensPrice" value="${eatGreens.greensPrice}"/><br/>
        菜品地址：<input  name="greensAddress" value="${eatGreens.greensAddress}"/><br/>
        <%--菜系名称：<input name="greensName" value="${eatGreens.greensName}"/><br/>--%>
        菜品描述：<input name="greensDetails" value="${eatGreens.greensDetails}"/><br/>
        评论id：<input name="greensGradeId" value="${eatGreens.greensGradeId}"/><br/>
        用户id：<input name="greensUserId" value="${eatGreens.greensUserId}"/><br/>
        菜系id：<input name="greensTypeId" value="${eatGreens.greensTypeId}"/><br/>
        <input type="submit" value="提交">&nbsp;&nbsp;
        <input type="reset" value="重置">
    </form>
</div>
</body>
</html>
