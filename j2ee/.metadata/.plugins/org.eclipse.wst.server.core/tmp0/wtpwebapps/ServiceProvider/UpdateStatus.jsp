<%@include file="Db.jsp" %>




<% 
	
		
	
		String email=request.getParameter("email");
		
			String qr="update serviceprovider set status='yes' where email=?";
			PreparedStatement ps=con.prepareStatement(qr);
			ps.setString(1, email);
			int i=ps.executeUpdate();
			RequestDispatcher rd=request.getRequestDispatcher("Show.jsp");
			if(i>0){
				out.println("Sucessfully updated");
			}
			else{
				out.println("unable to udpate");
			}
			con.close();
		
			%>	
		