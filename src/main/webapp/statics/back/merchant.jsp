<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fm" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: Allen
  Date: 2020/2/22
  Time: 21:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>商家</title>
</head>
<body>
<!-- left menu starts -->
<div class="span2 main-menu-span">
    <div class="well nav-collapse sidebar-nav">
        <ul class="nav nav-tabs nav-stacked main-menu">
            <li class="nav-header hidden-tablet">主菜单</li>
            <%--            <li><a class="ajax-link" href="ui.html"><i class="icon-eye-open"></i><span class="hidden-tablet"> 修改骑手</span></a></li>--%>
            <%--            <li><a class="ajax-link" href="form.html"><i class="icon-edit"></i><span class="hidden-tablet"> 商家管理</span></a></li>--%>
            <%--            <li><a class="ajax-link" href="chart.html"><i class="icon-list-alt"></i><span class="hidden-tablet"> 菜品管理</span></a></li>--%>
            <%--            <li><a class="ajax-link" href="typography.html"><i class="icon-font"></i><span class="hidden-tablet"> 骑手管理</span></a></li>--%>
            <%--            <li><a class="ajax-link" href="gallery.html"><i class="icon-picture"></i><span class="hidden-tablet"> 订单管理</span></a></li>--%>
            <%--            <li><a class="ajax-link" href="gallery.html"><i class="icon-picture"></i><span class="hidden-tablet"> 评论管理</span></a></li>--%>
        </ul>
    </div><!--/.well -->
</div><!--/span-->
<!-- left menu ends -->
<%--<div>--%>
<%--    <form method="post" action="${pageContext.request.contextPath}/horseman/selectHoresmanByNameOrPhone">--%>
<%--        <p><input name="horsemanName" type="text"><input name="horsemanPhone" type="text"><input id="tijiao" type="submit" value="查询"></p>--%>
<%--    </form>--%>
<%--    <ul id="horsemanList"></ul>--%>
<%--</div>--%>
<div>
    <form method="post" action="${pageContext.request.contextPath}/merchant/selectMerByName">
        <input name="greensName" type="text">
        <input type="submit" value="搜索">
    </form>
    <form method="post" action="${pageContext.request.contextPath}/merchant/selectMerByNameAddressGreensN">
        <input type="text" name="merchantName">
        <input type="text" name="merchantAddress">
        <input type="submit" value="搜索">
    </form>
    <table>
        <c:forEach items="${eatMerchantList}" var="eatMerchant">
            <tr>
                <td>${eatMerchant.merchantId}</td>
                <td>${eatMerchant.merchantName}</td>
                <td>${eatMerchant.merchantEmail}</td>
                <td>${eatMerchant.merchantPhone}</td>
                <td>${eatMerchant.merchantStatus}</td>
                <td>${eatMerchant.merchantAddress}</td>
                <td>${eatMerchant.merchantSecurityId}</td>

                <td><a href="${pageContext.request.contextPath}/merchant/findMetByid?merchantId=${eatMerchant.merchantId}">修改</a></td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
