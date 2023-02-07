package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class jdbc9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int id=sc.nextInt();
		try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demoproject?autoReconnect=true&&useSSL=false","root","Root");
		String qr="select * from emps where id=?";
		PreparedStatement ps=con.prepareStatement(qr);
		ps.setInt(1,id);
		ResultSet rs=ps.executeQuery();
		if(rs.next()){
		System.out.println(rs.getInt("id")+" "+rs.getString("name"));	
		}
		else{
			System.out.println("no records found");
		}
			con.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
