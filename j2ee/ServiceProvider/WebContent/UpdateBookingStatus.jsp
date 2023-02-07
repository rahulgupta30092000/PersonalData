<%@include file="Db.jsp" %>
<%@page errorPage="error.jsp" %>

<% 
	
String bookStatus=request.getParameter("status");
String providerEmail=request.getParameter("pemail");
String userEmail=request.getParameter("uemail");
		String dateTime=request.getParameter("datetime");




dateTime=dateTime.substring(0,dateTime.length()-1);
String qr="update bookingprovider set bookStatus= ? where providerEmail= ? and userEmail= ? and dateTime= ? ";
			PreparedStatement ps=con.prepareStatement(qr);
			ps.setString(1, bookStatus);
			ps.setString(2, providerEmail);
			ps.setString(3, userEmail);
			ps.setString(4, dateTime);
			int i=ps.executeUpdate();
			RequestDispatcher rd=request.getRequestDispatcher("ViewAllRequests.jsp");
			rd.include(request, response);
			if(i>0){
				out.println("<script>window.alert('Sucessfully updated')");
				
				//response.sendRedirect("serviceprohome.jsp");
			}
			else{
				out.println("unable to udpate");
			}
			con.close();
		
			%>	