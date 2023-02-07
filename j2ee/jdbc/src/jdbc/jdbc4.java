package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class jdbc4 {
public static void main(String []ad){
Scanner sc=new Scanner(System.in);
System.out.println("enter id to be deleted");
int id=sc.nextInt();
try{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demoproject?autoReconnect=true&&useSSL=false","root","Root");
Statement st=con.createStatement();
String qr="delete from emps where id ="+id;
int i=st.executeUpdate(qr);
System.out.println(i+" row deleted");

}catch(Exception e){
	e.printStackTrace();
	
}
}
}
