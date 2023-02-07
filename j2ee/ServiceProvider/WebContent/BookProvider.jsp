<%@include file="Db.jsp"%>
<%
String email=(String)session.getAttribute("Uid");
String providerEmail=request.getParameter("providerEmail");
String dateTime=request.getParameter("dt");
String name=request.getParameter("name");
String qr="insert into bookingprovider values(?,?,?,?)";
PreparedStatement ps=con.prepareStatement(qr);
ps.setString(1,providerEmail);
ps.setString(2,email);
ps.setString(3, dateTime);
ps.setString(4, "pending");
int i=ps.executeUpdate();
RequestDispatcher rd=request.getRequestDispatcher("UserHome.jsp");
rd.include(request, response);
if(i>0){
	out.println("<script>window.alert('booked successfully');</script>");
}
else{
	out.println("<script>window.alert('Server Down');</script>");
}
con.close();
%>