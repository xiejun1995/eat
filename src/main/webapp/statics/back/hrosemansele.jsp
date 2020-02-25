<%--
  Created by IntelliJ IDEA.
  User: Allen
  Date: 2020/2/24
  Time: 20:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <div>
        <table>
            <tr>

            </tr>
        </table>
    </div>


    <script src="${pageContext.request.contextPath}/statics/plugin/BootStrap/js/jquery.js"></script>
    <script>
        $(function () {
            $.getJSON("${pageContext.request.contextPath}/horseman/selectHoresmanAll",function (result) {
                var $url = $("tr");
                var td = "";
                // var $result = result.result;
                $(result).each(function (i) {
                    var horsemanName = result[i].horsemanName;
                    var horsemanPassword = result[i].horsemanPassword;
                    var horsemanBornDate = result[i].horsemanBornDate;
                    var horsemanPhone = result[i].horsemanPhone;
                    var horsemanAddress = result[i].horsemanAddress;
                    td += "<td>"+horsemanName+"</td><td>"+horsemanPassword+"</td><td>"+horsemanBornDate+"</td><td>"+horsemanPhone+"</td><td>"+horsemanAddress+"</td>";
                });
                    $url.html(td);
            })
        })
    </script>
</body>
</html>
