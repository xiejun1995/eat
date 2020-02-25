<%@ page import="java.util.List" %>
<%@ page import="cn.kgc.eat.pojo.EatComment" %><%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/2/23
  Time: 11:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
    <title>Title</title>
    <style>
        li{
            list-style: none;
        }
        #one{
            border: none;
        }
    </style>
</head>
<body>
    <div id="test">
        <h2>评论区：</h2>
        <ul>
            <c:forEach items="${list}" var="comm">
                <li style="color: red">留言人：${comm.commentUserName}&nbsp;&nbsp;
                    留言时间：<fmt:formatDate value="${comm.commentDate}" pattern="yyyy-MM-dd"/>
                    <a href="/comment/deleteComment?id=${comm.commentId}">删除</a>
                </li>
                <li>${comm.commentContent}</li>
                <hr/>
            </c:forEach>
        </ul>
    </div>
    <form action="/comment/addComment" method="get">
        <%
            List<EatComment> list=(List<EatComment>) request.getAttribute("list");
            Integer commentMerchantId=null;
            for (EatComment comment:list) {
                commentMerchantId=comment.getCommentMerchantId();
                break;
            }
         %>
        <input type="hidden" name="commentMerchantId" value="<%=commentMerchantId%>"/>
        用户名：<input id="one" name="userName" value="王五" size="5"><br/>
        <textarea id="two" name="commentContent" cols="100" rows="10"></textarea><br/>
        <input type="submit" value="发 表 评 论"/>
    </form>
</body>
</html>
