package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dangnhap1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                left: 51px;\n");
      out.write("                top: 281px;\n");
      out.write("                width: 470px;\n");
      out.write("                height: 240px;\n");
      out.write("                z-index: 3;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <link href=\"SpryAssets/SpryValidationPassword.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            #apDiv5 {\n");
      out.write("                position: absolute;\n");
      out.write("                left: 661px;\n");
      out.write("                top: 298px;\n");
      out.write("                width: 583px;\n");
      out.write("                height: 329px;\n");
      out.write("                z-index: 4;\n");
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
      out.write("        <script src=\"SpryAssets/SpryValidationPassword.js\" type=\"text/javascript\"></script>\n");
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
      out.write("            <div id=\"apDiv5\"><a href=\"https://www.google.com/maps/place/84+Nguy%E1%BB%85n+V%C4%83n+Tr%E1%BB%97i,+ph%C6%B0%E1%BB%9Dng+8,+Ph%C3%BA+Nhu%E1%BA%ADn,+H%E1%BB%93+Ch%C3%AD+Minh,+Vi%E1%BB%87t+Nam/@10.7882522,106.6698126,14z/data=!4m5!3m4!1s0x317529298e97391f:0x6e598acd718b35e3!8m2!3d10.796459!4d106.674397\"><img src=\"image/bản đồ.jpg\" width=\"578\" height=\"320\" /></a></div>\n");
      out.write("            <div id=\"apDiv4\">\n");
      out.write("                <form id=\"form1\" name=\"form1\" method=\"get\" action=\"LoginServlet\">\n");
      out.write("                    <table width=\"471\" height=\"220\" border=\"0\">\n");
      out.write("                        <caption>\n");
      out.write("                            ĐĂNG NHẬP\n");
      out.write("                        </caption>\n");
      out.write("                        <tr>\n");
      out.write("                            <th height=\"69\" scope=\"col\">TÀI KHOẢN </th>\n");
      out.write("                            <th scope=\"col\">\n");
      out.write("                                <input type=\"text\" name=\"t1\" id=\"textfield\" />\n");
      out.write("                            </th>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <th height=\"60\" scope=\"col\">MẬT KHẨU</th>\n");
      out.write("                            <th scope=\"col\">\n");
      out.write("                                <span id=\"sprypassword1\">\n");
      out.write("                                    <input type=\"password\" name=\"t2\" id=\"password1\" />\n");
      out.write("                                    <span class=\"passwordRequiredMsg\"></span></span>\n");
      out.write("                            </th>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <th height=\"81\" colspan=\"2\" scope=\"col\">\n");
      out.write("\n");
      out.write("                                <input type=\"submit\" name=\"button\" id=\"button\" value=\"ĐĂNG NHẬP\" /> </th>\n");
      out.write("                        </tr>\n");
      out.write("                    </table></form>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"content\"></div>\n");
      out.write("            <script type=\"text/javascript\">\n");
      out.write("                var sprypassword1 = new Spry.Widget.ValidationPassword(\"sprypassword1\");\n");
      out.write("            </script>\n");
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
