package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;



public class jdbc5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int id=sc.nextInt();
		System.out.println("enter name");
		String name=sc.next();
	try{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demoproject?autoReconnect=true&&useSSL=false","root","Root");
	String qr="insert into emps values(?,?)";
	PreparedStatement ps=con.prepareStatement(qr);
	ps.setInt(1, id);
	ps.setString(2, name);
	int i=ps.executeUpdate();
	System.out.println(i+" added");
	con.close();
	
	}catch(Exception e){
		e.printStackTrace();
	}
	}

}
