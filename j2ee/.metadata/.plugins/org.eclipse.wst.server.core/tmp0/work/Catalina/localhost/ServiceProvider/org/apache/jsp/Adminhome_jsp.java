/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.15
 * Generated at: 2022-10-10 18:08:19 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Adminhome_jsp extends org.apache.jasper.runtime.HttpJspBase
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

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"jquery.js\">\r\n");
      out.write("</script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"jquery-ui.min.js\">\r\n");
      out.write("</script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"tt_slideshow.js\">\r\n");
      out.write("</script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"bootstrap.min.js\">\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<title>AskAnyService</title>\r\n");
      out.write("<link rel=\"stylesheet\"  href=\"bootstrap.css\" type=\"text/css\" media=\"screen\"/>\r\n");
      out.write("<link rel=\"stylesheet\"  href=\"style.css\" type=\"text/css\" media=\"screen\"/>\r\n");
      out.write("<!--[if lte IE 8]>\r\n");
      out.write("<link rel=\"stylesheet\"  href=\"menuie.css\" type=\"text/css\" media=\"screen\"/>\r\n");
      out.write("<link rel=\"stylesheet\"  href=\"vmenuie.css\" type=\"text/css\" media=\"screen\"/>\r\n");
      out.write("<![endif]-->\r\n");
      out.write("<script type=\"text/javascript\" src=\"totop.js\">\r\n");
      out.write("</script>\r\n");
      out.write("<!--[if IE 7]>\r\n");
      out.write("<style type=\"text/css\" media=\"screen\">\r\n");
      out.write("#ttr_vmenu_items  li.ttr_vmenu_items_parent {margin-left:-16px;font-size:0px;}\r\n");
      out.write("</style>\r\n");
      out.write("<![endif]-->\r\n");
      out.write("<!--[if lt IE 9]>\r\n");
      out.write("<script type=\"text/javascript\" src=\"html5shiv.js\">\r\n");
      out.write("</script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"respond.min.js\">\r\n");
      out.write("</script>\r\n");
      out.write("<![endif]-->\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write(".style1 {\r\n");
      out.write("\tfont-family: 'Roboto Slab', 'Arial';\r\n");
      out.write("\tfont-size: 1.429em;\r\n");
      out.write("\tcolor: rgba(34,34,34,1);\r\n");
      out.write("}\r\n");
      out.write(".style3 {\r\n");
      out.write("\tfont-family: 'Roboto Slab', 'Arial';\r\n");
      out.write("\tfont-size: 24px;\r\n");
      out.write("\tcolor: rgba(34,34,34,1);\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("-->\r\n");
      out.write("</style></head>\r\n");
      out.write("<body class=\"Home\">\r\n");
      out.write("<div id=\"ttr_page\" class=\"container\">\r\n");
      out.write("  <nav id=\"ttr_menu\" class=\"navbar-default navbar\">\r\n");
      out.write("   <div id=\"ttr_menu_inner_in\">\r\n");
      out.write("<div class=\"menuforeground\">\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"ttr_menushape1\">\r\n");
      out.write("<div class=\"html_content\"><p><span style=\"font-family:'Roboto Slab','Arial';font-weight:900;font-size:1.701em;color:rgba(53,181,235,1);\">AskAnyService</span></p></div>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"navigationmenu\">\r\n");
      out.write("<div class=\"navbar-header\">\r\n");
      out.write("<button id=\"nav-expander\" data-target=\".navbar-collapse\" data-toggle=\"collapse\" class=\"navbar-toggle\" type=\"button\">\r\n");
      out.write("<span class=\"sr-only\">\r\n");
      out.write("</span>\r\n");
      out.write("<span class=\"icon-bar\">\r\n");
      out.write("</span>\r\n");
      out.write("<span class=\"icon-bar\">\r\n");
      out.write("</span>\r\n");
      out.write("<span class=\"icon-bar\">\r\n");
      out.write("</span>\r\n");
      out.write("</button>\r\n");
      out.write("<a href=\"#\" target=\"_self\">\r\n");
      out.write("\r\n");
      out.write("</a>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"menu-center collapse navbar-collapse\">\r\n");
      out.write("<ul class=\"ttr_menu_items nav navbar-nav navbar-right\">\r\n");
      out.write("<li class=\"ttr_menu_items_parent dropdown active\"><a href=\"index.html\" class=\"ttr_menu_items_parent_link_active\"><span class=\"menuchildicon\"></span>Home</a>\r\n");
      out.write("<hr class =\"horiz_separator\"/>\r\n");
      out.write("</li>\r\n");
      out.write("<li class=\"ttr_menu_items_parent dropdown\"><a href=\"LogoutForAdmin\" class=\"ttr_menu_items_parent_link\"><span class=\"menuchildicon\"></span>Logout</a>\r\n");
      out.write("<hr class =\"horiz_separator\"/>\r\n");
      out.write("</li>\r\n");
      out.write("<li class=\"ttr_menu_items_parent dropdown\"><a href=\"services.html\" class=\"ttr_menu_items_parent_link\"><span class=\"menuchildicon\"></span>Services</a>\r\n");
      out.write("<hr class =\"horiz_separator\"/>\r\n");
      out.write("</li>\r\n");
      out.write("\r\n");
      out.write("<li class=\"ttr_menu_items_parent dropdown\"><a href=\"contact.html\" class=\"ttr_menu_items_parent_link\"><span class=\"menuchildicon\"></span>Contact</a>\r\n");
      out.write("<hr class =\"horiz_separator\"/>\r\n");
      out.write("</li>\r\n");
      out.write("</ul>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</nav>\r\n");
      out.write("<div class=\"ttr_banner_slideshow\"></div>\r\n");
      out.write("<div class=\"ttr_slideshow\">\r\n");
      out.write("  <div id=\"ttr_slideshow_inner\">\r\n");
      out.write("<ul>\r\n");
      out.write("<li id=\"Slide0\" class=\"ttr_slide\" data-slideEffect=\"Wipe\">\r\n");
      out.write("<a href=\"#\"></a>\r\n");
      out.write("<div class=\"ttr_slideshow_last\">\r\n");
      out.write("<div class=\"ttr_slideshowshape01\" data-effect=\"None\" data-begintime=\"0\" data-duration=\"1\" data-easing=\"linear\" data-slide=\"bottom\">\r\n");
      out.write("<div class=\"html_content\"><p style=\"margin:0em 0em 0em 0em;text-align:Center;font-family:'<String xmlns=&quot;clr-namespace:System;assembly=mscorlib&quot;>&amp;lt;String xmlns=&quot;clr-namespace:System;assembly=mscorlib&quot;&amp;gt;&amp;amp;lt;String xmlns=&quot;clr-namespace:System;assembly=mscorlib&quot;&amp;amp;gt;&amp;amp;amp;lt;String xmlns=&quot;clr-namespace:System;assembly=mscorlib&quot;&amp;amp;amp;gt;&amp;amp;amp;amp;lt;String xmlns=&quot;clr-namespace:System;assembly=mscorlib&quot;&amp;amp;amp;amp;gt;&amp;amp;amp;amp;amp;lt;String xmlns=&quot;clr-namespace:System;assembly=mscorlib&quot;&amp;amp;amp;amp;amp;gt;&amp;amp;amp;amp;amp;amp;lt;String xmlns=&quot;clr-namespace:System;assembly=mscorlib&quot;&amp;amp;amp;amp;amp;amp;gt;&amp;amp;amp;amp;amp;amp;amp;lt;String xmlns=&quot;clr-namespace:System;assembly=mscorlib&quot;&amp;amp;amp;amp;amp;amp;amp;gt;&amp;amp;amp;amp;amp;amp;amp;amp;lt;String xmlns=&quot;clr-namespace:System;assembly=mscorlib&quot;&amp;amp;amp;amp;amp;amp;amp;amp;gt;&amp;amp;amp;amp;amp;amp;amp;amp;amp;lt;String xmlns=&quot;clr-namespace:System;assembly=mscorlib&quot;&amp;amp;amp;amp;amp;amp;amp;amp;amp;gt;&amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;lt;String xmlns=&quot;clr-namespace:System;assembly=mscorlib&quot;&amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;gt;&amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;lt;String xmlns=&quot;clr-namespace:System;assembly=mscorlib&quot;&amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;gt;&amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;lt;String xmlns=&quot;clr-namespace:System;assembly=mscorlib&quot;&amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;gt;&amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;lt;String xmlns=&quot;clr-namespace:System;assembly=mscorlib&quot;&amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;gt;&amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;lt;String xmlns=&quot;clr-namespace:System;assembly=mscorlib&quot;&amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;gt;&amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;lt;String xmlns=&quot;clr-namespace:System;assembly=mscorlib&quot;&amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;gt;Arial&amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;lt;/String&amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;gt;&amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;lt;/String&amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;gt;&amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;lt;/String&amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;gt;&amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;lt;/String&amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;gt;&amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;lt;/String&amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;gt;&amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;lt;/String&amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;gt;&amp;amp;amp;amp;amp;amp;amp;amp;amp;lt;/String&amp;amp;amp;amp;amp;amp;amp;amp;amp;gt;&amp;amp;amp;amp;amp;amp;amp;amp;lt;/String&amp;amp;amp;amp;amp;amp;amp;amp;gt;&amp;amp;amp;amp;amp;amp;amp;lt;/String&amp;amp;amp;amp;amp;amp;amp;gt;&amp;amp;amp;amp;amp;amp;lt;/String&amp;amp;amp;amp;amp;amp;gt;&amp;amp;amp;amp;amp;lt;/String&amp;amp;amp;amp;amp;gt;&amp;amp;amp;amp;lt;/String&amp;amp;amp;amp;gt;&amp;amp;amp;lt;/String&amp;amp;amp;gt;&amp;amp;lt;/String&amp;amp;gt;&amp;lt;/String&amp;gt;</String>';font-size:1.333em;\"><span style=\"font-family:'Roboto Slab','Arial';font-weight:700;font-size:3.929em;color:rgba(255,255,255,1);\">OUR AIM IS GROWING AFFLUENCE OF YOUR BUSINESS</span></p></div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</li>\r\n");
      out.write("<li id=\"Slide1\" class=\"ttr_slide\" data-slideEffect=\"Wipe\">\r\n");
      out.write("<a href=\"#\"></a>\r\n");
      out.write("<div class=\"ttr_slideshow_last\">\r\n");
      out.write("<div class=\"ttr_slideshowshape11\" data-effect=\"None\" data-begintime=\"0\" data-duration=\"1\" data-easing=\"linear\" data-slide=\"bottom\">\r\n");
      out.write("<div class=\"html_content\"><p style=\"text-align:Center;\"><span style=\"font-family:'Roboto Slab','Arial';font-weight:700;font-size:3.929em;color:rgba(255,255,255,1);\">WE GIVE BEST FOR VITALIZING YOUR BUSINESS</span></p></div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</li>\r\n");
      out.write("<li id=\"Slide2\" class=\"ttr_slide\" data-slideEffect=\"Wipe\">\r\n");
      out.write("<a href=\"#\"></a>\r\n");
      out.write("<div class=\"ttr_slideshow_last\">\r\n");
      out.write("<div class=\"ttr_slideshowshape21\" data-effect=\"Fade\" data-begintime=\"0\" data-duration=\"1\" data-easing=\"linear\" data-slide=\"bottom\">\r\n");
      out.write("<div class=\"html_content\"><p style=\"text-align:Center;\"><span style=\"font-family:'Roboto Slab','Arial';font-weight:700;font-size:3.929em;color:rgba(255,255,255,1);\">WE HAVE TAILORED SOLUTIONS FOR VIVID INDUSTRIES</span></p></div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</li>\r\n");
      out.write("</ul>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"ttr_slideshow_in\">\r\n");
      out.write("<div class=\"ttr_slideshow_last\">\r\n");
      out.write("<div id=\"nav\"></div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"ttr_banner_slideshow\">\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"ttr_content_and_sidebar_container\">\r\n");
      out.write("<div id=\"ttr_content\">\r\n");
      out.write("<div id=\"ttr_content_margin\"class=\"container-fluid\">\r\n");
      out.write("<div style=\"height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;\"></div>\r\n");
      out.write("<div class=\"ttr_Home_html_row0 row\">\r\n");
      out.write("  <div class=\"clearfix visible-lg-block visible-sm-block visible-md-block visible-xs-block\">\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"ttr_Home_html_row1 row\">\r\n");
      out.write("<div class=\"post_column col-lg-12 col-md-12 col-sm-12 col-xs-12\">\r\n");
      out.write("<div class=\"ttr_Home_html_column10\">\r\n");
      out.write("  <div style=\"clear:both;\"></div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"clearfix visible-lg-block visible-sm-block visible-md-block visible-xs-block\">\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"post_column col-lg-4 col-md-6 col-sm-6 col-xs-12\">\r\n");
      out.write("<div class=\"ttr_Home_html_column11\">\r\n");
      out.write("  <div class=\"html_content\">\r\n");
      out.write("\r\n");
      out.write("<h1>welcome to admin panel</h1>\r\n");
 
String id=(String)session.getAttribute("id");
String password=(String)session.getAttribute("pwd");

      out.write('\r');
      out.write('\n');
      out.print(id);
      out.write('\r');
      out.write('\n');
      out.print(password);
      out.write("\r\n");
      out.write("<br><br>\r\n");
      out.write("\r\n");
      out.write("<a href=\"Show.jsp\">Show all service provider</a><br><br>\r\n");
      out.write("<a href=\"ShowAllUser.jsp\">Show all user </a><br><br>\r\n");
      out.write("<a href=\"SearchforServiceProvider.html\">Search service provider </a><br><br>\r\n");
      out.write("<a href=\"SearchForUser.html\">search user</a>\r\n");
      out.write("\t\r\n");
      out.write("<p style=\"margin:1.43em 0em 0.36em 0em;text-align:Center;line-height:1.69014084507042;\">&nbsp;</p>\r\n");
      out.write("</div>\r\n");
      out.write("<div style=\"clear:both;\"></div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"clearfix visible-xs-block\">\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"post_column col-lg-4 col-md-6 col-sm-6 col-xs-12\">\r\n");
      out.write("\r\n");
      out.write("</p>\r\n");
      out.write("</div>\r\n");
      out.write("<div style=\"clear:both;\"></div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"clearfix visible-lg-block visible-xs-block\">\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"ttr_Home_html_row2 row\">\r\n");
      out.write("<div class=\"post_column col-lg-3 col-md-6 col-sm-6 col-xs-12\">\r\n");
      out.write("<div class=\"ttr_Home_html_column20\">\r\n");
      out.write("<div style=\"height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;\"></div>\r\n");
      out.write("<div class=\"html_content\"><p style=\"text-align:Center;\"><span style=\"font-family:'Roboto Slab','Arial';font-weight:700;font-size:2.571em;color:rgba(255,255,255,1);\">1250</span></p><p style=\"text-align:Center;\"><span style=\"font-family:'Roboto Slab','Arial';font-weight:700;font-size:1.429em;color:rgba(255,255,255,1);\">DAYS OF WORK</span></p><p style=\"margin:1.43em 0em 0.36em 0em;text-align:Center;\"><span style=\"font-family:'Roboto','Arial';font-weight:300;font-size:1.143em;color:rgba(255,255,255,1);\"></span></p></div>\r\n");
      out.write("<div style=\"height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;\"></div>\r\n");
      out.write("<div style=\"clear:both;\"></div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"clearfix visible-xs-block\">\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"post_column col-lg-3 col-md-6 col-sm-6 col-xs-12\">\r\n");
      out.write("<div class=\"ttr_Home_html_column21\">\r\n");
      out.write("<div style=\"height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;\"></div>\r\n");
      out.write("<div class=\"html_content\"><p style=\"margin:0.36em 0em 0.36em 0em;text-align:Center;\"><span style=\"font-family:'Roboto Slab','Arial';font-weight:700;font-size:2.571em;color:rgba(255,255,255,1);\">759</span></p><p style=\"margin:0.36em 0em 0.36em 0em;text-align:Center;\"><span style=\"font-family:'Roboto Slab','Arial';font-weight:700;font-size:1.429em;color:rgba(255,255,255,1);\">TRUSTED USERS</span></p><p style=\"margin:1.43em 0em 0.36em 0em;text-align:Center;\"><span style=\"font-family:'Roboto','Arial';font-weight:300;font-size:1.143em;color:rgba(255,255,255,1);\"></span></p></div>\r\n");
      out.write("<div style=\"height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;\"></div>\r\n");
      out.write("<div style=\"clear:both;\"></div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"clearfix visible-sm-block visible-md-block visible-xs-block\">\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"post_column col-lg-3 col-md-6 col-sm-6 col-xs-12\">\r\n");
      out.write("<div class=\"ttr_Home_html_column22\">\r\n");
      out.write("<div style=\"height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;\"></div>\r\n");
      out.write("<div class=\"html_content\"><p style=\"margin:0.36em 0em 0.36em 0em;text-align:Center;\"><span style=\"font-family:'Roboto Slab','Arial';font-weight:700;font-size:2.571em;color:rgba(255,255,255,1);\">890</span></p><p style=\"margin:0.36em 0em 0.36em 0em;text-align:Center;\"><span style=\"font-family:'Roboto Slab','Arial';font-weight:700;font-size:1.429em;color:rgba(255,255,255,1);\">FINISHED WORK</span></p><p style=\"margin:1.43em 0em 0.36em 0em;text-align:Center;\"><span style=\"font-family:'Roboto','Arial';font-weight:300;font-size:1.143em;color:rgba(255,255,255,1);\"> </span></p></div>\r\n");
      out.write("<div style=\"height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;\"></div>\r\n");
      out.write("<div style=\"clear:both;\"></div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"clearfix visible-xs-block\">\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"post_column col-lg-3 col-md-6 col-sm-6 col-xs-12\">\r\n");
      out.write("<div class=\"ttr_Home_html_column23\">\r\n");
      out.write("<div style=\"height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;\"></div>\r\n");
      out.write("<div class=\"html_content\"><p style=\"margin:0.36em 0em 0.36em 0em;text-align:Center;\"><span style=\"font-family:'Roboto Slab','Arial';font-weight:700;font-size:2.571em;color:rgba(255,255,255,1);\">359</span></p><p style=\"margin:0.36em 0em 0.36em 0em;text-align:Center;\"><span style=\"font-family:'Roboto Slab','Arial';font-weight:700;font-size:1.429em;color:rgba(255,255,255,1);\">OUR REWARDS</span></p><p style=\"margin:1.43em 0em 0.36em 0em;text-align:Center;\"><span style=\"font-family:'Roboto','Arial';font-weight:300;font-size:1.143em;color:rgba(255,255,255,1);\"> </span></p></div>\r\n");
      out.write("<div style=\"height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;\"></div>\r\n");
      out.write("<div style=\"clear:both;\"></div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"clearfix visible-lg-block visible-sm-block visible-md-block visible-xs-block\">\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"ttr_Home_html_row3 row\">\r\n");
      out.write("<div class=\"post_column col-lg-7 col-md-12 col-sm-12 col-xs-12\">\r\n");
      out.write("<div class=\"ttr_Home_html_column30\">\r\n");
      out.write("<div style=\"height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;\"></div>\r\n");
      out.write("<div class=\"html_content\"><p><span style=\"font-family:'Roboto Slab','Arial';font-weight:700;font-size:1.857em;color:rgba(53,181,235,1);\">We Make Work Easy In Life</span></p><p style=\"margin:2.14em 0em 0.36em 0em;line-height:1.69014084507042;\"><span style=\"font-family:'Roboto','Arial';font-size:1.143em;color:rgba(105,105,105,1);\">The on demand  AskAnySerivce website is incredibly useful for everybody who wants to urge Any type of services like plumbing, electronic repair, gas range repairing, RO servicing and electrical maintenance. When an individual relocating from one area to a different because now a day's everyone wants to save lots of time and shot out their problems within time with none problem. Therefore, online AskAnyService are very beneficial for people. There are three types of Login in our website, first is Admin login  and second one is service provider login  and last one is for user login .  In AskAnyService  service provider have a crucial role within the project he/she can register with this website by mentioning their role and adds. The small about them by providing their contact number while the user can see an inventory of services and get in touch with them as per their requirements. The AskAnyService  website consists of the many categories and services as mentioned before. Users who are in need of services can register with this website and look for service providers by mentioning the situation. The service provider's there in particular locations are listed to user and therefore the user can book and give them a time slot.</span></p><p style=\"margin:1.43em 0em 0.36em 0em;line-height:1.69014084507042;\"></p>\r\n");
      out.write("</div>\r\n");
      out.write("<div style=\"clear:both;\"></div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"clearfix visible-sm-block visible-md-block visible-xs-block\">\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"clearfix visible-lg-block visible-sm-block visible-md-block visible-xs-block\">\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"ttr_Home_html_row4 row\">\r\n");
      out.write("<div class=\"post_column col-lg-5 col-md-12 col-sm-12 col-xs-12\"></div>\r\n");
      out.write("<div class=\"clearfix visible-sm-block visible-md-block visible-xs-block\">\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"clearfix visible-lg-block visible-sm-block visible-md-block visible-xs-block\">\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"ttr_Home_html_row5 row\">\r\n");
      out.write("  <div class=\"clearfix visible-lg-block visible-sm-block visible-md-block visible-xs-block\">\r\n");
      out.write("</div>\r\n");
      out.write("  <div class=\"clearfix visible-sm-block visible-md-block visible-xs-block\">\r\n");
      out.write("</div>\r\n");
      out.write("  <div class=\"clearfix visible-sm-block visible-md-block visible-xs-block\">\r\n");
      out.write("</div>\r\n");
      out.write("  <div class=\"clearfix visible-lg-block visible-sm-block visible-md-block visible-xs-block\">\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div style=\"clear:both\">\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<footer id=\"ttr_footer\">\r\n");
      out.write("<div class=\"ttr_footerHome_html_row0 row\">\r\n");
      out.write("<div class=\"post_column col-lg-3 col-md-6 col-sm-6 col-xs-12\">\r\n");
      out.write("<div class=\"ttr_footerHome_html_column00\">\r\n");
      out.write("  <div class=\"html_content\"><p style=\"margin:0.36em 0em 0.36em 2.86em;\">&nbsp;</p><p style=\"margin:0.36em 0em 0.36em 2.86em;\"><span style=\"font-family:'Roboto Slab','Arial';font-weight:700;font-size:1.429em;color:rgba(0,182,240,1);\">NAVIGATION</span></p><p style=\"margin:1.43em 0em 0.36em 2.86em;\"><a HREF=\"Home.html\" class=\"tt_link\" target=\"_self\"><span style=\"font-family:'Roboto','Arial';font-weight:300;font-size:1.143em;color:rgba(255,255,255,1);\">Home</span></a></p><p style=\"margin:0.57em 0em 0.36em 2.86em;\"><a HREF=\"Firm-Profile.html\" class=\"tt_link\" target=\"_self\"><span style=\"font-family:'Roboto','Arial';font-weight:300;font-size:1.143em;color:rgba(255,255,255,1);\">Firm Profile&nbsp;&nbsp;</span></a></p><p style=\"margin:0.57em 0em 0.36em 2.86em;\"><a HREF=\"Services.html\" class=\"tt_link\" target=\"_self\"><span style=\"font-family:'Roboto','Arial';font-weight:300;font-size:1.143em;color:rgba(255,255,255,1);\">Services</span></a></p><p style=\"margin:0.57em 0em 0.36em 2.86em;\"><a HREF=\"Events.html\" class=\"tt_link\" target=\"_self\"><span style=\"font-family:'Roboto','Arial';font-weight:300;font-size:1.143em;color:rgba(255,255,255,1);\">Events</span></a></p><p style=\"margin:0.57em 0em 0.36em 2.86em;\"><a HREF=\"Contact.html\" class=\"tt_link\" target=\"_self\"><span style=\"font-family:'Roboto','Arial';font-weight:300;font-size:1.143em;color:rgba(255,255,255,1);\">Contact</span></a></p></div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"clearfix visible-xs-block\">\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"clearfix visible-sm-block visible-md-block visible-xs-block\">\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"clearfix visible-xs-block\">\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"clearfix visible-lg-block visible-sm-block visible-md-block visible-xs-block\">\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"ttr_footer_bottom_footer\">\r\n");
      out.write("<div class=\"ttr_footer_bottom_footer_inner\">\r\n");
      out.write("<div class=\"ttr_footershape1\">\r\n");
      out.write("<div class=\"html_content\"><p>&nbsp;</p></div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"ttr_footershape2\">\r\n");
      out.write("<div class=\"html_content\"><p>&nbsp;</p></div>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"ttr_copyright\">\r\n");
      out.write("<a href=\"http://www.kixgo.com/\">\r\n");
      out.write("Designed by KixGO\r\n");
      out.write("</a><a href=\"http://www.kixgo.com/\">Website Builder\r\n");
      out.write("</a>\r\n");
      out.write("</div>\r\n");
      out.write("<a href=\"#\" class=\"ttr_footer_facebook\" target=\"_self\" >\r\n");
      out.write("</a>\r\n");
      out.write("<a href=\"#\"class=\"ttr_footer_twitter\" target=\"_self\" >\r\n");
      out.write("</a>\r\n");
      out.write("<a href=\"#\"class=\"ttr_footer_googleplus\" target=\"_self\" >\r\n");
      out.write("</a>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</footer>\r\n");
      out.write("</div>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("WebFontConfig = {\r\n");
      out.write("google: { families: [ 'Roboto+Slab:700','Roboto+Slab'] }\r\n");
      out.write("};\r\n");
      out.write("(function() {\r\n");
      out.write("var wf = document.createElement('script');\r\n");
      out.write("wf.src = ('https:' == document.location.protocol ? 'https' : 'http') + '://ajax.googleapis.com/ajax/libs/webfont/1.0.31/webfont.js';\r\n");
      out.write("wf.type = 'text/javascript';\r\n");
      out.write("wf.async = 'true';\r\n");
      out.write("var s = document.getElementsByTagName('script')[0];\r\n");
      out.write("s.parentNode.insertBefore(wf, s);\r\n");
      out.write("})();\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
