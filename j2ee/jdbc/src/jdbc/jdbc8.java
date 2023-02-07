package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbc8 {
	public static void main(String []ad){
		try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demoproject?autoReconnect=true&&useSSL=false","root","Root");
		String qr="select * from emps";
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(qr);
		rs.beforeFirst();
		rs.afterLast();
		rs.first();
		rs.last();
		rs.absolute(2);
		rs.relative(1);
		rs.next();
		System.out.println(rs.getInt("id")+" "+rs.getString("name"));
		con.close();
	}catch(Exception e){
		e.printStackTrace();
	}
	}
}
