<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page errorPage="error.jsp" %>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection" %>
<%@page import="java.sql.DriverManager" %>
<%
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demoproject?autoReconnect=true&&useSSL=false","root","Root");
	String qr="select * from students";
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery(qr);
	if(rs.next())
	{
		do
		{
			int id=rs.getInt("id");
			String name=rs.getString("name");
			%>
			<div><%=id %> <%=name %><hr></div>
			<%
		}while(rs.next());
	}
	else
	{
		out.println("no records found");
	}
	con.close();
%>