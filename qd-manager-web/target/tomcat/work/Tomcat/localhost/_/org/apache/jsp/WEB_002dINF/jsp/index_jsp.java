/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-11-23 07:16:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>盒老师</title>\r\n");
      out.write("    <meta name=\"keywords\" content=\"盒老师\">\r\n");
      out.write("    <meta name=\"content\" content=\"盒老师\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge, chrome=1\">\r\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/login.css\">\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery-3.2.1.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"login_bj\" >\r\n");
      out.write("\r\n");
      out.write("<div class=\"zhuce_body\">\r\n");
      out.write("    <div class=\"logo\"><a href=\"#\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/logo.png\" width=\"114\" height=\"54\" border=\"0\"></a></div>\r\n");
      out.write("    <div class=\"zhuce_kong\">\r\n");
      out.write("        <div class=\"zc\">\r\n");
      out.write("            <div class=\"bj_bai\">\r\n");
      out.write("                <h3>欢迎注册</h3>\r\n");
      out.write("                <form action=\"\" method=\"get\">\r\n");
      out.write("                    <input name=\"\" type=\"text\" class=\"kuang_txt phone\" placeholder=\"手机号\">\r\n");
      out.write("                    <input name=\"\" type=\"text\" class=\"kuang_txt email\" placeholder=\"邮箱\">\r\n");
      out.write("                    <input name=\"\" type=\"text\" class=\"kuang_txt possword\" placeholder=\"密码\">\r\n");
      out.write("                    <input name=\"\" type=\"text\" class=\"kuang_txt possword\" placeholder=\"邀请码\">\r\n");
      out.write("                    <input name=\"\" type=\"text\" class=\"kuang_txt yanzm\" placeholder=\"验证码\">\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <div class=\"hui_kuang\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/zc_22.jpg\" width=\"92\" height=\"31\"></div>\r\n");
      out.write("                        <div class=\"shuaxin\"><a href=\"#\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/zc_25.jpg\" width=\"13\" height=\"14\"></a></div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <input name=\"\" type=\"checkbox\" value=\"\"><span>已阅读并同意<a href=\"#\" target=\"_blank\"><span class=\"lan\">《XXXXX使用协议》</span></a></span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <input name=\"注册\" type=\"button\" class=\"btn_zhuce\" value=\"注册\">\r\n");
      out.write("\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"bj_right\">\r\n");
      out.write("                <p>使用以下账号直接登录</p>\r\n");
      out.write("                <a href=\"#\" class=\"zhuce_qq\">QQ注册</a>\r\n");
      out.write("                <a href=\"#\" class=\"zhuce_wb\">微博注册</a>\r\n");
      out.write("                <a href=\"#\" class=\"zhuce_wx\">微信注册</a>\r\n");
      out.write("                <p>已有账号？<a href=\"login\">立即登录</a></p>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <P>Diyhe.com&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;欢迎您定制盒子模型  更多模板：<a href=\"http://www.mycodes.net/\" target=\"_blank\">源码之家</a></P>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
