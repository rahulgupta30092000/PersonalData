<%@include file="Db.jsp" %>

<% 
       
   
	 
		
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String gender=request.getParameter("r");
		
		String mobile=request.getParameter("mobile");
		String address=request.getParameter("address");
		
		
			String qr="insert into user values(?,?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(qr);
			ps.setString(1, name);
			ps.setString(2, email);
			ps.setString(3, password);
			ps.setString(4, gender);
			ps.setString(5, mobile);
			ps.setString(6, address);
			
			int i=ps.executeUpdate();
			
			
			if(i>0){
				out.println("<script>window.alert('registered')</script>");
				response.sendRedirect("ForUser.html");
				
			}
			else{
				out.println("not successfully signed up of user");
			}
			con.close();
		
		
		%>
	
