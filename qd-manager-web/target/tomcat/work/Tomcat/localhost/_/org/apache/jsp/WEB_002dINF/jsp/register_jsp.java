/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-11-24 02:18:08 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\"\r\n");
      out.write("\"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("    <meta http-equiv=\"Cache-Control\" content=\"no-cache,must-revalidate\">\r\n");
      out.write("    <title>注册-个人用户</title>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("          href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/regist-login-css/headerfooter.css\"/>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("          href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/regist-login-css/jquery.alerts.css\"/>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("          href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/regist-login-css/headerfooterindex.css\"/>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery-3.2.1.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\"\r\n");
      out.write("            src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/regist-login-js/jquery.cookie.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\"\r\n");
      out.write("            src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/regist-login-js/passport.common.js?v20140531\"></script>\r\n");
      out.write("    <script type=\"text/javascript\"\r\n");
      out.write("            src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/regist-login-js/jquery.alerts.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\"\r\n");
      out.write("            src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/regist-login-js/png.js?v20140521\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!-- header -->\r\n");
      out.write("<div class=\"header\">\r\n");
      out.write("    <a href=\"http://www.e3mall.cn\"><img src=\"/images/regist-login-images/logo.png\" border=\"0\"/><span>欢迎注册</span></a>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!--mainStart-->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("      href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/regist-login-css/reg.css?v20140432\"/>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("        src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/regist-login-js/allMail.js?v20140430\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/regist-login-js/reg.js\"></script>\r\n");
      out.write("<!-- reg_main -->\r\n");
      out.write("<div class=\"tabBox clear\">\r\n");
      out.write("    <span class=\"reg_hide reg_show regMr5\" id=\"regper\">个人用户</span>\r\n");
      out.write("    <span class=\"reg_hide\" id=\"regcom\" style=\"\">企业用户</span>\r\n");
      out.write("    <div class=\"login\">已有账号，立即 <a href=\"/page/login\">登录</a></div>\r\n");
      out.write("</div>\r\n");
      out.write("<!--个人用户-->\r\n");
      out.write("<div class=\"reg_main reg_border regTab\" id=\"perDiv\">\r\n");
      out.write("    <ul class=\"individualUserBg\">\r\n");
      out.write("        <form id=\"regForm_mod\" name=\"regForm_mod\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("            <li class=\"regMb30\">\r\n");
      out.write("                <label><font>*</font> 账户名：</label>\r\n");
      out.write("                <span class=\"regM defaultBorder\">\r\n");
      out.write("            \t<input id=\"regName\" name=\"username\" class=\"regInput\" type=\"text\" onkeyup=\"mail_div(event);\"\r\n");
      out.write("                       onfocus=\"showtip('regName','userMamErr',8);\" onblur=\"ckmem();\" autocomplete=\"off\"\r\n");
      out.write("                       maxlength=\"80\"/>\r\n");
      out.write("\t\t\t\t<em></em>\r\n");
      out.write("            </span>\r\n");
      out.write("                <span class=\"regInput\" id=\"userMamErr\"></span>\r\n");
      out.write("            </li>\r\n");
      out.write("            <div node-type=\"layer\" class=\"accountSearch\" style=\"display:none;\" id=\"person_mail\"></div>\r\n");
      out.write("            <li>\r\n");
      out.write("                <label><font>*</font> 登录密码：</label>\r\n");
      out.write("                <span class=\"regM defaultBorder\">\r\n");
      out.write("            \t<input id=\"pwd\" name=\"password\" class=\"regInput\" autocomplete=\"off\" type=\"password\"\r\n");
      out.write("                       onfocus=\"showPwdtip('password','passwordErr',2);\" onkeyup=\"ckpwd(0,1);\" onblur=\"ckpwd(0,0);\"/>\r\n");
      out.write("            \t<em></em>\r\n");
      out.write("            </span>\r\n");
      out.write("                <span class=\"regInput\" id=\"passwordErr\"></span>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"safetyLayer regPl191\" id=\"pwdStrong\">\r\n");
      out.write("                <font style=\"font-size:12px;\">安全程度：</font><em class=\"default\">弱</em><em class=\"default\">中</em><em\r\n");
      out.write("                    class=\"default\">强</em>\r\n");
      out.write("            </li>\r\n");
      out.write("\r\n");
      out.write("            <li class=\"regMb30\">\r\n");
      out.write("                <label><font>*</font> 确认密码：</label>\r\n");
      out.write("                <span class=\"regM defaultBorder\">\r\n");
      out.write("            \t<input id=\"pwdRepeat\" name=\"password2\" autocomplete=\"off\" class=\"regInput\" type=\"password\"\r\n");
      out.write("                       onfocus=\"showtip('password2','password2Err',3);\" onblur=\"ckpwd2();\"/>\r\n");
      out.write("            \t<em></em>\r\n");
      out.write("            </span>\r\n");
      out.write("                <span class=\"regInput\" id=\"password2Err\"></span>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"regMb30\">\r\n");
      out.write("                <label><font>*</font> 验证手机：</label>\r\n");
      out.write("                <span class=\"regM defaultBorder\">\r\n");
      out.write("            \t<input id=\"phone\" name=\"phone\" autocomplete=\"off\" class=\"regInput\" type=\"text\" maxlength=\"11\"\r\n");
      out.write("                       onfocus=\"showtip('phone','phoneErr',1);\" onblur=\"$('#phoneErr').html('')\"/>\r\n");
      out.write("            \t<em></em>\r\n");
      out.write("            </span>\r\n");
      out.write("                <span class=\"regInput\" id=\"phoneErr\"></span>\r\n");
      out.write("            </li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <li class=\"regPl88\">\r\n");
      out.write("\t\t\t<span class=\"regM\" style=\"margin-left:29px\">\r\n");
      out.write("\t\t\t\t<input id=\"AgreeId\" name=\"AgreeId\" type=\"checkbox\" checked=\"\" onclick=\"ckAgree();\">\r\n");
      out.write("\t\t\t\t<a href=\"https://passport.e3mall.cn/xy.html\" target=\"_blank\" class=\"checkTitle\">我已阅读并同意<font\r\n");
      out.write("                        style=\"font-size:12px;\">《宜立方商城用户注册协议》</font></a>\r\n");
      out.write("\t\t\t</span>\r\n");
      out.write("                <span id=\"AgreeIdErr\"></span>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"register regPl88 regMt10\" id=\"sub_per\" style=\"margin-left:29px\">\r\n");
      out.write("                <input type=\"hidden\" id=\"tjuid\" name=\"tjuid\" value=\"\">\r\n");
      out.write("                <a href=\"javascript:void(0);\" class=\"registerNow\" id=\"reg_per_data\" onclick=\"REGISTER.reg()\">立即注册</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <br/><br/>\r\n");
      out.write("        </form>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <div class=\"ui-reg-tip\"><a href=\"http://help.e3mall.cn/140/6788.html\" target=\"_blank\">了解更多>></a></div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!--mainOver-->\r\n");
      out.write("\r\n");
      out.write("<!--footerStart-->\r\n");
      out.write("<div class=\"footer\">\r\n");
      out.write("\t\t\t<span>\r\n");
      out.write("\t\t\t\t<a href=\"http://www.e3mall.cn/www/379/5109.html\" rel=\"nofollow\" class=\"footerlink1\">关于我们</a> | \r\n");
      out.write("\t\t\t\t<a href=\"http://www.e3mall.cn/www/380/5116.html\" rel=\"nofollow\" class=\"footerlink1\">联系我们</a> | \r\n");
      out.write("\t\t\t\t<a href=\"http://www.e3mall.cn/www/381/5117.html\" rel=\"nofollow\" class=\"footerlink1\">招聘人才</a> | \r\n");
      out.write("\t\t\t\t<a href=\"http://www.e3mall.cn/www/330/2705.html\" rel=\"nofollow\" class=\"footerlink1\">友情链接</a> | \r\n");
      out.write("\t\t\t\t<a href=\"http://supplier.e3mall.cn/supplierApply\" rel=\"nofollow\" class=\"footerlink1\">供应商申请</a>\r\n");
      out.write("\t\t\t</span>\r\n");
      out.write("    <p>\r\n");
      out.write("        北京宜立方电子商务有限公司<br/>\r\n");
      out.write("        北京市公安局顺义分局备案11011302000890号|<a href=\"http://www.miibeian.gov.cn\" target=\"_blank\" rel=\"nofollow\"\r\n");
      out.write("                                       class=\"footerlink1\">京ICP备12011349号</a>|<a\r\n");
      out.write("            href=\"http://www.e3mall.cn/www/174/461.html\" target=\"_blank\" rel=\"nofollow\"\r\n");
      out.write("            class=\"footerlink1\">企业营业执照</a><br/>\r\n");
      out.write("        Copyright© 宜立方商城 e3mall.cn 版权所有<br/>\r\n");
      out.write("    </p>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- /footer -->\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    var REGISTER = {\r\n");
      out.write("        param: {\r\n");
      out.write("            //单点登录系统的url\r\n");
      out.write("            surl: \"\"\r\n");
      out.write("        },\r\n");
      out.write("        inputcheck: function () {\r\n");
      out.write("            var flag = true;\r\n");
      out.write("            //不能为空检查\r\n");
      out.write("            if ($(\"#regName\").val() == \"\") {\r\n");
      out.write("                showError(\"regName\", \"userMamErr\", defaultArr[8]);\r\n");
      out.write("                flag = false;\r\n");
      out.write("            }\r\n");
      out.write("            if ($(\"#pwd\").val() == \"\") {\r\n");
      out.write("                showError(\"pwd\", \"passwordErr\", pwdArr[0]);\r\n");
      out.write("                flag = false;\r\n");
      out.write("            }\r\n");
      out.write("            if ($(\"#phone\").val() == \"\") {\r\n");
      out.write("                showError(\"phone\", \"phoneErr\", memArr[0]);\r\n");
      out.write("                flag = false;\r\n");
      out.write("            }\r\n");
      out.write("            //密码检查\r\n");
      out.write("            if ($(\"#pwd\").val() != $(\"#pwdRepeat\").val()) {\r\n");
      out.write("                showError(\"pwdRepeat\", \"password2Err\", pwd2Arr[1]);\r\n");
      out.write("                flag = false;\r\n");
      out.write("            }\r\n");
      out.write("            return flag;\r\n");
      out.write("        },\r\n");
      out.write("        beforeSubmit: function () {\r\n");
      out.write("            //检查用户是否已经被占用\r\n");
      out.write("            $.ajax({\r\n");
      out.write("                url: REGISTER.param.surl + \"/user/check/\" + escape($(\"#regName\").val()) + \"/1?r=\" + Math.random(),\r\n");
      out.write("                success: function (data) {\r\n");
      out.write("                    if (data.data) {\r\n");
      out.write("                        //检查手机号是否存在\r\n");
      out.write("                        $.ajax({\r\n");
      out.write("                            url: REGISTER.param.surl + \"/user/check/\" + $(\"#phone\").val() + \"/2?r=\" + Math.random(),\r\n");
      out.write("                            success: function (data) {\r\n");
      out.write("                                if (data.data) {\r\n");
      out.write("                                    REGISTER.doSubmit();\r\n");
      out.write("                                } else {\r\n");
      out.write("                                    showError(\"phone\", \"phoneErr\", defaultArr[9]);\r\n");
      out.write("                                }\r\n");
      out.write("                            }\r\n");
      out.write("                        });\r\n");
      out.write("                    } else {\r\n");
      out.write("                        showError(\"regName\", \"userMamErr\", defaultArr[10]);\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("        },\r\n");
      out.write("        doSubmit: function () {\r\n");
      out.write("            $.post(\"/user/register\", $(\"#regForm_mod\").serialize(), function (data) {\r\n");
      out.write("                if (data.status == 200) {\r\n");
      out.write("                    jAlert('用户注册成功，请登录！', \"提示\", function () {\r\n");
      out.write("                        REGISTER.login();\r\n");
      out.write("                    });\r\n");
      out.write("                } else {\r\n");
      out.write("                    jAlert(\"注册失败！\", \"提示\");\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        },\r\n");
      out.write("        login: function () {\r\n");
      out.write("            location.href = \"/page/login\";\r\n");
      out.write("            return false;\r\n");
      out.write("        },\r\n");
      out.write("        reg: function () {\r\n");
      out.write("            if (this.inputcheck()) {\r\n");
      out.write("                this.beforeSubmit();\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("    };\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
