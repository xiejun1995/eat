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
    <title>骑手管理</title>
</head>
<body>
<!-- left menu starts -->
<div class="span2 main-menu-span">
    <div class="well nav-collapse sidebar-nav">
        <ul class="nav nav-tabs nav-stacked main-menu">
            <li class="nav-header hidden-tablet">主菜单</li>
            <li><a class="ajax-link" href="${pageContext.request.contextPath}/horseman/toadd"><i class="icon-home"></i><span class="hidden-tablet"> 增加骑手</span></a></li>
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
<div>
    <form method="get" action="${pageContext.request.contextPath}/horseman/selectHoresmanByNameOrPhone?horsemanName=horsemanName">
        <p><input name="horsemanName" type="text"><input id="tijiao" type="submit" value="查询"></p>
    </form>
    <ul id="horsemanList"></ul>
</div>
<div>
    <table>
        <c:forEach items="${eatHorsemanList}" var="eatHorseman">
            <tr>
                <td>${eatHorseman.horsemanName}</td>
                <td>${eatHorseman.horsemanPassword}</td>
                <td><fm:formatDate pattern="yyyy-MM-dd" value="${eatHorseman.horsemanBornDate}"/></td>
                <td>${eatHorseman.horsemanPhone}</td>
                <td>${eatHorseman.horsemanAddress}</td>
                <td><a href="${pageContext.request.contextPath}/horseman/selectByPrimaryKey?horsemanPhone=${eatHorseman.horsemanPhone}">修改</a>&nbsp&nbsp
                    <a class="manageDel" href="${pageContext.request.contextPath}/horseman/deleteByPrimaryKey?horsemanPhone=${eatHorseman.horsemanPhone}">删除</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>




<script type="text/javascript" src="${pageContext.request.contextPath}/statics/plugin/Electro/js/jquery.min.js"/>
<script type="text/javascript">
    $(function () {
        var $tijiao = $("#tijiao");
        var $chaxun = $("#chaxun");
        var $url = $("#horsemanList");
        var li = "";
        $tijiao.click(function () {
            alert("点击事件执行");
            var chaxunVal = $chaxun.val();
            $.getJSON("${pageContext.request.contextPath}/horseman/selectHoresmanByNameOrPhone?horsemanName="+chaxunVal,"horsemanPhone?="+chaxunVal,function (result) {
                $(result).each(function (i) {
                    var horsemanName = result[i].horsemanName;
                    var horsemanPassword = result[i].horsemanPassword;
                    var horsemanBornDate = result[i].horsemanBornDate;
                    var horsemanPhone = result[i].horsemanPhone;
                    var horsemanAddress = result[i].horsemanAddress;
                    li += "<li>"+horsemanName+"&nbsp;&nbsp;"+horsemanPassword+"&nbsp;&nbsp;"+horsemanBornDate+"&nbsp;&nbsp;"+horsemanPhone+"&nbsp;&nbsp;"+horsemanAddress+"</li>";
                });
                $url.html(li);
            });
        });
    });


    //后台删除
    $(function(){
        $(".manageDel").click(function(){
            if(confirm("确定删除吗")){
                location.href="${pageContext.request.contextPath}/horseman/deleteByPrimaryKey?horsemanPhone=${eatHorseman.horsemanPhone}";
            }else{
            }
    });
    });




    <%--$(function () {--%>
    <%--    $.getJSON("${pageContext.request.contextPath}/horseman/selectHoresmanAll",function (result) {--%>
    <%--        var $url = $("#horsemanList");--%>
    <%--        var li = "";--%>
    <%--        var $result = result.result;--%>
    <%--        $($result).each(function (i) {--%>
    <%--            var horsemanName = $result[i].horsemanName;--%>
    <%--            var horsemanPassword = $result[i].horsemanPassword;--%>
    <%--            var horsemanBornDate = $result[i].horsemanBornDate;--%>
    <%--            var horsemanPhone = $result[i].horsemanPhone;--%>
    <%--            var horsemanAddress = $result[i].horsemanAddress;--%>
    <%--            li += "<li>"+horsemanName+"&nbsp;&nbsp;"+horsemanPassword+"&nbsp;&nbsp;"+horsemanBornDate+"&nbsp;&nbsp;"+horsemanPhone+"&nbsp;&nbsp;"+horsemanAddress+"</li>";--%>
    <%--        });--%>
    <%--        $url.append(li);--%>
    <%--    })--%>
    <%--})--%>
</script>
</body>
</html>
