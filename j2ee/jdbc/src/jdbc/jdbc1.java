package jdbc;

import java.sql.Connection;

import java.sql.DriverManager;

public class jdbc1 {

	public static void main(String[] args) {
		try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver loaded");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demoproject?autoReconnect=true&useSSL=false","root","Root");
		System.out.println("connection esbtalished");
		String qr="insert into emps values(101,'jaya')";
		System.out.println("query inserted");
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
