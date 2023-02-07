package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class jdbc10 {
public static void main(String []ak){
Scanner sc=new Scanner(System.in);
System.out.println("Press 1 for search by roll number");
System.out.println("Press 2 for search branch");
System.out.println("Press 3 for search by year");
System.out.println("Press 4 for search by semister");
int sch=sc.nextInt();


try{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demoproject?autoReconnect=true&&useSSL=false","root","Root");




if(sch==1){
	System.out.println("enter roll number ");
	int roll=sc.nextInt();
	String qr="select * from student where enrollment=?";
	PreparedStatement ps=con.prepareStatement(qr);
	ps.setInt(1, roll);
	ResultSet rs=ps.executeQuery();
	
if(rs.next()){
	
	System.out.println(rs.getInt("enrollment")+" "+rs.getString("name")+" "+rs.getString("branch")+" "+rs.getInt("year")+" "+rs.getInt("semister"));

}
else{
	System.out.println("no record found");
}
}

else if(sch==2){ 
	System.out.println("enter branch  ");
	String  branch=sc.next();
	String qr="select * from student where branch=?";
	PreparedStatement ps=con.prepareStatement(qr);
	ps.setString(1, branch);
	ResultSet rs=ps.executeQuery();
	
if(rs.next()){
	do{
	System.out.println(rs.getInt("enrollment")+" "+rs.getString("name")+" "+rs.getString("branch")+" "+rs.getInt("year")+" "+rs.getInt("semister"));
	}while(rs.next());
}
else{
	System.out.println("no record found");
}
}


else if(sch==3){
	System.out.println("enter year ");
	int year=sc.nextInt();
	String qr="select * from student where year=?";
	PreparedStatement ps=con.prepareStatement(qr);
	ps.setInt(1, year);
	ResultSet rs=ps.executeQuery();
	
if(rs.next()){
	do{
	System.out.println(rs.getInt("enrollment")+" "+rs.getString("name")+" "+rs.getString("branch")+" "+rs.getInt("year")+" "+rs.getInt("semister"));
}while(rs.next());
}
else{
	System.out.println("no record found");
}
}



else if(sch==4){
	System.out.println("enter semister ");
	int semister=sc.nextInt();
	String qr="select * from student where semister =?";
	PreparedStatement ps=con.prepareStatement(qr);
	ps.setInt(1, semister);
	ResultSet rs=ps.executeQuery();
	
if(rs.next()){
	do{
	
	System.out.println(rs.getInt("enrollment")+" "+rs.getString("name")+" "+rs.getString("branch")+" "+rs.getInt("year")+" "+rs.getInt("semister"));
	}while(rs.next());
}
else{
	System.out.println("no record found");
}
}
}catch(Exception e){
	e.printStackTrace();
}

}
}
