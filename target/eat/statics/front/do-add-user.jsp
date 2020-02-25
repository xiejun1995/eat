<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		 <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->

		<title>用户注册</title>
		<style>
			#zhuce{
				margin-top: 10px;
				margin-left: 50px;
				width: 500px;
			}
			#zhuce input{
				margin: 0 auto;
				width: 200px;
				height: 50px;
			}
		</style>
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

		<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
		<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
		<!--[if lt IE 9]>
		  <script src="${pageContext.request.contextPath}/https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
		  <script src="${pageContext.request.contextPath}/https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
		<![endif]-->

    </head>
	<body>
		<!-- HEADER -->
		<header>
			<!-- TOP HEADER -->
			<div id="top-header">
				<div class="container">

					<ul class="header-links pull-right">
						<li><a href="#"><i class="fa fa-user-o"></i>我的账户</a></li>
					</ul>
				</div>
			</div>
			<!-- /TOP HEADER -->
		</header>
		<!-- /HEADER -->

		<!-- BREADCRUMB -->
		<div id="breadcrumb" class="section">
			<!-- container -->
			<div class="container">
				<!-- row -->
				<div class="row">
					<div class="col-md-12">
						<h3 class="breadcrumb-header">用户注册</h3>
					</div>
				</div>
				<!-- /row -->
			</div>
			<!-- /container -->
		</div>
		<!-- /BREADCRUMB -->

		<!-- SECTION -->
		<div class="section">
			<!-- container -->
			<div class="container">
				<!-- row -->
				<div class="row">
					<form method="get" action="/user/addUser">
					<div class="col-md-7">
						<!-- Billing Details -->
						<div class="billing-details">
							<div class="section-title">
								<h3 class="title"></h3>
							</div>
							<div class="form-group">
								姓名：<input class="input" type="text" name="userName" placeholder="请输入姓名！"/>
							</div>
							<div class="form-group">
								密码：<input class="input" type="text" name="userPassword" placeholder="请输入密码！"/>
							</div>
							<div class="form-group">
								出生日期：<input class="input" type="date" name="userBornDate" placeholder="请输入出生日期！"/>
							</div>
							<div class="form-group">
								电话号码：<input class="input" type="text" name="userPhone" placeholder="请输入电话号码！"/>
							</div>
							<div class="form-group">
								地址：<input class="input" type="text" name="userAddress" placeholder="请输入地址！"/>
							</div>
							<div class="form-group">
								邮箱：<input class="input" type="email" name="userEmail" placeholder="请输入邮箱！"/>
							</div>
							<div class="form-group">
								性别：
								<input name="userGender" type="radio" value="男" checked/>男
								      <input name="userGender" type="radio" value="女" />女<br/>
							</div>
							<div class="form-group">
								<select name="userRole" style="width: 650px;height: 30px;border: #E4E7ED solid 1px">
									<option value="1">管理员</option>
									<option value="2">商家</option>
									<option value="3">骑手</option>
									<option value="4">普通用户</option>
								</select><br/><br/>
							</div>


						</div>
						<!-- /Billing Details -->
						<!-- Order Details -->
						<div class="col-md-5 order-details" id="zhuce">
							<input class="primary-btn order-submit" type="submit"  value="注册" />
						</div>
						<!-- /Order Details -->
					</div>
					</form>

				</div>
				<!-- /row -->
			</div>
			<!-- /container -->
		</div>
		<!-- /SECTION -->



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
		<script src="../plugin/Electro/js/jquery.min.js"></script>
		<script src="../plugin/Electro/js/bootstrap.min.js"></script>
		<script src="../plugin/Electro/js/slick.min.js"></script>
		<script src="../plugin/Electro/js/nouislider.min.js"></script>
		<script src="../plugin/Electro/js/jquery.zoom.min.js"></script>
		<script src="../plugin/Electro/js/main.js"></script>

	</body>
</html>
