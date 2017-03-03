<%-- 
    Document   : dangki
    Created on : Oct 5, 2016, 11:44:47 PM
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
                left: 59px;
                top: 249px;
                width: 374px;
                height: 453px;
                z-index: 3;
            }
            .main #apDiv4 table tr td {
                text-align: center;
            }
        </style>
        <style type="text/css">
            #apDiv5 {
                position: absolute;
                left: 629px;
                top: 349px;
                width: 594px;
                height: 287px;
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
            <div id="apDiv5"><a href="https://www.google.com/maps/place/84+Nguy%E1%BB%85n+V%C4%83n+Tr%E1%BB%97i,+ph%C6%B0%E1%BB%9Dng+8,+Ph%C3%BA+Nhu%E1%BA%ADn,+H%E1%BB%93+Ch%C3%AD+Minh,+Vi%E1%BB%87t+Nam/@10.7882522,106.6698126,14z/data=!4m5!3m4!1s0x317529298e97391f:0x6e598acd718b35e3!8m2!3d10.796459!4d106.674397"><img src="image/bản đồ.jpg" width="592" height="286" /></a></div>
            <div id="apDiv4">
                <form id="form2" name="form2" method="get" action="danhky">
                    <table width="378" height="449" border="0">
                        <caption>
                            ĐĂNG KÝ
                        </caption>
                        <tr>
                            <th width="176" scope="col">TÊN ĐĂNG NHẬP</th>
                            <th width="187" scope="col">
                                <input type="text" name="tendangnhap" id="textfield" />
                            </th>
                        </tr>
                        <tr>
                            <td>MẬT KHẨU</td>
                            <td><input type="password" name="matkhau" id="textfield2" /></td>
                        </tr>
                        <tr>
                            <td>VAI TRÒ</td>
                            <td><input type="text" name="vaitro" id="textfield3" /></td>
                        </tr>
                        <tr>
                            <td>HỌ VÀ TÊN</td>
                            <td><input type="text" name="hoten" id="textfield4" /></td>
                        </tr>
                        <tr>
                            <td>ĐỊA CHỈ</td>
                            <td><input type="text" name="diachi" id="textfield5"/></td>
                        </tr>
                        <tr>
                            <td>SỐ ĐIỆN THOẠI</td>
                            <td><input type="text" name="sdt" id="textfield6" /></td>
                        </tr>
                        <tr>
                            <td>EMAIL</td>
                            <td><input type="text" name="email" id="textfield7" /></td>
                        </tr>
                        <tr>
                            <td colspan="2">
                                <input type="submit" name="button" id="button" value="ĐĂNG KÝ" />
                            </td>
                        </tr>

                    </table>
                </form>
            </div>
            <div class="content"></div>
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
