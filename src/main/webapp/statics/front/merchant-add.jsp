<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fm" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: 谢军军
  Date: 2020/2/22
  Time: 16:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->

	<title>Electro - HTML Ecommerce Template</title>

	<!-- Google font -->
	<link href="https://fonts.googleapis.com/css?family=Montserrat:400,500,700" rel="stylesheet">

	<!-- Bootstrap -->
	<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/statics/plugin/Electro/css/bootstrap.min.css"/>

	<!-- Slick -->
	<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/statics/plugin/Electro/css/slick.css"/>
	<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/statics/plugin/Electro/css/slick-theme.css"/>

	<!-- nouislider -->
	<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/statics/plugin/Electro/css/nouislider.min.css"/>

	<!-- Font Awesome Icon -->
	<link rel="stylesheet" href="${pageContext.request.contextPath}/statics/plugin/Electro/css/font-awesome.min.css">

	<!-- Custom stlylesheet -->
	<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/statics/plugin/Electro/css/style.css"/>
	<link href="${pageContext.request.contextPath}/statics/plugin/BootStrap/css/bootstrap-classic.css" rel="stylesheet">
	<link href="${pageContext.request.contextPath}/statics/plugin/BootStrap/css/bootstrap-fileinput.css" rel="stylesheet">
	<link href="${pageContext.request.contextPath}/statics/plugin/BootStrap/css/bootstrap-responsive.css" rel="stylesheet">
	<link href="${pageContext.request.contextPath}/statics/plugin/BootStrap/css/charisma-app.css" rel="stylesheet">
	<link href="${pageContext.request.contextPath}/statics/plugin/BootStrap/css/jquery-ui-1.8.21.custom.css" rel="stylesheet">
	<link href='${pageContext.request.contextPath}/statics/plugin/BootStrap/css/fullcalendar.css' rel='stylesheet'>
	<link href='${pageContext.request.contextPath}/statics/plugin/BootStrap/css/fullcalendar.print.css' rel='stylesheet'  media='print'>
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
	<link rel="shortcut icon" href="${pageContext.request.contextPath}/statics/plugin/BootStrap/img/favicon.ico">

	<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
	<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
	<!--[if lt IE 9]>
	<script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
	<script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
	<![endif]-->

</head>
<body>
<!-- HEADER -->
<header>
	<!-- TOP HEADER -->
	<div id="top-header">
		<div class="container">
			<ul class="header-links pull-left">
				<li><a href="#"><i class="fa fa-phone"></i> +021-95-51-84</a></li>
				<li><a href="#"><i class="fa fa-envelope-o"></i> email@email.com</a></li>
				<li><a href="#"><i class="fa fa-map-marker"></i> 1734 Stonecoal Road</a></li>
			</ul>
			<ul class="header-links pull-right">
				<li><a href="#"><i class="fa fa-dollar"></i> USD</a></li>
				<li><a href="/order/myorder"><i class="fa fa-user-o"></i> 我的账户</a></li>
			</ul>
		</div>
	</div>
	<!-- /TOP HEADER -->

	<!-- MAIN HEADER -->
	<div id="header">
		<!-- container -->
		<div class="container">
			<!-- row -->
			<div class="row">
				<!-- LOGO -->
				<div class="col-md-3">
					<div class="header-logo">
						<a href="#" class="logo">
							<img src="${pageContext.request.contextPath}/statics/plugin/Electro/img/logo.png" alt="">
						</a>
					</div>
				</div>
				<!-- /LOGO -->

				<!-- SEARCH BAR -->
				<div class="col-md-6">
					<div class="header-search">
						<form method="get" action="/user/selectByAddressORGreensName">
							<input class="input" name="text" placeholder="请输入搜索地址或菜名">
							<button class="search-btn">Search</button>
						</form>
					</div>
				</div>
				<!-- /SEARCH BAR -->

				<!-- ACCOUNT -->
				<div class="col-md-3 clearfix">
					<div class="header-ctn">
						<!-- Wishlist -->
						<div>
							<a href="#">
								<i class="fa fa-heart-o"></i>
								<span>Your Wishlist</span>
								<div class="qty">2</div>
							</a>
						</div>
						<!-- /Wishlist -->

						<!-- Cart -->
						<div class="dropdown">
							<a class="dropdown-toggle" data-toggle="dropdown" aria-expanded="true">
								<i class="fa fa-shopping-cart"></i>
								<span>Your Cart</span>
								<div class="qty">3</div>
							</a>
							<div class="cart-dropdown">
								<div class="cart-list">
									<div class="product-widget">
										<div class="product-img">
											<img src="${pageContext.request.contextPath}/statics/plugin/Electro/img/product01.png" alt="">
										</div>
										<div class="product-body">
											<h3 class="product-name"><a href="#">product name goes here</a></h3>
											<h4 class="product-price"><span class="qty">1x</span>$980.00</h4>
										</div>
										<button class="delete"><i class="fa fa-close"></i></button>
									</div>

									<div class="product-widget">
										<div class="product-img">
											<img src="${pageContext.request.contextPath}/statics/plugin/Electro/img/product02.png" alt="">
										</div>
										<div class="product-body">
											<h3 class="product-name"><a href="#">product name goes here</a></h3>
											<h4 class="product-price"><span class="qty">3x</span>$980.00</h4>
										</div>
										<button class="delete"><i class="fa fa-close"></i></button>
									</div>
								</div>
								<div class="cart-summary">
									<small>3 Item(s) selected</small>
									<h5>SUBTOTAL: $2940.00</h5>
								</div>
								<div class="cart-btns">
									<a href="#">View Cart</a>
									<a href="#">Checkout  <i class="fa fa-arrow-circle-right"></i></a>
								</div>
							</div>
						</div>
						<!-- /Cart -->

						<!-- Menu Toogle -->
						<div class="menu-toggle">
							<a href="#">
								<i class="fa fa-bars"></i>
								<span>Menu</span>
							</a>
						</div>
						<!-- /Menu Toogle -->
					</div>
				</div>
				<!-- /ACCOUNT -->
			</div>
			<!-- row -->
		</div>
		<!-- container -->
	</div>
	<!-- /MAIN HEADER -->
</header>
<!-- /HEADER -->

<!-- NAVIGATION -->

<!-- /NAVIGATION -->

<!-- topbar ends -->
<div class="container-fluid">
	<div class="row-fluid">

		<!-- left menu starts -->

		<!-- left menu ends -->

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
						<h2><i class="icon-edit"></i> 商家添加菜品信息</h2>
						<div class="box-icon">
							<a href="#" class="btn btn-setting btn-round"><i class="icon-cog"></i></a>
							<a href="#" class="btn btn-minimize btn-round"><i class="icon-chevron-up"></i></a>
							<a href="#" class="btn btn-close btn-round"><i class="icon-remove"></i></a>
						</div>
					</div>
					<div class="box-content">
						<form class="form-horizontal" action="${pageContext.request.contextPath}/greens/addPics" method="post" enctype="multipart/form-data">
							<fieldset>
								<div class="control-group">
									<label class="control-label" for="greensName" style="display:inline;">菜品名称 : </label>
									<div class="input-group">
										<input type="text" name="greensName" class="form-control" id="greensName" style="display: inline;width: 200px" autocomplete="off"
											   required title="菜品名称不能为空" placeholder="请输入菜品名称" value="${eatGreens.greensName}">
									</div>
								</div>
								<div class="control-group">
									<label class="control-label" for="greensPrice" style="display:inline;">菜品价格 : </label>
									<div class="input-group">
										<input type="text" name="greensPrice" class="form-control" id="greensPrice" style="display: inline;width: 200px" autocomplete="off"
											   pattern="[1-9]\d*(.\d{1,2})?" title="菜品价格填写不正确" placeholder="请输入菜品价格"
											   value="${eatGreens.greensPrice}">
									</div>
								</div>
								<div class="control-group">
									<label class="control-label" for="greensAddress" style="display:inline;">菜品地址 : </label>
									<div class="input-group">
										<input type="text" name="greensAddress" class="form-control" id="greensAddress" style="display: inline;width: 200px" autocomplete="off"
											   required title="菜品地址不能为空" placeholder="请输入菜品地址" value="${eatGreens.greensAddress}">
									</div>
								</div>
								<div class="control-group">
									<label class="control-label" for="greensTypeId">菜系分类 : </label>
									<div class="controls">
										<select id="greensTypeId" name="greensTypeId">
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
									</div>
								</div>
								<div class="control-group">
									<label class="control-label" for="greensSecurityId" style="display:inline;">商家ID : </label>
									<div class="input-group">
										<input type="text" name="greensSecurityId" class="form-control" id="greensSecurityId" style="display: inline;width: 200px" autocomplete="off"
											   required title="菜品地址不能为空" placeholder="请输入菜品地址" value="${eatGreens.greensSecurityId}">
									</div>
								</div>
								<%--LOGO上传功能开始--%>
								<div class="form-group">
									<div class="col-md-8">
										<div class="fileinput fileinput-new" data-provides="fileinput" id="uploadImageDiv" style="padding-left: 180px">
											<div class="fileinput-new thumbnail" style="width: 200px; height: 150px;">
												<img src="${companyInfo.image}" alt="" />
											</div>
											<div class="fileinput-preview fileinput-exists thumbnail" style="max-width: 200px; max-height: 150px;"></div>
											<div>
                        						<span class="btn default btn-file"> <span
														class="fileinput-new">选择图片</span> <span class="fileinput-exists">更改</span> <input type="file" name="fileName"/></span>
												<a href="#" class="btn default fileinput-exists" data-dismiss="fileinput">移除</a>
												<span>请上传店铺LOGO选择1M以内图片</span>
											</div>
										</div>
										<div id="titleImageError" style="color: #a94442"></div>
									</div>
								</div>
								<%--LOGO上传功能结束--%>
								<div class="form-group">
									<label class="control-label" for="greensDetails">菜品描述 </label>
									<div class="controls" >
										<textarea class="cleditor" name="greensDetails" id="greensDetails" rows="3"></textarea>
									</div>
								</div>

								<div class="form-actions">
									<button id="submit" type="submit" class="btn btn-primary">增加菜品信息</button>
								</div>
							</fieldset>
						</form>
					</div>
				</div><!--/span-->
			</div><!--/row-->
		</div><!--/.fluid-container-->
	</div>
</div>

<!-- NEWSLETTER -->
<div id="newsletter" class="section">
	<!-- container -->
	<div class="container">
		<!-- row -->
		<div class="row">
			<div class="col-md-12">
				<div class="newsletter">
					<p>Sign Up for the <strong>NEWSLETTER</strong></p>
					<form>
						<input class="input" type="email" placeholder="Enter Your Email">
						<button class="newsletter-btn"><i class="fa fa-envelope"></i> Subscribe</button>
					</form>
					<ul class="newsletter-follow">
						<li>
							<a href="#"><i class="fa fa-facebook"></i></a>
						</li>
						<li>
							<a href="#"><i class="fa fa-twitter"></i></a>
						</li>
						<li>
							<a href="#"><i class="fa fa-instagram"></i></a>
						</li>
						<li>
							<a href="#"><i class="fa fa-pinterest"></i></a>
						</li>
					</ul>
				</div>
			</div>
		</div>
		<!-- /row -->
	</div>
	<!-- /container -->
</div>
<!-- /NEWSLETTER -->

<!-- FOOTER -->
<footer id="footer">
	<!-- top footer -->
	<div class="section">
		<!-- container -->
		<div class="container">
			<!-- row -->
			<div class="row">
				<div class="col-md-3 col-xs-6">
					<div class="footer">
						<h3 class="footer-title">About Us</h3>
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut.</p>
						<ul class="footer-links">
							<li><a href="#"><i class="fa fa-map-marker"></i>1734 Stonecoal Road</a></li>
							<li><a href="#"><i class="fa fa-phone"></i>+021-95-51-84</a></li>
							<li><a href="#"><i class="fa fa-envelope-o"></i>email@email.com</a></li>
						</ul>
					</div>
				</div>

				<div class="col-md-3 col-xs-6">
					<div class="footer">
						<h3 class="footer-title">Categories</h3>
						<ul class="footer-links">
							<li><a href="#">Hot deals</a></li>
							<li><a href="#">Laptops</a></li>
							<li><a href="#">Smartphones</a></li>
							<li><a href="#">Cameras</a></li>
							<li><a href="#">Accessories</a></li>
						</ul>
					</div>
				</div>

				<div class="clearfix visible-xs"></div>

				<div class="col-md-3 col-xs-6">
					<div class="footer">
						<h3 class="footer-title">Information</h3>
						<ul class="footer-links">
							<li><a href="#">About Us</a></li>
							<li><a href="#">Contact Us</a></li>
							<li><a href="#">Privacy Policy</a></li>
							<li><a href="#">Orders and Returns</a></li>
							<li><a href="#">Terms & Conditions</a></li>
						</ul>
					</div>
				</div>

				<div class="col-md-3 col-xs-6">
					<div class="footer">
						<h3 class="footer-title">Service</h3>
						<ul class="footer-links">
							<li><a href="#">My Account</a></li>
							<li><a href="#">View Cart</a></li>
							<li><a href="#">Wishlist</a></li>
							<li><a href="#">Track My Order</a></li>
							<li><a href="#">Help</a></li>
						</ul>
					</div>
				</div>
			</div>
			<!-- /row -->
		</div>
		<!-- /container -->
	</div>
	<!-- /top footer -->

	<!-- bottom footer -->
	<div id="bottom-footer" class="section">
		<div class="container">
			<!-- row -->
			<div class="row">
				<div class="col-md-12 text-center">
					<ul class="footer-payments">
						<li><a href="#"><i class="fa fa-cc-visa"></i></a></li>
						<li><a href="#"><i class="fa fa-credit-card"></i></a></li>
						<li><a href="#"><i class="fa fa-cc-paypal"></i></a></li>
						<li><a href="#"><i class="fa fa-cc-mastercard"></i></a></li>
						<li><a href="#"><i class="fa fa-cc-discover"></i></a></li>
						<li><a href="#"><i class="fa fa-cc-amex"></i></a></li>
					</ul>
					<span class="copyright">
								<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
								Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class="fa fa-heart-o" aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank">Colorlib</a>
						<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
							</span>
				</div>
			</div>
			<!-- /row -->
		</div>
		<!-- /container -->
	</div>
	<!-- /bottom footer -->
</footer>
<!-- /FOOTER -->

<!-- jQuery Plugins -->
<script src="${pageContext.request.contextPath}/statics/plugin/Electro/js/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/statics/plugin/Electro/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/statics/plugin/Electro/js/slick.min.js"></script>
<script src="${pageContext.request.contextPath}/statics/plugin/Electro/js/nouislider.min.js"></script>
<script src="${pageContext.request.contextPath}/statics/plugin/Electro/js/jquery.zoom.min.js"></script>
<script src="${pageContext.request.contextPath}/statics/plugin/Electro/js/main.js"></script>
<script src="${pageContext.request.contextPath}/statics/plugin/BootStrap/js/bootstrap-fileinput.js"></script>
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

<script>
	function horsemandelete() {
		var msg = "您真的确定要删除吗？\n\n请确认！";
		if (confirm(msg)==true) {
			return true;
		} else {
			return false;
		}
	}
</script>

</body>
</html>

