<%@ page import="cn.kgc.eat.pojo.EatOrder" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
	<!DOCTYPE html>
	<html lang="zh-CN">
	<head>
		<!--
			Charisma v1.0.0

			Copyright 2012 Muhammad Usman
			Licensed under the Apache License v2.0
			http://www.apache.org/licenses/LICENSE-2.0

			http://usman.it
			http://twitter.com/halalit_usman
		-->
		<meta charset="utf-8">
		<title>Free HTML5 Bootstrap Admin Template</title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<meta name="description" content="Charisma, a fully featured, responsive, HTML5, Bootstrap admin template.">
		<meta name="author" content="Muhammad Usman">
		<%
			List<EatOrder> list=(List<EatOrder>) request.getAttribute("orderList");
			String name=null;
			if (list!=null){
				for (EatOrder order:list) {
					name=order.getOrderPeople();
					break;
				}
			}
		%>
		<!-- The styles -->
		<link id="bs-css" href="${pageContext.request.contextPath}/statics/plugin/BootStrap/css/bootstrap-cerulean.css" rel="stylesheet">
		<link href="${pageContext.request.contextPath}/statics/plugin/BootStrap/css/bootstrap-responsive.css" rel="stylesheet">
		<link href="${pageContext.request.contextPath}/statics/plugin/BootStrap/css/bootstrap-simplex.css" rel="stylesheet">
		<link href="${pageContext.request.contextPath}/statics/plugin/BootStrap/css/bootstrap-classic.css" rel="stylesheet">
		<link href="${pageContext.request.contextPath}/statics/plugin/BootStrap/css/charisma-app.css" rel="stylesheet">
		<link href="${pageContext.request.contextPath}/statics/plugin/BootStrap/css/jquery-ui-1.8.21.custom.css" rel="stylesheet">
		<link href='${pageContext.request.contextPath}/statics/plugin/BootStrap/css/fullcalendar.css' rel='stylesheet'>
		<link href='${pageContext.request.contextPath}/statics/plugin/BootStrap/css/fullcalendar.print.css' rel='stylesheet' media='print'>
		<link href='${pageContext.request.contextPath}/statics/plugin/BootStrap/css/chosen.css' rel='stylesheet'>
		<link href='${pageContext.request.contextPath}/statics/plugin/BootStrap/css/uniform.default.css' rel='stylesheet'>
		<link href='${pageContext.request.contextPath}/statics/plugin/BootStrap/css/colorbox.css' rel='stylesheet'>
		<link href='${pageContext.request.contextPath}/statics/plugin/BootStrap/css/jquery.cleditor.css' rel='stylesheet'>
		<link href='${pageContext.request.contextPath}/statics/plugin/BootStrap/css/jquery.noty.css' rel='stylesheet'>
		<link href='${pageContext.request.contextPath}/statics/plugin/BootStrap/css/noty_theme_default.css' rel='stylesheet'>
		<link href='${pageContext.request.contextPath}/statics/plugin/BootStrap/css/elfinder.min.css' rel='stylesheet'>
		<link href='${pageContext.request.contextPath}/statics/plugin/BootStrap/css/elfinder.theme.css' rel='stylesheet'>
		<link href='${pageContext.request.contextPath}/statics/plugin/BootStrap/css/jquery.iphone.toggle.css' rel='stylesheet'>
		<link href='${pageContext.request.contextPath}/statics/plugin/BootStrap/css/opa-icons.css' rel='stylesheet'>
		<link href='${pageContext.request.contextPath}/statics/plugin/BootStrap/css/uploadify.css' rel='stylesheet'>

		<!-- The HTML5 shim, for IE6-8 support of HTML5 elements -->
		<!--[if lt IE 9]>
		<script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
		<![endif]-->

		<!-- The fav icon -->
		<link rel="shortcut icon" href="${pageContext.request.contextPath}/statics/plugin/BootStrap/img/favicon.ico">

	</head>

	<body>

	<div class="container-fluid">
		<div class="row-fluid">



			<noscript>
				<div class="alert alert-block span10">
					<h4 class="alert-heading">Warning!</h4>
					<p>You need to have <a href="http://en.wikipedia.org/wiki/JavaScript" target="_blank">JavaScript</a> enabled to use this site.</p>
				</div>
			</noscript>

			<div id="content" class="span10">
				<!-- content starts -->




				<div class="row-fluid sortable">
					<div class="box span12">
						<div class="box-header well" data-original-title>
							<h2><i class="icon-user"></i>我的订单</h2>
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
									<th>订单号</th>
									<th>订单人</th>
									<th>商家名称</th>
									<th>下单时间</th>
									<th>订单状态</th>
									<th>配送时间</th>
									<td>操作</td>
								</tr>
								</thead>
								<tbody>
								<%--查询我的订单--%>
								<c:if test="${orderList != null}">
									<c:forEach items="${orderList}" var="order">
										<tr>
											<td class="center">${order.orderId}</td>
											<td class="center">${order.orderPeople}</td>
											<td class="center">${order.orderMerchantName}</td>
											<td class="center"><fmt:formatDate value="${order.orderTime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
											<td class="center">${order.statusName}</td>
											<td class="center"><fmt:formatDate value="${order.orderDeliveryTime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
											<td class="center">
												<a class="btn btn-danger" href="/order/delete?id=${order.orderId}">
													<i class="icon-trash icon-white"></i>
													删除
												</a>
											</td>
										</tr>
									</c:forEach>
								</c:if>
								<%--查询我的订单end--%>


								<%--根据所有条件查询订单--%>
								<c:if test="${orderListByAll != null}">
									<c:forEach items="${orderListByAll}" var="order">
										<tr>
											<td class="center">${order.orderId}</td>
											<td class="center">${order.orderPeople}</td>
											<td class="center">${order.orderMerchantName}</td>
											<td class="center"><fmt:formatDate value="${order.orderTime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
											<td class="center">${order.statusName}</td>
											<td class="center"><fmt:formatDate value="${order.orderDeliveryTime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
											<td class="center">2</td>
											<td class="center">
												<a class="btn btn-danger" href="/order/delete?id=${order.orderId}">
													<i class="icon-trash icon-white"></i>
													删除
												</a>
											</td>
										</tr>
									</c:forEach>
								</c:if>
								<%--根据所有条件查询订单end--%>
								</tbody>
							</table>
						</div>
					</div><!--/span-->
				</div><!--/row-->
			</div><!--/#content.span10-->
		</div><!--/fluid-row-->



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


	</div><!--/.fluid-container-->

	<!-- external javascript
	================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->

	<!-- jQuery -->
	<script src="${pageContext.request.contextPath}/statics/plugin/BootStrap/js/jquery-1.7.2.min.js"></script>
	<!-- jQuery UI -->
	<script src="${pageContext.request.contextPath}/statics/plugin/BootStrap/js/jquery-ui-1.8.21.custom.min.js"></script>
	<!-- transition / effect library -->
	<script src="${pageContext.request.contextPath}/statics/plugin/BootStrap/js/bootstrap-transition.js"></script>
	<!-- alert enhancer library -->
	<script src="${pageContext.request.contextPath}/statics/plugin/BootStrap/js/bootstrap-alert.js"></script>
	<!-- modal / dialog library -->
	<script src="${pageContext.request.contextPath}/statics/plugin/BootStrap/js/bootstrap-modal.js"></script>
	<!-- custom dropdown library -->
	<script src="${pageContext.request.contextPath}/statics/plugin/BootStrap/js/bootstrap-dropdown.js"></script>
	<!-- scrolspy library -->
	<script src="${pageContext.request.contextPath}/statics/plugin/BootStrap/js/bootstrap-scrollspy.js"></script>
	<!-- library for creating tabs -->
	<script src="${pageContext.request.contextPath}/statics/plugin/BootStrap/js/bootstrap-tab.js"></script>
	<!-- library for advanced tooltip -->
	<script src="${pageContext.request.contextPath}/statics/plugin/BootStrap/js/bootstrap-tooltip.js"></script>
	<!-- popover effect library -->
	<script src="${pageContext.request.contextPath}/statics/plugin/BootStrap/js/bootstrap-popover.js"></script>
	<!-- button enhancer library -->
	<script src="${pageContext.request.contextPath}/statics/plugin/BootStrap/js/bootstrap-button.js"></script>
	<!-- accordion library (optional, not used in demo) -->
	<script src="${pageContext.request.contextPath}/statics/plugin/BootStrap/js/bootstrap-collapse.js"></script>
	<!-- carousel slideshow library (optional, not used in demo) -->
	<script src="${pageContext.request.contextPath}/statics/plugin/BootStrap/js/bootstrap-carousel.js"></script>
	<!-- autocomplete library -->
	<script src="${pageContext.request.contextPath}/statics/plugin/BootStrap/js/bootstrap-typeahead.js"></script>
	<!-- tour library -->
	<script src="${pageContext.request.contextPath}/statics/plugin/BootStrap/js/bootstrap-tour.js"></script>
	<!-- library for cookie management -->
	<script src="${pageContext.request.contextPath}/statics/plugin/BootStrap/js/jquery.cookie.js"></script>
	<!-- calander plugin -->
	<script src='${pageContext.request.contextPath}/statics/plugin/BootStrap/js/fullcalendar.min.js'></script>
	<!-- data table plugin -->
	<script src='${pageContext.request.contextPath}/statics/plugin/BootStrap/js/jquery.dataTables.min.js'></script>

	<!-- chart libraries start -->
	<script src="${pageContext.request.contextPath}/statics/plugin/BootStrap/js/excanvas.js"></script>
	<script src="${pageContext.request.contextPath}/statics/plugin/BootStrap/js/jquery.flot.min.js"></script>
	<script src="${pageContext.request.contextPath}/statics/plugin/BootStrap/js/jquery.flot.pie.min.js"></script>
	<script src="${pageContext.request.contextPath}/statics/plugin/BootStrap/js/jquery.flot.stack.js"></script>
	<script src="${pageContext.request.contextPath}/statics/plugin/BootStrap/js/jquery.flot.resize.min.js"></script>
	<!-- chart libraries end -->

	<!-- select or dropdown enhancer -->
	<script src="${pageContext.request.contextPath}/statics/plugin/BootStrap/js/jquery.chosen.min.js"></script>
	<!-- checkbox, radio, and file input styler -->
	<script src="${pageContext.request.contextPath}/statics/plugin/BootStrap/js/jquery.uniform.min.js"></script>
	<!-- plugin for gallery image view -->
	<script src="${pageContext.request.contextPath}/statics/plugin/BootStrap/js/jquery.colorbox.min.js"></script>
	<!-- rich text editor library -->
	<script src="${pageContext.request.contextPath}/statics/plugin/BootStrap/js/jquery.cleditor.min.js"></script>
	<!-- notification plugin -->
	<script src="${pageContext.request.contextPath}/statics/plugin/BootStrap/js/jquery.noty.js"></script>
	<!-- file manager library -->
	<script src="${pageContext.request.contextPath}/statics/plugin/BootStrap/js/jquery.elfinder.min.js"></script>
	<!-- star rating plugin -->
	<script src="${pageContext.request.contextPath}/statics/plugin/BootStrap/js/jquery.raty.min.js"></script>
	<!-- for iOS style toggle switch -->
	<script src="${pageContext.request.contextPath}/statics/plugin/BootStrap/js/jquery.iphone.toggle.js"></script>
	<!-- autogrowing textarea plugin -->
	<script src="${pageContext.request.contextPath}/statics/plugin/BootStrap/js/jquery.autogrow-textarea.js"></script>
	<!-- multiple file upload plugin -->
	<script src="${pageContext.request.contextPath}/statics/plugin/BootStrap/js/jquery.uploadify-3.1.min.js"></script>
	<!-- history.js for cross-browser state change on ajax -->
	<script src="${pageContext.request.contextPath}/statics/plugin/BootStrap/js/jquery.history.js"></script>
	<!-- application script for Charisma demo -->
	<script src="${pageContext.request.contextPath}/statics/plugin/BootStrap/js/charisma.js"></script>
	</body>
	</html>
