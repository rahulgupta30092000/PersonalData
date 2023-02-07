

<%@include file="Db.jsp" %>



<% 
		String email=request.getParameter("email");
		
		
			
		
			String qr="delete from user where email=?";
			PreparedStatement ps=con.prepareStatement(qr);
			ps.setString(1, email);
			int i=ps.executeUpdate();
			RequestDispatcher rd=request.getRequestDispatcher("ShowAllUser.jsp");
			rd.include(request, response);
			if(i>0){
				out.println("<script>window.alert('sucessfully deleted')</script>");
			}
			else{
				out.println("unable to delete");
			}
			con.close();
		
	
	%>
