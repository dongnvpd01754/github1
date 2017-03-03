package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sanpham_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                left: 32px;\n");
      out.write("                top: 249px;\n");
      out.write("                width: 233px;\n");
      out.write("                height: 233px;\n");
      out.write("                z-index: 7;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            #apDiv5 {\n");
      out.write("                position: absolute;\n");
      out.write("                left: 303px;\n");
      out.write("                top: 249px;\n");
      out.write("                width: 233px;\n");
      out.write("                height: 233px;\n");
      out.write("                z-index: 7;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            #apDiv6 {\n");
      out.write("                position: absolute;\n");
      out.write("                left: 558px;\n");
      out.write("                top: 248px;\n");
      out.write("                width: 233px;\n");
      out.write("                height: 233px;\n");
      out.write("                z-index: 7;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            #apDiv7 {\n");
      out.write("                position: absolute;\n");
      out.write("                left: 814px;\n");
      out.write("                top: 246px;\n");
      out.write("                width: 244px;\n");
      out.write("                height: 233px;\n");
      out.write("                z-index: 7;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            #apDiv8 {\n");
      out.write("                position: absolute;\n");
      out.write("                left: 1081px;\n");
      out.write("                top: 244px;\n");
      out.write("                width: 233px;\n");
      out.write("                height: 233px;\n");
      out.write("                z-index: 7;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            #apDiv9 {\n");
      out.write("                position: absolute;\n");
      out.write("                left: 86px;\n");
      out.write("                top: 631px;\n");
      out.write("                width: 109px;\n");
      out.write("                height: 23px;\n");
      out.write("                z-index: 8;\n");
      out.write("                font-size: 18px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            #apDiv10 {\n");
      out.write("                position: absolute;\n");
      out.write("                left: 370px;\n");
      out.write("                top: 631px;\n");
      out.write("                width: 113px;\n");
      out.write("                height: 43px;\n");
      out.write("                z-index: 9;\n");
      out.write("                font-size: 18px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            #apDiv11 {\n");
      out.write("                position: absolute;\n");
      out.write("                left: 607px;\n");
      out.write("                top: 629px;\n");
      out.write("                width: 121px;\n");
      out.write("                height: 32px;\n");
      out.write("                z-index: 10;\n");
      out.write("                font-size: 18px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            #apDiv12 {\n");
      out.write("                position: absolute;\n");
      out.write("                left: 855px;\n");
      out.write("                top: 624px;\n");
      out.write("                width: 122px;\n");
      out.write("                height: 42px;\n");
      out.write("                z-index: 11;\n");
      out.write("                font-size: 18px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            #apDiv13 {\n");
      out.write("                position: absolute;\n");
      out.write("                left: 1151px;\n");
      out.write("                top: 626px;\n");
      out.write("                width: 103px;\n");
      out.write("                height: 36px;\n");
      out.write("                z-index: 12;\n");
      out.write("                font-size: 18px;\n");
      out.write("            }\n");
      out.write("            .main #apDiv9 a {\n");
      out.write("                color: #FFF;\n");
      out.write("            }\n");
      out.write("            .main #apDiv10 a {\n");
      out.write("                color: #FFF;\n");
      out.write("            }\n");
      out.write("            .main #apDiv11 a {\n");
      out.write("                color: #FFF;\n");
      out.write("            }\n");
      out.write("            .main #apDiv12 a {\n");
      out.write("                color: #FFF;\n");
      out.write("            }\n");
      out.write("            .main #apDiv13 a {\n");
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
      out.write("            <div id=\"apDiv13\"><a href=\"muahang.jsp\">Xem Chi Tiết Giá Sản Phẩm</a></div>\n");
      out.write("            <div id=\"apDiv12\"><a href=\"muahang.jsp\">Xem Chi Tiết Giá Sản Phẩm</a></div>\n");
      out.write("            <div id=\"apDiv11\"><a href=\"muahang.jsp\">Xem Chi Tiết Giá Sản Phẩm</a></div>\n");
      out.write("            <div id=\"apDiv10\"><a href=\"muahang.jsp\">Xem Chi Tiết Giá Sản Phẩm</a></div>\n");
      out.write("            <div id=\"apDiv9\"><a href=\"muahang.jsp\">Xem Chi Tiết Giá Sản Phẩm</a></div>\n");
      out.write("            <div id=\"apDiv8\"><img src=\"image/ao dai nam 15.jpg\" width=\"232\" height=\"370\" /></div>\n");
      out.write("            <div id=\"apDiv7\"><img src=\"image/ao dai nam 12.jpg\" width=\"243\" height=\"368\" /></div>\n");
      out.write("            <div id=\"apDiv6\"><img src=\"image/ao dai nam 11.jpg\" width=\"233\" height=\"366\" /></div>\n");
      out.write("            <div id=\"apDiv5\"><img src=\"image/ao dai nam 10.jpg\" width=\"234\" height=\"367\" /></div>\n");
      out.write("            <div id=\"apDiv4\"><img src=\"image/ao dai nam 1.jpg\" width=\"230\" height=\"368\" /></div>\n");
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
