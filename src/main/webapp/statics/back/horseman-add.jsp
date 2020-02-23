<%@ taglib prefix="fm" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Allen
  Date: 2020/2/22
  Time: 21:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>增加骑手</title>
</head>
<body>
    <div>
        <form method="post" action="${pageContext.request.contextPath}/horseman/addHoresman">
            <p>姓名:<input name="horsemanName" type="text" placeholder="请输入姓名"></p>
            <p>密码:<input name="horsemanPassword" type="password" placeholder="请输入密码"></p>
            <p>出生日期:<input name="horsemanBornDate" type="date" placeholder="请输入生日"></p>
            <p>联系电话:<input name="horsemanPhone" type="text" placeholder="请输入联系电话"></p>
            <p>联系地址:<input name="horsemanAddress" type="text" placeholder="请输入联系地址"></p>
            <p><input type="submit" value="增加骑手"></p>
        </form>

<%--        <fm:form method="post">--%>
<%--            姓名:<fm:input path="horsemanName" id="horsemanName"/><fm:errors path="horsemanName"></fm:errors></br?--%>
<%--            密码:<fm:input path="horsemanPassword" id="horsemanPassword"/><fm:errors path="horsemanPassword"></fm:errors></br?--%>
<%--            出生日期:<fm:input path="horsemanBornDate" id="horsemanBornDate"/><fm:errors path="horsemanBornDate"></fm:errors></br?--%>
<%--            联系电话:<fm:input path="horsemanPhone" id="horsemanPhone"/><fm:errors path="horsemanPhone"></fm:errors></br?--%>
<%--            联系地址:<fm:input path="horsemanAddress" id="horsemanAddress"/><fm:errors path="horsemanAddress"></fm:errors></br?--%>
<%--        </fm:form>--%>

    </div>
</body>
</html>
