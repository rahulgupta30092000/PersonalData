package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class jdbc3 {
	public static void main(String []akd){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int id=sc.nextInt();
		System.out.println("enter name");
		String name=sc.next();
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demoproject?autoReconnect=true&&useSSL=false","root","Root");
			Statement st=con.createStatement();
			String  qr="insert into emps values("+id+",'"+name+"')";
			int i=st.executeUpdate(qr);
			System.out.print(i+"rows update");
			con.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
