<%-- 
    Document   : trangchu
    Created on : Oct 21, 2016, 7:53:24 AM
    Author     : dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <!-- InstanceBeginEditable name="doctitle" -->
        <title>HOME</title>
        <link href="themes/1/js-image-slider.css" rel="stylesheet" type="text/css" />
        <script src="themes/1/js-image-slider.js" type="text/javascript"></script>
        <link href="generic.css" rel="stylesheet" type="text/css" />
        <style type="text/css">
            #apDiv4 {
                position: absolute;
                left: 20px;
                top: 35px;
                width: 103px;
                height: 25px;
                z-index: 3;
                color: #FFF;
            }
        </style>
        <!-- InstanceEndEditable -->
        <link rel="stylesheet" type="text/css" href="css/style.css"/>
        <style type="text/css">
            #apDiv1 {
                position: absolute;
                left: 566px;
                top: 29px;
                width: 181px;
                height: 115px;
                z-index: 1;
            }
            #apDiv2 {
                position: absolute;
                left: 165px;
                top: 167px;
                margin-left: 260px;
                height: 39px;
                z-index: 2;
            }
        </style>
        <link href="SpryAssets/SpryMenuBarHorizontal.css" rel="stylesheet" type="text/css" />
        <style type="text/css">
            #apDiv3 {
                position: absolute;
                width: 284px;
                height: 134px;
                z-index: 3;
                left: 1036px;
                top: 30px;
            }
        </style>
        <script src="SpryAssets/SpryMenuBar.js" type="text/javascript"></script>
        <!-- InstanceBeginEditable name="head" -->
        <!-- InstanceEndEditable -->
    </head>
    <body>
        <div id="apDiv1"><img src="image/logo.jpg" width="179" height="141" /></div>
        <div id="apDiv2">
            <ul id="MenuBar1" class="MenuBarHorizontal">
                <li><a href="trangchu.jsp">TRANG CHỦ</a>    </li>
                <li><a href="muahang.jsp">GIÁ SẢN PHẨM</a>    </li>
                <li><a href="sanpham.jsp">SẢN PHẨM</a>    </li>
            </ul>
        </div>
        <div class="main">

            <div class="header"></div>
            <!-- InstanceBeginEditable name="content" -->
            <div id="apDiv4"><a href="dangnhap1.jsp">ĐĂNG NHẬP</a></div>
            <div class="content"> <div id="slider">
                    <a>
                        <img src="image/trang chủ 1.jpg" alt=" ÁO DÀI CƯỚI" width="1320" height="530" />
                    </a>
                    <img src="image/trang chu 2.jpg" width="1320" height="530" alt="  ÁO DÀI TRUYỀN THỐNG" />
                    <img src="image/trang chủ 3.jpg" width="1320" height="530" alt=" ÁO DÀI DẠ TIỆC" />
                    <img src="image/trang chủ 4.jpg" width="1320" height="530" alt="  ÁO DÀI CƯỚI" />
                </div></div>
            <!-- InstanceEndEditable -->
            <div class="foodrt">
                <div></div>
                <div>© 2014 ABC AoZai | Address: 74 Ngô Thị Nhậm Street - Đà Nẵng Street, District 3,ĐN - <br />
                    - Tel: 01689132259 - 0978103228 Fax:0123456789<br />
                    - Email: dongnvpd01754@fpt.edu.vn<br />
                    - Website: www.dongnvpd01754.com</div>
            </div>
        </div>
        <script type="text/javascript">
            var MenuBar1 = new Spry.Widget.MenuBar("MenuBar1", {imgDown: "SpryAssets/SpryMenuBarDownHover.gif", imgRight: "SpryAssets/SpryMenuBarRightHover.gif"});
        </script>
    </body>
</html>
