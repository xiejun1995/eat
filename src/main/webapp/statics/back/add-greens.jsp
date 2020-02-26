<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/2/26
  Time: 9:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>菜品添加页面</title>
</head>
<body>
<div>
    <h2>添加菜品信息</h2>
    <form method="get" action="/eat_war_exploded/addGreens">
        菜品名字：<input type="text" name="greensName"/><br/>
        菜品价格：<input type="text" name="greensPrice"/><br/>
        菜品地址：<input type="text" name="greensAddress"/><br/>
        评论表id：<input type="text"  name="greensGradeId"/><br/>
        菜系分类id：<input type="text" name="greensTypeId"/><br/>
        菜品描述：<input type="text" name="greensDetails"/><br/>
        <input type="submit" value="提交">&nbsp;&nbsp;
        <input type="reset" value="重置">
    </form>
</div>
</body>
</html>
