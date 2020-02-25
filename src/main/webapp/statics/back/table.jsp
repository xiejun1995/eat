<%--Created by IntelliJ IDEA.
User: Administrator
Date: 2020/2/23
Time: 9:09
To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<html lang="en">
<head>
	<%--<%@ page isELIgnored="false" %>--%>
	<title>用户列表查询页面</title>
	<!-- The styles -->
	<link id="bs-css" href="../plugin/BootStrap/css/bootstrap-cerulean.css" rel="stylesheet">
	<style type="text/css">
		body {
			padding-bottom: 40px;
		}
		.sidebar-nav {
			padding: 9px 0;
		}
	</style>
	<link href="../plugin/BootStrap/css/bootstrap-responsive.css" rel="stylesheet">
	<link href="../plugin/BootStrap/css/charisma-app.css" rel="stylesheet">
	<link href="../plugin/BootStrap/css/jquery-ui-1.8.21.custom.css" rel="stylesheet">
	<link href='../plugin/BootStrap/css/fullcalendar.css' rel='stylesheet'>
	<link href='../plugin/BootStrap/css/fullcalendar.print.css' rel='stylesheet'  media='print'>
	<link href='../plugin/BootStrap/css/chosen.css' rel='stylesheet'>
	<link href='../plugin/BootStrap/css/uniform.default.css' rel='stylesheet'>
	<link href='../plugin/BootStrap/css/colorbox.css' rel='stylesheet'>
	<link href='../plugin/BootStrap/css/jquery.cleditor.css' rel='stylesheet'>
	<link href='../plugin/BootStrap/css/jquery.noty.css' rel='stylesheet'>
	<link href='../plugin/BootStrap/css/noty_theme_default.css' rel='stylesheet'>
	<link href='../plugin/BootStrap/css/elfinder.min.css' rel='stylesheet'>
	<link href='../plugin/BootStrap/css/elfinder.theme.css' rel='stylesheet'>
	<link href='../plugin/BootStrap/css/jquery.iphone.toggle.css' rel='stylesheet'>
	<link href='../plugin/BootStrap/css/opa-icons.css' rel='stylesheet'>
	<link href='../plugin/BootStrap/css/uploadify.css' rel='stylesheet'>

	<!-- The HTML5 shim, for IE6-8 support of HTML5 elements -->
	<!--[if lt IE 9]>
	<script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
	<![endif]-->

	<!-- The fav icon -->
	<link rel="shortcut icon" href="../plugin/BootStrap/img/favicon.ico">

</head>

<body>
<!-- topbar starts -->
<div class="navbar">
	<div class="navbar-inner">
		<div class="container-fluid">
			<a class="btn btn-navbar" data-toggle="collapse" data-target=".top-nav.nav-collapse,.sidebar-nav.nav-collapse">
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
			</a>
			<a class="brand" href="../plugin/BootStrap/index.html"> CRM</a>

			<!-- theme selector starts -->
			<div class="btn-group pull-right theme-container" >
				<a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
					<i class="icon-tint"></i><span class="hidden-phone"> Change Theme / Skin</span>
					<span class="caret"></span>
				</a>
				<ul class="dropdown-menu" id="themes">
					<li><a data-value="classic" href="#"><i class="icon-blank"></i> Classic</a></li>
					<li><a data-value="cerulean" href="#"><i class="icon-blank"></i> Cerulean</a></li>
					<li><a data-value="cyborg" href="#"><i class="icon-blank"></i> Cyborg</a></li>
					<li><a data-value="redy" href="#"><i class="icon-blank"></i> Redy</a></li>
					<li><a data-value="journal" href="#"><i class="icon-blank"></i> Journal</a></li>
					<li><a data-value="simplex" href="#"><i class="icon-blank"></i> Simplex</a></li>
					<li><a data-value="slate" href="#"><i class="icon-blank"></i> Slate</a></li>
					<li><a data-value="spacelab" href="#"><i class="icon-blank"></i> Spacelab</a></li>
					<li><a data-value="united" href="#"><i class="icon-blank"></i> United</a></li>
				</ul>
			</div>
			<!-- theme selector ends -->

			<!-- user dropdown starts -->
			<div class="btn-group pull-right" >
				<a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
					<i class="icon-user"></i><span class="hidden-phone"> admin</span>
					<span class="caret"></span>
				</a>
				<ul class="dropdown-menu">
					<li><a href="#">Profile</a></li>
					<li class="divider"></li>
					<li><a href="../plugin/BootStrap/login.html">Logout</a></li>
				</ul>
			</div>
			<!-- user dropdown ends -->

			<div class="top-nav nav-collapse">
				<ul class="nav">
					<li><a href="#">Visit Site</a></li>
					<li>
						<form class="navbar-search pull-left">
							<input placeholder="Search" class="search-query span2" name="query" type="text">
						</form>
					</li>
				</ul>
			</div><!--/.nav-collapse -->
		</div>
	</div>
</div>
<!-- topbar ends -->
<div class="container-fluid">
	<div class="row-fluid">

		<!-- left menu starts -->
		<div class="span2 main-menu-span">
			<div class="well nav-collapse sidebar-nav">
				<ul class="nav nav-tabs nav-stacked main-menu">
					<li class="nav-header hidden-tablet">菜单管理</li>
					<li><a class="ajax-link" href="../plugin/BootStrap/index.html"><i class="icon-list-alt"></i><span class="hidden-tablet"> 用户管理</span></a></li>
					<li><a class="ajax-link" href="../plugin/BootStrap/ui.html"><i class="icon-list-alt"></i><span class="hidden-tablet">菜系管理</span></a></li>
					<li><a class="ajax-link" href="../plugin/BootStrap/form.html"><i class="icon-list-alt"></i><span class="hidden-tablet">商家管理</span></a></li>
					<li><a class="ajax-link" href="../plugin/BootStrap/chart.html"><i class="icon-list-alt"></i><span class="hidden-tablet">菜品管理</span></a></li>
					<li><a class="ajax-link" href="../plugin/BootStrap/typography.html"><i class="icon-list-alt"></i><span class="hidden-tablet"> 骑手管理</span></a></li>
					<li><a class="ajax-link" href="../plugin/BootStrap/gallery.html"><i class="icon-list-alt"></i><span class="hidden-tablet"> 订单管理</span></a></li>
					<li><a class="ajax-link" href="../plugin/BootStrap/gallery.html"><i class="icon-list-alt"></i><span class="hidden-tablet"> 评论管理</span></a></li>
				</ul>
				<label id="for-is-ajax" class="hidden-tablet" for="is-ajax"><input id="is-ajax" type="checkbox"> Ajax on menu</label>
			</div><!--/.well -->
		</div><!--/span-->
		<!-- left menu ends -->

		<noscript>
			<div class="alert alert-block span10">
				<h4 class="alert-heading">Warning!</h4>
				<p>You need to have <a href="http://en.wikipedia.org/wiki/JavaScript" target="_blank">JavaScript</a> enabled to use this site.</p>
			</div>
		</noscript>

		<div id="content" class="span10">
			<!-- content starts -->
			<div>
				<ul class="breadcrumb">
					<li>
						<a href="#">Home</a> <span class="divider">/</span>
					</li>
					<li>
						<a href="#">Tables</a>
					</li>
				</ul>
			</div>

			<div class="row-fluid sortable">
				<div class="box span12">
					<div class="box-header well" data-original-title>
						<h2><i class="icon-user"></i> Members</h2>
						<div class="box-icon">
							<a href="#" class="btn btn-setting btn-round"><i class="icon-cog"></i></a>
							<a href="#" class="btn btn-minimize btn-round"><i class="icon-chevron-up"></i></a>
							<a href="#" class="btn btn-close btn-round"><i class="icon-remove"></i></a>
						</div>
					</div>
					<div class="box-content">
						<table class="table table-striped table-bordered bootstrap-datatable datatable">
							<thead>
							<tr>
								<th>用户ID</th>
								<th>用户姓名</th>
								<th>用户密码</th>
								<th>出生日期</th>
								<th>电话号码</th>
								<th>邮箱</th>
								<th>操作</th>
							</tr>
							</thead>
							<tbody>
							<%--<c:forEach items="${userList}" var="user">
								<tr>
									<td>${user.userId}</td>
									<td>${user.userName}</td>
									<td>${user.userPassword}</td>
									<td>${user.userBornDate}</td>
									<td>${user.userPhone}</td>
									<td>${user.userEmail}</td>
									<td><a href="${pageContext.request.contextPath}/user/toUpdateUser?userId=${user.userId}">修改</a>&nbsp;&nbsp;
										<a href="${pageContext.request.contextPath}/user/deleteUser?userId=${user.userId}">删除</a>
									</td>
								</tr>
							</c:forEach>--%>
							</tbody>
						</table>
					</div>
				</div><!--/span-->

			</div><!--/row-->



			<!-- content ends -->
		</div><!--/#content.span10-->
	</div><!--/fluid-row-->

	<hr>

	<div class="modal hide fade" id="myModal">
		<div class="modal-header">
			<button type="button" class="close" data-dismiss="modal">×</button>
			<h3>Settings</h3>
		</div>
		<div class="modal-body">
			<p>Here settings can be configured...</p>
		</div>
		<div class="modal-footer">
			<a href="#" class="btn" data-dismiss="modal">Close</a>
			<a href="#" class="btn btn-primary">Save changes</a>
		</div>
	</div>

	<footer>
		<p class="pull-left">&copy; 2017</p>
		<p class="pull-right">&nbsp;2017</p>
	</footer>

</div><!--/.fluid-container-->

<!-- external javascript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->

<!-- jQuery -->
<script src="../plugin/BootStrap/js/jquery-1.7.2.min.js"></script>
<!-- jQuery UI -->
<script src="../plugin/BootStrap/js/jquery-ui-1.8.21.custom.min.js"></script>
<!-- transition / effect library -->
<script src="../plugin/BootStrap/js/bootstrap-transition.js"></script>
<!-- alert enhancer library -->
<script src="../plugin/BootStrap/js/bootstrap-alert.js"></script>
<!-- modal / dialog library -->
<script src="../plugin/BootStrap/js/bootstrap-modal.js"></script>
<!-- custom dropdown library -->
<script src="../plugin/BootStrap/js/bootstrap-dropdown.js"></script>
<!-- scrolspy library -->
<script src="../plugin/BootStrap/js/bootstrap-scrollspy.js"></script>
<!-- library for creating tabs -->
<script src="../plugin/BootStrap/js/bootstrap-tab.js"></script>
<!-- library for advanced tooltip -->
<script src="../plugin/BootStrap/js/bootstrap-tooltip.js"></script>
<!-- popover effect library -->
<script src="../plugin/BootStrap/js/bootstrap-popover.js"></script>
<!-- button enhancer library -->
<script src="../plugin/BootStrap/js/bootstrap-button.js"></script>
<!-- accordion library (optional, not used in demo) -->
<script src="../plugin/BootStrap/js/bootstrap-collapse.js"></script>
<!-- carousel slideshow library (optional, not used in demo) -->
<script src="../plugin/BootStrap/js/bootstrap-carousel.js"></script>
<!-- autocomplete library -->
<script src="../plugin/BootStrap/js/bootstrap-typeahead.js"></script>
<!-- tour library -->
<script src="../plugin/BootStrap/js/bootstrap-tour.js"></script>
<!-- library for cookie management -->
<script src="../plugin/BootStrap/js/jquery.cookie.js"></script>
<!-- calander plugin -->
<script src='../plugin/BootStrap/js/fullcalendar.min.js'></script>
<!-- data table plugin -->
<script src='../plugin/BootStrap/js/jquery.dataTables.min.js'></script>

<!-- chart libraries start -->
<script src="../plugin/BootStrap/js/excanvas.js"></script>
<script src="../plugin/BootStrap/js/jquery.flot.min.js"></script>
<script src="../plugin/BootStrap/js/jquery.flot.pie.min.js"></script>
<script src="../plugin/BootStrap/js/jquery.flot.stack.js"></script>
<script src="../plugin/BootStrap/js/jquery.flot.resize.min.js"></script>
<!-- chart libraries end -->

<!-- select or dropdown enhancer -->
<script src="../plugin/BootStrap/js/jquery.chosen.min.js"></script>
<!-- checkbox, radio, and file input styler -->
<script src="../plugin/BootStrap/js/jquery.uniform.min.js"></script>
<!-- plugin for gallery image view -->
<script src="../plugin/BootStrap/js/jquery.colorbox.min.js"></script>
<!-- rich text editor library -->
<script src="../plugin/BootStrap/js/jquery.cleditor.min.js"></script>
<!-- notification plugin -->
<script src="../plugin/BootStrap/js/jquery.noty.js"></script>
<!-- file manager library -->
<script src="../plugin/BootStrap/js/jquery.elfinder.min.js"></script>
<!-- star rating plugin -->
<script src="../plugin/BootStrap/js/jquery.raty.min.js"></script>
<!-- for iOS style toggle switch -->
<script src="../plugin/BootStrap/js/jquery.iphone.toggle.js"></script>
<!-- autogrowing textarea plugin -->
<script src="../plugin/BootStrap/js/jquery.autogrow-textarea.js"></script>
<!-- multiple file upload plugin -->
<script src="../plugin/BootStrap/js/jquery.uploadify-3.1.min.js"></script>
<!-- history.js for cross-browser state change on ajax -->
<script src="../plugin/BootStrap/js/jquery.history.js"></script>
<!-- application script for Charisma demo -->
<script src="js/charisma.js"></script>


</body>
</html>
