<%@include file="Db.jsp"%>

<%


String name=request.getParameter("name");
String email=request.getParameter("email");
String password=request.getParameter("pwd");
String sertype=request.getParameter("sertype");
String mobile=request.getParameter("mobile");
String charge=request.getParameter("charges");
String area=request.getParameter("area");

int charges=Integer.parseInt(charge);

String status="No";



	
	String qr="insert into serviceprovider values(?,?,?,?,?,?,?,?)";
	PreparedStatement ps=con.prepareStatement(qr);
	ps.setString(1, name);
	ps.setString(2, email);
	ps.setString(3, password);
	ps.setString(4, sertype);
	ps.setString(5,mobile);
	ps.setInt(6,charges);
	ps.setString(7, area);
	ps.setString(8,status);
	int i=ps.executeUpdate();
	
	if(i>0){
		out.println("<script>if(confirm(\"successfully registerd\"))</script>");
		response.sendRedirect("serviceproregis.html");
		
		
		//out.println("Added successfully");
	}
	else{
		out.println("not added");
	}
	
	

  con.close();

%>