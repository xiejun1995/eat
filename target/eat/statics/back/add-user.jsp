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
<div style="margin-left: 500px;margin-top:50px;border: #317eac solid 1px;width: 320px;height: 500px;padding-left: 100px">
    <h2>添加用户信息</h2>
    <form method="get" action="/eat_war_exploded/user/addUser">
        用户姓名：<br/>
        &nbsp;&nbsp;<input type="text" name="userName" required title="用户姓名不能为空"  placeholder="请输入用户姓名"/><br/>
        用户密码：<br/>
        &nbsp;&nbsp;<input type="text" name="userPassword" required title="" placeholder="请设置用户密码"/><br/>
        出生日期：<br/>
        &nbsp;&nbsp;<input type="date" name="userBornDate" required title=""/><br/>
        电话号码：<br/>
        &nbsp;&nbsp;<input  name="userPhone" placeholder="请输入电话号码" required title=""/><br/>
        商家地址：<br/>
        &nbsp;&nbsp;<input name="userAddress" placeholder="请输入商家地址" required title=""/>
        &nbsp;&nbsp;
        <input type="hidden" name="userAddressId" placeholder="请输入收货地址ID" required title="" value="1"/><br/>
        邮&nbsp;&nbsp;箱：<br/>
        &nbsp;&nbsp;<input name="userEmail" placeholder="请输入用户邮箱" required title=""/><br/>
        性&nbsp;&nbsp;别：<input name="userGender" type="radio" value="男" checked/>男&nbsp;&nbsp;&nbsp;&nbsp;
                <input name="userGender" type="radio" value="女"/>女<br/>
        用户角色：<br/> &nbsp;&nbsp;
        <select name="userRole">
        <option value="1">管理员</option>
        <option value="2">经理</option>
        <option value="3">普通员工</option>
    </select>
        <br><br>
        &nbsp;&nbsp;&nbsp;&nbsp;
        <input type="submit" value="提交">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <input type="reset" value="重置">
    </form>
</div>
</body>
</html>
