<%--
  Created by IntelliJ IDEA.
  User: ZLS
  Date: 2017/11/23
  Time: 15:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>盒老师</title>
    <meta name="keywords" content="盒老师">
    <meta name="content" content="盒老师">
    <meta http-equiv="X-UA-Compatible" content="IE=edge, chrome=1">
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/login.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
</head>
<body class="login_bj" >
<div class="zhuce_body">
    <div class="logo"><a href="#"><img src="${pageContext.request.contextPath}/images/logo.png" width="114" height="54" border="0"></a></div>
    <div class="zhuce_kong login_kuang">
        <div class="zc">
            <div class="bj_bai">
                <h3>登录</h3>
                <form action="" method="get">
                    <input name="" type="text" class="kuang_txt" placeholder="手机号">
                    <input name="" type="text" class="kuang_txt" placeholder="密码">
                    <div>
                        <a href="#">忘记密码？</a><input name="" type="checkbox" value="" checked><span>记住我</span>
                    </div>
                    <input name="登录" type="button" class="btn_zhuce" value="登录">

                </form>
            </div>
            <div class="bj_right">
                <p>使用以下账号直接登录</p>
                <a href="#" class="zhuce_qq">QQ注册</a>
                <a href="#" class="zhuce_wb">微博注册</a>
                <a href="#" class="zhuce_wx">微信注册</a>
                <p>已有账号？<a href="#">立即登录</a></p>

            </div>
        </div>
        <P>Diyhe.com&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;欢迎您定制盒子模型  更多模板：<a href="http://www.mycodes.net/" target="_blank">源码之家</a></P>
    </div>

</div>

</body>
</html>