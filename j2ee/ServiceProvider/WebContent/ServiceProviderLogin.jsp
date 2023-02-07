<%@include file="Db.jsp" %>

<% 

		String email=request.getParameter("email");
		String pwd=request.getParameter("pwd");
			String sql="select * from  serviceprovider where email=? and password=? and status='yes' ";
			
			PreparedStatement ps=con.prepareStatement(sql);
			
			ps.setString(1, email);
			ps.setString(2, pwd);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				 session=request.getSession();
				session.setAttribute("id", email);
				response.sendRedirect("ServiceProHome.jsp");
			}
			
			else
			{
				out.println("<script>window.alert('Invalid id and password');</script>");
				response.sendRedirect("index.html");
				
			}
			con.close();
		
	

%>