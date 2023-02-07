<%@page errorPage="error.jsp"%>
<%@include file="Db.jsp"%>
<%
String ueamil=request.getParameter("uemail");
String providerEmail=request.getParameter("providerEmail");
String datetime=request.getParameter("datetime");
	
		String bookStatus="completed";
	
		String qr="update bookingprovider set bookStatus=? where userEmail=? and providerEmail=? and datetime=?";
		PreparedStatement ps=con.prepareStatement(qr);
		ps.setString(1, bookStatus);
		ps.setString(2, ueamil);
		ps.setString(3, providerEmail);
		ps.setString(4, datetime);
		
		int i=ps.executeUpdate();
		RequestDispatcher rd=request.getRequestDispatcher("ViewBookingsUser.jsp");
		rd.include(request, response);
		if(i>0){
			out.println("<script>window.alert('status updated ')</script>");
		}
		else{
			out.println("unable to delete");
		}
		con.close();
%>