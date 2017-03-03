package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class muahang_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <!-- InstanceBeginEditable name=\"doctitle\" -->\n");
      out.write("        <title>Untitled Document</title>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            #apDiv4 {\n");
      out.write("                position: absolute;\n");
      out.write("                left: 28px;\n");
      out.write("                top: 247px;\n");
      out.write("                width: 755px;\n");
      out.write("                height: 488px;\n");
      out.write("                z-index: 3;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            #apDiv5 {\n");
      out.write("                position: absolute;\n");
      out.write("                left: 50px;\n");
      out.write("                top: 391px;\n");
      out.write("                width: 279px;\n");
      out.write("                height: 261px;\n");
      out.write("                z-index: 4;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            #apDiv6 {\n");
      out.write("                position: absolute;\n");
      out.write("                left: 114px;\n");
      out.write("                top: 309px;\n");
      out.write("                width: 195px;\n");
      out.write("                height: 44px;\n");
      out.write("                z-index: 5;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            #apDiv7 {\n");
      out.write("                position: absolute;\n");
      out.write("                left: 408px;\n");
      out.write("                top: 282px;\n");
      out.write("                width: 341px;\n");
      out.write("                height: 436px;\n");
      out.write("                z-index: 6;\n");
      out.write("                font-size: 14px;\n");
      out.write("            }\n");
      out.write("            .main #apDiv7 p {\n");
      out.write("                font-size: 18px;\n");
      out.write("            }\n");
      out.write("            .main #apDiv7 p {\n");
      out.write("                font-size: 24px;\n");
      out.write("            }\n");
      out.write("            .main #apDiv7 p {\n");
      out.write("                font-size: 18px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            #apDiv8 {\n");
      out.write("                position: absolute;\n");
      out.write("                left: 886px;\n");
      out.write("                top: 277px;\n");
      out.write("                width: 350px;\n");
      out.write("                height: 437px;\n");
      out.write("                z-index: 7;\n");
      out.write("            }\n");
      out.write("            .main #apDiv8 table {\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <!-- InstanceEndEditable -->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\"/>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            #apDiv1 {\n");
      out.write("                position: absolute;\n");
      out.write("                left: 566px;\n");
      out.write("                top: 29px;\n");
      out.write("                width: 181px;\n");
      out.write("                height: 115px;\n");
      out.write("                z-index: 1;\n");
      out.write("            }\n");
      out.write("            #apDiv2 {\n");
      out.write("                position: absolute;\n");
      out.write("                left: 165px;\n");
      out.write("                top: 167px;\n");
      out.write("                margin-left: 260px;\n");
      out.write("                height: 39px;\n");
      out.write("                z-index: 2;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <link href=\"SpryAssets/SpryMenuBarHorizontal.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            #apDiv3 {\n");
      out.write("                position: absolute;\n");
      out.write("                width: 284px;\n");
      out.write("                height: 134px;\n");
      out.write("                z-index: 3;\n");
      out.write("                left: 1036px;\n");
      out.write("                top: 30px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <script src=\"SpryAssets/SpryMenuBar.js\" type=\"text/javascript\"></script>\n");
      out.write("        <!-- InstanceBeginEditable name=\"head\" -->\n");
      out.write("        <!-- InstanceEndEditable -->\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"apDiv1\"><img src=\"image/logo.jpg\" width=\"179\" height=\"141\" /></div>\n");
      out.write("        <div id=\"apDiv2\">\n");
      out.write("            <ul id=\"MenuBar1\" class=\"MenuBarHorizontal\">\n");
      out.write("                <li><a href=\"trangchu.jsp\">TRANG CHỦ</a>    </li>\n");
      out.write("                <li><a href=\"muahang.jsp\">GIÁ SẢN PHẨM</a>    </li>\n");
      out.write("                <li><a href=\"sanpham.jsp\">SẢN PHẨM</a>    </li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"main\">\n");
      out.write("\n");
      out.write("            <div class=\"header\"></div>\n");
      out.write("            <!-- InstanceBeginEditable name=\"content\" -->\n");
      out.write("            <div id=\"apDiv8\">\n");
      out.write("                <form id=\"form2\" name=\"form2\" method=\"get\" action=\"Donhang\">\n");
      out.write("                    <table width=\"350\" height=\"435\" border=\"1\">\n");
      out.write("                        <tr>\n");
      out.write("                            <th colspan=\"2\" scope=\"col\">ĐƠN HÀNG</th>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>MÃ ĐƠN HÀNG</td>\n");
      out.write("                            <td>\n");
      out.write("                                <input type=\"text\" name=\"madonhang\" id=\"textfield\" />\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>MÃ KHÁCH HÀNG</td>\n");
      out.write("                            <td><input type=\"text\" name=\"makhachhang\" id=\"textfield2\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>NGÀY ĐẶT </td>\n");
      out.write("                            <td><input type=\"text\" name=\"ngaydat\" id=\"textfield4\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>TRẠNG THÁI</td>\n");
      out.write("                            <td><input type=\"text\" name=\"trangthai\" id=\"textfield5\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td colspan=\"2\">\n");
      out.write("                                <input type=\"submit\" name=\"button\" id=\"button\" value=\"ĐẶT HÀNG\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"apDiv7\">\n");
      out.write("                <p>Ngày cưới ngoài việc trang điểm, chụp hình cưới thì trang phục cũng là vấn đề quan trọng mà các cô dâu cần quan tâm. Cô dâu có thể chọn áo dài cưới đỏ rực rỡ, áo dài cưới vàng ánh kim sang trọng hay áo dài cưới màu tím lãng mạn.. 1. Áo dài cưới đỏ cách tân Với mẫu áo dài cưới cổ thuyền sẽ giúp cô dâu khoe chiếc cổ thon trắng ngần. Các họa tiết ren bông, pha lê, đá màu…</p>\n");
      out.write("                <p>Ngày nay áo dài  cho mẹ cô dâu không còn bó gọn trong những thiết kế như gấm già, cứng mà sẽ đa dạng hơn với kiểu thiết kế cũng như màu sắc và cách trang trí. Hầu hết các bậc cha mẹ đều chọn áo dài trong ngày ăn hỏi, ngày cưới của con cái. Áo dài cho mẹ uyên ương đa dạng và không kém phần sang trọng.</p>\n");
      out.write("                <p>GIÁ SẢN PHẨM : 5.000.000 VNĐ</p>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"apDiv6\">ÁO DÀI CƯỚI TRUYỀN THỐNG</div>\n");
      out.write("            <div id=\"apDiv5\"><img src=\"image/ao dai nam 1.jpg\" width=\"321\" height=\"260\" /></div>\n");
      out.write("            <div class=\"content\"></div>\n");
      out.write("            <!-- InstanceEndEditable -->\n");
      out.write("            <div class=\"foodrt\">\n");
      out.write("                <div></div>\n");
      out.write("                <div>© 2014 ABC AoZai | Address: 74 Ngô Thị Nhậm Street - Đà Nẵng Street, District 3,ĐN - <br />\n");
      out.write("                    - Tel: 01689132259 - 0978103228 Fax:0123456789<br />\n");
      out.write("                    - Email: dongnvpd01754@fpt.edu.vn<br />\n");
      out.write("                    - Website: www.dongnvpd01754.com</div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            var MenuBar1 = new Spry.Widget.MenuBar(\"MenuBar1\", {imgDown: \"SpryAssets/SpryMenuBarDownHover.gif\", imgRight: \"SpryAssets/SpryMenuBarRightHover.gif\"});\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
