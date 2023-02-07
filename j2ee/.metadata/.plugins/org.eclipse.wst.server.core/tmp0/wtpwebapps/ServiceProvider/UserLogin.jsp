<%@include file="Db.jsp" %>

<% 
	

	String email=request.getParameter("email");
	String password=request.getParameter("password");
	
		String qr="select * from user where email=? and password=?";
		PreparedStatement ps=con.prepareStatement(qr);
		ps.setString(1,email);
		ps.setString(2, password);
		ResultSet rs=ps.executeQuery();
		if(rs.next()){
			
			session.setAttribute("Uid", email);
			response.sendRedirect("UserHome.jsp");
		}else{
			
			RequestDispatcher rd=request.getRequestDispatcher("index.html");
			rd.include(request, response);
			out.println("<script>window.alert('Invalid id and password');</script>");
		}
		con.close();
		
	
	%>
