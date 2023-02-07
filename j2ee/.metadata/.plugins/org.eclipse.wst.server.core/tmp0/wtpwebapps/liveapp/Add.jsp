<%@page errorPage="error.jsp" %>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection" %>
<%@page import="java.sql.DriverManager" %>
<%
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demoproject?autoReconnect=true&&useSSL=false","root","Root");
String ids=request.getParameter("id");
String name=request.getParameter("name");
int id=Integer.parseInt(ids);
String status="no";
	String qr="insert into students values(?,?)";
	PreparedStatement ps=con.prepareStatement(qr);
	ps.setInt(1, id);
	ps.setString(2, name);
	int i=ps.executeUpdate();
	if(i>0)
	{
		out.println("sucessfully added");
	}
	else
	{
		out.println("not added");
	}
	con.close();
%>