<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/2/23
  Time: 14:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改用户信息页面</title>
</head>
<body>
<div style="margin-left: 500px;margin-top:50px;border: #317eac solid 1px;width: 320px;height: 550px;padding-left: 100px">
        <h2>管理员修改用户信息</h2>
        <form method="get" action="/eat_war_exploded/user/updateUser">
            <input type="hidden" name="userId" value="${eatUser.userId}"/><br/>
            用户姓名：<br>
            &nbsp;&nbsp;<input name="userName" value="${eatUser.userName}"/><br/>
            用户密码：<br>
            &nbsp;&nbsp;<input type="text" name="userPassword" value="${eatUser.userPassword}"/><br/>
            出生日期：<br>
            &nbsp;&nbsp;<input type="date" name="userBornDate" value="${eatUser.userBornDate}"/><br/>
            电话号码：<br>
            &nbsp;&nbsp;<input  name="userPhone" value="${eatUser.userPhone}"/><br/>
            商家住址：<br>
            &nbsp;&nbsp;<input name="userAddress" value="${eatUser.userAddress}"/><br/>
            收货地址ID：<br>
            &nbsp;&nbsp;<input name="userAddressId" value="${eatUser.userAddressId}"/><br/>
            邮&nbsp;&nbsp;箱：<br>
            &nbsp;&nbsp;<input name="userEmail" value="${eatUser.userEmail}"/><br/>
            性&nbsp;&nbsp;别：<br>
            <input name="userGender" type="radio" value="男" checked/>男&nbsp;&nbsp;&nbsp;&nbsp;
            <input name="userGender" type="radio" value="女" />女<br/>
            用户角色：<br>
            &nbsp;&nbsp;<input name="userRole" value="${eatUser.userRole}"/><br/><br>
            &nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="提交">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <input type="reset" value="重置">
        </form>
    </div>
</body>
</html>
