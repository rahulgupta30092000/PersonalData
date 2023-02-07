package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class jdbc6 {
public static void main(String []aj){
Scanner sc=new Scanner(System.in);
System.out.println("enter id for delete ");
int id=sc.nextInt();

try{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demoproject?autoReconncet=true&&useSSL=false","root","Root");
String qr="delete from emps where id = ?";
PreparedStatement ps=con.prepareStatement(qr);
ps.setInt(1, id);
int i=ps.executeUpdate();
System.out.println(i+" row deleted");
}catch(Exception e){

e.printStackTrace();
}
}
}
