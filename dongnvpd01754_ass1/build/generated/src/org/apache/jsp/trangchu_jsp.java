package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class trangchu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>HOME</title>\n");
      out.write("        <link href=\"themes/1/js-image-slider.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <script src=\"themes/1/js-image-slider.js\" type=\"text/javascript\"></script>\n");
      out.write("        <link href=\"generic.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            #apDiv4 {\n");
      out.write("                position: absolute;\n");
      out.write("                left: 20px;\n");
      out.write("                top: 35px;\n");
      out.write("                width: 103px;\n");
      out.write("                height: 25px;\n");
      out.write("                z-index: 3;\n");
      out.write("                color: #FFF;\n");
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
      out.write("            <div id=\"apDiv4\"><a href=\"dangnhap1.jsp\">ĐĂNG NHẬP</a></div>\n");
      out.write("            <div class=\"content\"> <div id=\"slider\">\n");
      out.write("                    <a>\n");
      out.write("                        <img src=\"image/trang chủ 1.jpg\" alt=\" ÁO DÀI CƯỚI\" width=\"1320\" height=\"530\" />\n");
      out.write("                    </a>\n");
      out.write("                    <img src=\"image/trang chu 2.jpg\" width=\"1320\" height=\"530\" alt=\"  ÁO DÀI TRUYỀN THỐNG\" />\n");
      out.write("                    <img src=\"image/trang chủ 3.jpg\" width=\"1320\" height=\"530\" alt=\" ÁO DÀI DẠ TIỆC\" />\n");
      out.write("                    <img src=\"image/trang chủ 4.jpg\" width=\"1320\" height=\"530\" alt=\"  ÁO DÀI CƯỚI\" />\n");
      out.write("                </div></div>\n");
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
