/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.15
 * Generated at: 2022-10-10 18:12:11 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public final class ViewAllAcceptRequests_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/Db.jsp", Long.valueOf(1663953022591L));
  }

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
      			"error.jsp", true, 8192, true);
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
      out.write("<li class=\"ttr_menu_items_parent dropdown\"><a href=\"Adminhome.jsp\" class=\"ttr_menu_items_parent_link\"><span class=\"menuchildicon\"></span>Back</a>\r\n");
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
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div style=\"text-align:center ;margin-left:auto;margin-right:auto;\" a>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/serviceprovider?autoReconnect=true&&useSSL=false","root","Root");

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");


String email=(String )session.getAttribute("id");
String qr="select u.name as uname,u.email as uemail,u.address as userAddress ,datetime,bookstatus from serviceprovider s,user u,bookingprovider where providerEmail=s.email and userEmail=u.email and bookstatus='accept' and s.email=?";
PreparedStatement ps=con.prepareStatement(qr);
ps.setString(1, email);
ResultSet rs=ps.executeQuery();
if(rs.next()){
	
      out.write("\r\n");
      out.write("\t<table align=\"center\" border=\"1px\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<th>User Name</th>\r\n");
      out.write("\t<th>Date and Time of Booking</th>\r\n");
      out.write("\t<th>user address</th>\r\n");
      out.write("\t<th>Booking status</th>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t\r\n");
      out.write("\t");
 
	do{
		String name=rs.getString("uname");
		String userEmail=rs.getString("uEmail");
		String dateTime=rs.getString("dateTime");
		String address=rs.getString("userAddress");
		String bookstatus=rs.getString("bookStatus");
		
      out.write("\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t<td>");
      out.print(name );
      out.write("</td>\r\n");
      out.write("\t\t<td>");
      out.print(dateTime );
      out.write("</td>\r\n");
      out.write("\t\t<td>");
      out.print(address );
      out.write("</td>\r\n");
      out.write("\t\t<td>");
      out.print(bookstatus );
      out.write("</td>\r\n");
      out.write("\t\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t");
 
	}while(rs.next());
	
      out.write("\r\n");
      out.write("\t</table>\r\n");
      out.write("\t");
 
}
else{
	out.println("no accpet request found");
}
con.close();

      out.write(" \r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
      out.write("\r\n");
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
