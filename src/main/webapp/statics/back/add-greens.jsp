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
    <link href="${pageContext.request.contextPath}/statics/plugin/BootStrap/css/bootstrap-classic.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/statics/css/bootstrap-fileinput.css" rel="stylesheet">
</head>
<body>
<div style="margin-left: 500px;margin-top:50px;border: #317eac solid 1px;width: 320px;height: 560px;padding-left: 100px">
    <h2>添加菜品信息</h2>
    <form method="post" action="${pageContext.request.contextPath}/addGreens" enctype="multipart/form-data">
        菜品名字：<br>
        &nbsp;&nbsp;<input type="text" name="greensName" required="required" placeholder="请输入菜品名称"/><br/>
        菜品价格：<br>
        &nbsp;&nbsp;<input type="text" name="greensPrice" required title=" " placeholder="请输入菜品价格"/><br/>
        所属区域：<br>
        &nbsp;&nbsp;<input type="text" name="greensAddress" required title="" placeholder="请输入所属区域"/><br/>
        菜系分类：<br>
        <select name="greensTypeId">
            <option value="1">蛋糕甜点</option>
            <option value="2">火锅</option>
            <option value="3">自助餐</option>
            <option value="4">小吃快餐</option>
            <option value="5">日韩料理</option>
            <option value="6">西餐</option>
            <option value="7">聚餐宴请</option>
            <option value="8">烧烤烤肉</option>
            <option value="9">东北菜</option>
            <option value="10">川湘菜</option>
            <option value="11">江浙菜</option>
            <option value="12">香锅烤鱼</option>
            <option value="13">粤菜</option>
            <option value="14">中式烧烤/烤串</option>
            <option value="15">西北菜</option>
            <option value="16">咖啡酒吧</option>
            <option value="17">云贵菜</option>
            <option value="18">东南亚菜</option>
            <option value="19">海鲜</option>
            <option value="20">素食</option>
            <option value="21">台湾/客家菜</option>
            <option value="22">创意菜</option>
            <option value="23">汤/粥/炖菜</option>
            <option value="24">蒙餐</option>
            <option value="25">新疆菜</option>
            <option value="26">其他美食</option>
            <option value="27">京菜鲁菜</option>
        </select>
        <br>
        菜品描述：<br>
        &nbsp;&nbsp;<input type="text" name="greensDetails" required title="" placeholder="请输入菜品描述"/><br/>
        图片上传：
        <div class="fileinput fileinput-new" data-provides="fileinput" id="uploadImageDiv">
            <div class="fileinput-new thumbnail" style="width: 200px; height: 150px;">
                <img src="${companyInfo.image}" alt="" />
            </div>
            <div class="fileinput-preview fileinput-exists thumbnail" style="max-width: 200px; max-height: 150px;"></div>
            <div>
                    <span class="btn default btn-file">
                        <span class="fileinput-new">选择图片</span>
                        <span class="fileinput-exists">更改</span>
                        <input type="file" name="uploadImage" id="uploadImage" />
                    </span>&nbsp;&nbsp;
                <a href="#" class="btn default fileinput-exists" data-dismiss="fileinput">移除</a>
                <span>请上传菜品图片选择500k以内</span>
            </div>
        </div>
        <div id="titleImageError" style="color: #a94442"></div>
        &nbsp;&nbsp;<input type="submit" value="提交">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        &nbsp;&nbsp;<input type="reset" value="重置">
    </form>
</div>
</body>
</html>

<script src="${pageContext.request.contextPath}/statics/plugin/BootStrap/js/jquery-1.7.2.min.js"></script>
<script src="${pageContext.request.contextPath}/statics/js/bootstrap-fileinput.js"></script>
<%--
<script>
    var url = '';
    $("#uploadImage").fileinput({
        url : ROOT+"${pageContext.request.contextPath}/statics/img",
        dataType : 'json',
        autoUpload : false,
        acceptFileTypes : /(gif|jpe?g|png)$/i,
        maxFileSize : 1000000, // 1 MB
        imageMaxWidth : 220,
        imageMaxHeight : 130,
        messages : {
            acceptFileTypes : '文件类型不匹配',
            maxFileSize : '文件过大',
            minFileSize : '文件过小'
        }
    }).on("fileuploadadd", function(e, data) {
        // 当文件添加上去时候调用
        $("#titleImageError").html("");
        data.submit()
    }).on("fileuploaddone", function(e, data) {
        console.log("成功");
        // 上传完成时调用
        if (data.result.returnState == "ERROR") {
            alert("上传失败")
            return;
        }
        url = data.result.returnData.url;
    });

    function updateMsg() {
        $.ajax({
            url : ROOT+"${pageContext.request.contextPath}/statics/img",
            data : {
                id : $("#companyId").val(),
                image : url,
                companyName : $("#companyName").val(),
                companySite : $("#companySite").val(),
                companyLinker : $("#companyLinker").val(),
                companyTel : $("#companyTel").val()
            },
            type : "post",
            success : function(data) {
                if (data.returnState == "OK") {
                    console.log("成功");
                    layer.msg('操作成功', {
                        icon : 6,
                        shade : 0.01,
                        offset : [ '57px', '1100px' ]
                    });
                    $table.bootstrapTable('refresh');
                } else {
                    layer.msg('操作失败', {
                        icon : 5,
                        shade : 0.01,
                        offset : [ '90px', '900px' ]
                    });
                }
            }
        });
    }
</script>--%>
