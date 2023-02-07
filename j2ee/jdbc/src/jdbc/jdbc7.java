package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class jdbc7 {

public static void main(String []dk){
try{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demoproject?autoReconnect=true&&useSSL=false","root","Root");
	String qr="select * from emps";
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery(qr);
	if(rs.next()){
		do{
//System.out.println(rs.getInt(1)+" "+rs.getString(2));
			System.out.println(rs.getInt("id")+" "+rs.getString("name"));
			
		
	}while(rs.next());
	
	}
	else{
		System.out.println("no record found");
	}
	con.close();
	
}catch(Exception e){
	e.printStackTrace();
}
}

}
