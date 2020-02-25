<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/2/23
  Time: 11:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户增加页面</title>
</head>
<body>
<div>
    <h2>管理员添加用户信息</h2>
    <form method="get" action="/eat_war_exploded/user/addUser">
        用户姓名：<input name="userName"/><br/>
        用户密码：<input type="password" name="userPassword"/><br/>
        出生日期：<input type="date" name="userBornDate"/><br/>
        电话号码：<input  name="userPhone"/><br/>
        商家住址：<input name="userAddress"/><br/>
        收货地址ID：<input name="userAddressId"/><br/>
        邮&nbsp;&nbsp;箱：<input name="userEmail"/><br/>
        性&nbsp;&nbsp;别：<input name="userGender" type="radio" value="男" checked/>男
               <input name="userGender" type="radio" value="女"/>女<br/>
        用户角色：<input name="userRole"/><br/>
        <input type="submit" value="提交">&nbsp;&nbsp;
        <input type="reset" value="重置">
    </form>
</div>
</body>
</html>
