<%@include file="Db.jsp" %>



<% 
		String ueamil=request.getParameter("uemail");
String providerEmail=request.getParameter("providerEmail");
String datetime=request.getParameter("datetime");
		
			
		
			String qr="delete from bookingprovider where userEmail=? and providerEmail=? and datetime=?";
			PreparedStatement ps=con.prepareStatement(qr);
			ps.setString(1, ueamil);
			ps.setString(2, providerEmail);
			ps.setString(3, datetime);
			
			int i=ps.executeUpdate();
			RequestDispatcher rd=request.getRequestDispatcher("ViewBookingsUser.jsp");
			rd.include(request, response);
			if(i>0){
				out.println("<script>window.alert('sucessfull deleted')</script>");
			}
			else{
				out.println("unable to delete");
			}
			con.close();
		
	
	%>