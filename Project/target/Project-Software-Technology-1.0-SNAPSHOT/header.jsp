<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 31/05/2021
  Time: 12:36 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="description" content="Ogani Template">
    <meta name="keywords" content="Ogani, unica, creative, html">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Triple H | Food </title>

    <!-- Google Font -->
    <link href="https://fonts.googleapis.com/css2?family=Cairo:wght@200;300;400;600;900&display=swap" rel="stylesheet">
    <link href='https://fonts.googleapis.com/css?family=Poppins' rel='stylesheet'>
    <!-- Css Styles -->
    <link rel="stylesheet" href="./css/bootstrap.min.css" type="text/css">
    <link rel="stylesheet" href="./css/font-awesome.min.css" type="text/css">
    <link rel="stylesheet" href="./css/elegant-icons.css" type="text/css">
    <link rel="stylesheet" href="./css/nice-select.css" type="text/css">
    <link rel="stylesheet" href="./css/jquery-ui.min.css" type="text/css">
    <link rel="stylesheet" href="./css/owl.carousel.min.css" type="text/css">
    <link rel="stylesheet" href="./css/slicknav.min.css" type="text/css">
    <link rel="stylesheet" href="./css/style.css" type="text/css">
</head>
<body>

<!-- Header Section Begin -->
<header class="header">
    <div class="header__top">
        <div class="container">
            <div class="row">
                <div class="col-lg-6 col-md-6" style="flex: 0 0 30%">
                    <div class="header__top__left">
                        <ul>
                            <li><i class="fa fa-envelope"></i> groupCNPM@gmail.com</li>
                            <!-- <li>Free Shipping for all Order of $99</li> -->
                        </ul>
                    </div>
                </div>
                <div class="col-lg-6 col-md-6" style="flex-shrink: 0;flex-grow: 0;flex-basis: 70%;max-width:70%">
                    <div class="header__top__right">
                        <div class="header__top__right__social">
                            <a href="https://www.facebook.com/Group12-100996871826770"><i
                                    class="fa fa-facebook"></i></a>
                            <a href="#"><i class="fa fa-twitter"></i></a>
                            <a href="#"><i class="fa fa-instagram"></i></a>
                            <a href="#"><i class="fa fa-pinterest-p"></i></a>
                        </div>
                        <!-- <div class="header__top__right__language">
                            <img src="img/language.png" alt="">
                            <div>English</div>
                            <span class="arrow_carrot-down"></span>
                            <ul>
                                <li><a href="#">Spanis</a></li>
                                <li><a href="#">English</a></li>
                            </ul>
                        </div> -->
                        <c:if test="${sessionScope.acc.access == 0}">
                            <div class="header__top__right__social">
                                <a href="history.jsp"><i class="fa fa-history"></i> Lịch Sử Đặt Hàng</a>
                            </div>

                            <div class="header__top__right__social">
                                <a href="checkout.jsp"><i class="fa fa-check"></i> Thanh Toán</a>
                            </div>
                        </c:if>
                        <c:if test="${sessionScope.acc.access == 1}">
                            <div class="header__top__right__social">
                                <a href="ManagerUser"><i class="fa fa-grin"></i> Quản Lý Hệ Thống</a>
                            </div>
                        </c:if>
                        <c:if test="${sessionScope.acc == null}">
                            <div class="header__top__right__auth">
                                <a href="login.jsp"><i class="fa fa-lock"></i> Đăng Nhập</a>
                            </div>
                        </c:if>
                        <c:if test="${sessionScope.acc != null}">
                            <div class="header__top__right__social">
                                <a href="MyUser?uid=${sessionScope.acc.idUser}"><i class="fa fa-user"></i> ${sessionScope.acc.userName}</a>
                            </div>
                            <div class="header__top__right__social">
                                <a href="LogoutControl"><i class="fa fa-check"></i> Đăng Xuất</a>
                            </div>
                        </c:if>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="container">
        <div class="row">
            <div class="col-lg-3">
                <div class="header__logo">
                    <a href="Home"><img src="./img/logo.png" alt=""></a>
                </div>
            </div>
            <div class="col-lg-9">
                <nav class="header__menu">
                    <ul>
                        <li ><a href="#">Trang Chủ</a></li>
                        <li><a href="#">Độc Giả</a>
                        </li>
                        <li>
                            <a href="#">Admin</a>
                        </li>
                        <li><a href="ManagerBook">Sách</a></li>
                        <li><a href="#">Phiếu Mượn</a></li>
                        <li><a href="#">Contact</a></li>

                    </ul>
                </nav>
            </div>
            <%--            <div class="col-lg-3">--%>
            <%--                <div class="header__cart">--%>
            <%--                    <ul>--%>
            <%--                        <li><a href="whishlist.jsp"><i class="fa fa-heart"></i> <span>1</span></a></li>--%>
            <%--                        <li><a href="cart.jsp"><i class="fa fa-shopping-bag"></i> <span>3</span></a></li>--%>
            <%--                    </ul>--%>
            <%--                    <!-- <div class="header__cart__price">item: <span>$150.00</span></div> -->--%>
            <%--                </div>--%>
            <%--            </div>--%>
        </div>
        <div class="humberger__open">
            <i class="fa fa-bars"></i>
        </div>
    </div>
</header>
<!-- Header Section End -->

<script src="./js/jquery-3.3.1.min.js"></script>
<script src="./js/bootstrap.min.js"></script>
<script src="./js/jquery.nice-select.min.js"></script>
<script src="./js/jquery-ui.min.js"></script>
<script src="./js/jquery.slicknav.js"></script>
<script src="./js/mixitup.min.js"></script>
<script src="./js/owl.carousel.min.js"></script>
<script src="./js/main.js"></script>

</body>
</html>
