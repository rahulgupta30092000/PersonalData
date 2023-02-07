package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class jdbc2 {

	public static void main(String[] args) {
	try{	
	Class.forName("com.mysql.cj.jdbc.Driver");
	System.out.println("driver loaded");
	
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demoproject?autoReconnect=true&useSSL=false","root","Root");
	System.out.println("connection established");
	String str="insert into emps values(101,'jaya')";
	String str1="insert into emps values(102,'jay')";
	System.out.println("qurey inserted");
	Statement st=con.createStatement();
	int i=st.executeUpdate(str);
	int i1=st.executeUpdate(str1);
	System.out.println(i+" rows inserted");
	System.out.println(i1+" rows inserted");
	con.close();
	}catch(Exception e){
		e.printStackTrace();
	}

	}

}
