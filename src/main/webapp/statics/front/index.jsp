<%--
  Created by IntelliJ IDEA.
  User: 谢军军
  Date: 2020/2/22
  Time: 16:20
  用于用户登录成功之后跳转至前台主页面
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->

    <title>前台主页面</title>

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
                <li><a href="${pageContext.request.contextPath}/order/findUnOrder"><i class="fa fa-map-marker"></i> 骑手入口</a></li>
                <li><a href="${pageContext.request.contextPath}/greens/selectAll?greensName="><i class="fa fa-map-marker"></i> 商家入口</a></li>
            </ul>
            <ul class="header-links pull-right">
                <li><a href="#"><i class="fa fa-dollar"></i> USD</a></li>
                <li id="user">
                    <i class="fa fa-user-o"></i>
                    <a href="${pageContext.request.contextPath}/statics/front/login.jsp" class="btn btn-primary">登录</a>
                    <a href="#" class="btn btn-success">注册</a>
                 </li>
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
                <div class="col-lg-3">
                    <div class="header-logo col-lg-6">
                        <a href="#" class="logo">
                            <img src="${pageContext.request.contextPath}/statics/plugin/Electro/img/logo.png" alt="">
                        </a>
                    </div>
                </div>
                <!-- /LOGO -->

                <!-- SEARCH BAR -->
                <div class="col-md-6">
                    <div class="header-search">
                        <form method="get" action="${pageContext.request.contextPath}/user/selectByAddressORGreensName">
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
                                </div>
                                <div class="cart-summary">
                                    <small>3 Item(s) selected</small>
                                    <h5>SUBTOTAL: $<span>2940.00</span></h5>
                                </div>
                                <div class="cart-btns">
                                    <a href="#">View Cart</a>
                                    <a href="${pageContext.request.contextPath}/statics/pay/jsp/goPay.jsp">pay<i class="fa fa-arrow-circle-right"></i></a>
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
<nav id="navigation">
    <!-- container -->
    <div class="container">
        <!-- responsive-nav -->
        <div id="responsive-nav">
            <!-- NAV -->
            <ul class="main-nav nav navbar-nav">
                <li class="active"><a href="#">Home</a></li>
                <li><a href="#">Hot Deals</a></li>
                <li><a href="#">Categories</a></li>
                <li><a href="#">Laptops</a></li>
                <li><a href="#">Smartphones</a></li>
                <li><a href="#">Cameras</a></li>
                <li><a href="#">Accessories</a></li>
            </ul>
            <!-- /NAV -->
        </div>
        <!-- /responsive-nav -->
    </div>
    <!-- /container -->
</nav>
<!-- /NAVIGATION -->
<!-- Section -->
<div class="section">
    <!-- container -->
    <div class="container">
        <!-- row -->
        <div class="row">

            <div class="col-md-12">
                <div class="section-title text-center">
                    <h3 class="title">相关商家信息</h3>
                </div>
            </div>
<!-- product -->
<%--<div class="col-md-3 col-xs-6">
    <div class="product">
        <div class="product-img">
            <img src="${pageContext.request.contextPath}/statics/plugin/Electro/img/product01.png" alt="">
            <div class="product-label">
                <span class="sale">-30%</span>
            </div>
        </div>
        <div class="product-body">
            <p class="product-category">Category</p>
            <h3 class="product-name"><a href="#">product name goes here</a></h3>
            <h4 class="product-price">$980.00 <del class="product-old-price">$990.00</del></h4>
            <div class="product-rating">
            </div>
            <div class="product-btns">
                <button class="add-to-wishlist"><i class="fa fa-heart-o"></i><span class="tooltipp">add to wishlist</span></button>
                <button class="add-to-compare"><i class="fa fa-exchange"></i><span class="tooltipp">add to compare</span></button>
                <button class="quick-view"><i class="fa fa-eye"></i><span class="tooltipp">quick view</span></button>
            </div>
        </div>
        <div class="add-to-cart">
            <button class="add-to-cart-btn"><i class="fa fa-shopping-cart"></i> add to cart</button>
        </div>
    </div>
</div>--%>
<!-- /product -->



<!-- product -->
<%--<div class="col-md-3 col-xs-6">
    <div class="product">
        <div class="product-img">
            <img src="${pageContext.request.contextPath}/statics/plugin/Electro/img/product02.png" alt="">
            <div class="product-label">
                <span class="new">NEW</span>
            </div>
        </div>
        <div class="product-body">
            <p class="product-category">Category</p>
            <h3 class="product-name"><a href="#">product name goes here</a></h3>
            <h4 class="product-price">$980.00 <del class="product-old-price">$990.00</del></h4>
            <div class="product-rating">
                <i class="fa fa-star"></i>
                <i class="fa fa-star"></i>
                <i class="fa fa-star"></i>
                <i class="fa fa-star"></i>
                <i class="fa fa-star"></i>
            </div>
            <div class="product-btns">
                <button class="add-to-wishlist"><i class="fa fa-heart-o"></i><span class="tooltipp">add to wishlist</span></button>
                <button class="add-to-compare"><i class="fa fa-exchange"></i><span class="tooltipp">add to compare</span></button>
                <button class="quick-view"><i class="fa fa-eye"></i><span class="tooltipp">quick view</span></button>
            </div>
        </div>
        <div class="add-to-cart">
            <button class="add-to-cart-btn"><i class="fa fa-shopping-cart"></i> add to cart</button>
        </div>
    </div>
</div>--%>
<!-- /product -->

<div class="clearfix visible-sm visible-xs"></div>


<%--商家信息--%>
<!-- product -->
<c:forEach items="${list}" var="merchant">
    <div class="col-md-3 col-xs-6">
    <div class="product">
    <div class="product-img">
    <img src="${pageContext.request.contextPath}/statics/plugin/Electro/img/product03.png" alt="">
    </div>
    <div class="product-body">
    <p class="product-category">${merchant.merchantName}</p>
    <h3 class="product-name"><a href="#">${merchant.merchantAddress}</a></h3>
    <h4 class="product-price">$${merchant.merchantprice} <del class="product-old-price">$990.00</del></h4>
    <div class="product-rating">
    <i class="fa fa-star"></i>
    <i class="fa fa-star"></i>
    <i class="fa fa-star"></i>
    <i class="fa fa-star"></i>
    <i class="fa fa-star-o"></i>
    </div>
    <div class="product-btns">
    <button class="add-to-wishlist"><i class="fa fa-heart-o"></i><span class="tooltipp">add to wishlist</span></button>
    <button class="add-to-compare"><i class="fa fa-exchange"></i><span class="tooltipp">add to compare</span></button>
    <button class="quick-view"><i class="fa fa-eye"></i><span class="tooltipp">quick view</span></button>
    </div>
    </div>
    <div class="add-to-cart">
    <button class="add-to-cart-btn"><i class="fa fa-shopping-cart"></i> add to cart</button>
    </div>
    </div>
    </div>
</c:forEach>
            <!-- product -->
            <%--<div class="col-md-3 col-xs-6">
                <div class="product">
                    <div class="product-img">
                        <img src="${pageContext.request.contextPath}/statics/plugin/Electro/img/product01.png" alt="">
                        <div class="product-label">
                            <span class="sale">-30%</span>
                        </div>
                    </div>
                    <div class="product-body">
                        <p class="product-category">Category</p>
                        <h3 class="product-name"><a href="#">product name goes here</a></h3>
                        <h4 class="product-price">$980.00 <del class="product-old-price">$990.00</del></h4>
                        <div class="product-rating">
                        </div>
                        <div class="product-btns">
                            <button class="add-to-wishlist"><i class="fa fa-heart-o"></i><span class="tooltipp">add to wishlist</span></button>
                            <button class="add-to-compare"><i class="fa fa-exchange"></i><span class="tooltipp">add to compare</span></button>
                            <button class="quick-view"><i class="fa fa-eye"></i><span class="tooltipp">quick view</span></button>
                        </div>
                    </div>
                    <div class="add-to-cart">
                        <button class="add-to-cart-btn"><i class="fa fa-shopping-cart"></i> add to cart</button>
                    </div>
                </div>
            </div>--%>
            <!-- /product -->



            <!-- product -->
            <%--<div class="col-md-3 col-xs-6">
                <div class="product">
                    <div class="product-img">
                        <img src="${pageContext.request.contextPath}/statics/plugin/Electro/img/product02.png" alt="">
                        <div class="product-label">
                            <span class="new">NEW</span>
                        </div>
                    </div>
                    <div class="product-body">
                        <p class="product-category">Category</p>
                        <h3 class="product-name"><a href="#">product name goes here</a></h3>
                        <h4 class="product-price">$980.00 <del class="product-old-price">$990.00</del></h4>
                        <div class="product-rating">
                            <i class="fa fa-star"></i>
                            <i class="fa fa-star"></i>
                            <i class="fa fa-star"></i>
                            <i class="fa fa-star"></i>
                            <i class="fa fa-star"></i>
                        </div>
                        <div class="product-btns">
                            <button class="add-to-wishlist"><i class="fa fa-heart-o"></i><span class="tooltipp">add to wishlist</span></button>
                            <button class="add-to-compare"><i class="fa fa-exchange"></i><span class="tooltipp">add to compare</span></button>
                            <button class="quick-view"><i class="fa fa-eye"></i><span class="tooltipp">quick view</span></button>
                        </div>
                    </div>
                    <div class="add-to-cart">
                        <button class="add-to-cart-btn"><i class="fa fa-shopping-cart"></i> add to cart</button>
                    </div>
                </div>
            </div>--%>
            <!-- /product -->
            <!-- /product -->

            <!-- product -->
            <%--<div class="col-md-3 col-xs-6">
                <div class="product">
                    <div class="product-img">
                        <img src="${pageContext.request.contextPath}/statics/plugin/Electro/img/product04.png" alt="">
                    </div>
                    <div class="product-body">
                        <p class="product-category">Category</p>
                        <h3 class="product-name"><a href="#">product name goes here</a></h3>
                        <h4 class="product-price">$980.00 <del class="product-old-price">$990.00</del></h4>
                        <div class="product-rating">
                        </div>
                        <div class="product-btns">
                            <button class="add-to-wishlist"><i class="fa fa-heart-o"></i><span class="tooltipp">add to wishlist</span></button>
                            <button class="add-to-compare"><i class="fa fa-exchange"></i><span class="tooltipp">add to compare</span></button>
                            <button class="quick-view"><i class="fa fa-eye"></i><span class="tooltipp">quick view</span></button>
                        </div>
                    </div>
                    <div class="add-to-cart">
                        <button class="add-to-cart-btn"><i class="fa fa-shopping-cart"></i> add to cart</button>
                    </div>
                </div>
            </div>--%>
            <!-- /product -->

        </div>
        <!-- /row -->
    </div>
    <!-- /container -->
</div>
<!-- /Section -->
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
<script type="text/javascript">
    //判断用户是否已登录成功
    if(${sessionScope.eatUser!=null}){
        //如果登录成功，则移除登录、注册字样并显示用户名
        $("#user").find("a").remove();
        $("#user").append("<span style='color:white' >欢迎您！${sessionScope.eatUser.userName}</span>");
    }
    //给商品添加至购物车增加点击事件完成购物车增加商品
    var $addCartBtn=$(".add-to-cart-btn");
    $addCartBtn.click(function () {

    });
</script>
</body>
</html>
