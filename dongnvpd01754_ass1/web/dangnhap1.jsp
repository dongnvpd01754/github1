<%-- 
    Document   : dangnhap1
    Created on : Oct 20, 2016, 4:19:20 PM
    Author     : dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <!-- InstanceBeginEditable name="doctitle" -->
        <title>Untitled Document</title>
        <style type="text/css">
            #apDiv4 {
                position: absolute;
                left: 51px;
                top: 281px;
                width: 470px;
                height: 240px;
                z-index: 3;
            }
        </style>
        <link href="SpryAssets/SpryValidationPassword.css" rel="stylesheet" type="text/css" />
        <style type="text/css">
            #apDiv5 {
                position: absolute;
                left: 661px;
                top: 298px;
                width: 583px;
                height: 329px;
                z-index: 4;
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
        <script src="SpryAssets/SpryValidationPassword.js" type="text/javascript"></script>
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
            <div id="apDiv5"><a href="https://www.google.com/maps/place/84+Nguy%E1%BB%85n+V%C4%83n+Tr%E1%BB%97i,+ph%C6%B0%E1%BB%9Dng+8,+Ph%C3%BA+Nhu%E1%BA%ADn,+H%E1%BB%93+Ch%C3%AD+Minh,+Vi%E1%BB%87t+Nam/@10.7882522,106.6698126,14z/data=!4m5!3m4!1s0x317529298e97391f:0x6e598acd718b35e3!8m2!3d10.796459!4d106.674397"><img src="image/bản đồ.jpg" width="578" height="320" /></a></div>
            <div id="apDiv4">
                <form id="form1" name="form1" method="get" action="LoginServlet">
                    <table width="471" height="220" border="0">
                        <caption>
                            ĐĂNG NHẬP
                        </caption>
                        <tr>
                            <th height="69" scope="col">TÀI KHOẢN </th>
                            <th scope="col">
                                <input type="text" name="t1" id="textfield" />
                            </th>
                        </tr>
                        <tr>
                            <th height="60" scope="col">MẬT KHẨU</th>
                            <th scope="col">
                                <span id="sprypassword1">
                                    <input type="password" name="t2" id="password1" />
                                    <span class="passwordRequiredMsg"></span></span>
                            </th>
                        </tr>
                        <tr>
                            <th height="81" colspan="2" scope="col">

                                <input type="submit" name="button" id="button" value="ĐĂNG NHẬP" /> </th>
                        </tr>
                    </table></form>
            </div>
            <div class="content"></div>
            <script type="text/javascript">
                var sprypassword1 = new Spry.Widget.ValidationPassword("sprypassword1");
            </script>
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
