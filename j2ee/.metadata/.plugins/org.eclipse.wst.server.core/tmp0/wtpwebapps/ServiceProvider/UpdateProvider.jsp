<%@page errorPage="error.jsp" %>
<%@include file="Db.jsp"%>
<%
String email=request.getParameter("email");
String name=request.getParameter("name");
String mobile=request.getParameter("mobile");
String password=request.getParameter("password");
String sertype=request.getParameter("sertype");
String area=request.getParameter("area");
String ch=request.getParameter("charges");
int charges=Integer.parseInt(ch);
String qr="update serviceprovider set name=?,mobile=?,password=?,sertype=?,area=?,charges=? where email=?";
PreparedStatement ps=con.prepareStatement(qr);
ps.setString(1, name);
ps.setString(2, mobile);
ps.setString(3, password);
ps.setString(4, sertype);
ps.setString(5, area);
ps.setInt(6,charges);
ps.setString(7, email);
int i=ps.executeUpdate();
RequestDispatcher rd=request.getRequestDispatcher("ServiceProHome.jsp");
rd.include(request, response);
if(i>0){

out.println("<script>window.alert('updated successfully');</script>");

	}
else
{
response.sendRedirect("EditServiceproviderProfile.jsp");
}
%>