
<%@page import="java.sql.PreparedStatement"%>
<%@include file="Db.jsp" %>



<% 
		String email=request.getParameter("email");
		
		
			
		
			String qr="delete from serviceprovider where email=?";
			PreparedStatement ps=con.prepareStatement(qr);
			ps.setString(1, email);
			int i=ps.executeUpdate();
			RequestDispatcher rd=request.getRequestDispatcher("Show.jsp");
			rd.include(request, response);
			if(i>0){
				out.println("sucessfully deleted");
			}
			else{
				out.println("unable to delete");
			}
			con.close();
		
	
	%>
