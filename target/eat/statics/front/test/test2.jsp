<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/2/22
  Time: 22:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>修改基本信息</h2>
   <form method="get" action="/user/update">
       <input type="hidden" name="userId" value="${user.userId}"/>
       名称：<input name="userName" value="${user.userName}"/><br/>
       密码：<input type="password" name="userPassword" value="${user.userPassword}"/><br/>
       出生日期：<input type="date" name="userBornDate" value="${user.userBornDate}"/><br/>
       电话号码:<input  name="userPhone" value="${user.userPhone}"/><br/>
       地址:<input name="userAddress" value="${user.userAddress}"/><br/>
       邮箱:<input name="userEmail" value="${user.userEmail}"/><br/>
       性别:<input name="userGender" type="radio" value="男" checked/>男
            <input name="userGender" type="radio" value="女" />女<br/>
       角色：<select name="userRole">
                <option value="1">管理员</option>
                 <option value="2">商家</option>
                 <option value="3">骑手</option>
                 <option value="4">普通用户</option>
             </select><br/><br/>
        <input type="submit" value="提交">&nbsp;&nbsp;
       <input type="reset" value="重置">
   </form>
</body>
</html>
