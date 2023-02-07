package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;


public class jdbc11 {
	
	public static void main(String []dk){
		Scanner sc=new Scanner(System.in);
		 int ch1 = 0,ch2=0;
		System.out.println("Press 1 for udpate");
		System.out.println("Press 2 for delete");
		System.out.println("Press 3 for insert");
		System.out.println("Press 4 for see table");
		int ch=sc.nextInt();
		
		if(ch==1){
		
		        System.out.println("Press 1 for name update");
				System.out.println("Press 2 for  branch update");
				System.out.println("Press 3 for year update");
				System.out.println("Press 4 for semister update");
				ch1=sc.nextInt();
			 
		}
		else if(ch==2){
			System.out.println("Press 1 for id delete");
			System.out.println("Press 2 for name delete");
			ch2=sc.nextInt();
		}
		
		
		
		
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demoproject?autoReconnect=true&&useSSL=false","root","Root");
		
		
		
		if(ch1==1){
			System.out.println("enter roll number");
			int roll=sc.nextInt();
	
				System.out.println("enter name for update");
				String name=sc.next();
				String qr="update student set name = ? where enrollment = ?";
				PreparedStatement ps=con.prepareStatement(qr);
				
				ps.setString(1,name);
				ps.setInt(2, roll);
				
				ps.executeUpdate();
				System.out.println("updated");
				
				System.out.println("*******Remaining queries********");
				String qrr="select * from student";
				PreparedStatement ps1=con.prepareStatement(qrr);
				ResultSet rs=ps1.executeQuery();
				if(rs.next()){
					do{
					System.out.println(rs.getInt("enrollment")+" "+rs.getString("name")+" "+rs.getString("branch")+" "+rs.getInt("year")+" "+rs.getInt("semister"));
					}while(rs.next());
				}
				else{
					System.out.println("no record found");
				}
				}
	
			
			else if(ch1==2){
				System.out.println("enter roll number");
				int roll=sc.nextInt();
		
				System.out.println("enter branch for update");
				String branch=sc.next();
				String qr="update student set branch = ? where enrollment = ?";
				PreparedStatement ps=con.prepareStatement(qr);
				
				ps.setString(1,branch);
				ps.setInt(2, roll);
				
				ps.executeUpdate();
				System.out.println("updated");
				
				System.out.println("*******Remaining queries********");
				String qrr="select * from student";
				PreparedStatement ps1=con.prepareStatement(qrr);
				ResultSet rs=ps1.executeQuery();
				if(rs.next()){
					do{
					System.out.println(rs.getInt("enrollment")+" "+rs.getString("name")+" "+rs.getString("branch")+" "+rs.getInt("year")+" "+rs.getInt("semister"));
					}while(rs.next());
				}
				else{
					System.out.println("no record found");
				}
				
			
		}
			
			else if(ch1==3){
				System.out.println("enter roll number");
				int roll=sc.nextInt();
		
				System.out.println("enter year for update");
				String year=sc.next();
				String qr="update student set year = ? where enrollment = ?";
				PreparedStatement ps=con.prepareStatement(qr);
				
				ps.setString(1,year);
				ps.setInt(2, roll);
				
				ps.executeUpdate();
				System.out.println("updated");
				
				System.out.println("*******Remaining queries********");
				String qrr="select * from student";
				PreparedStatement ps1=con.prepareStatement(qrr);
				ResultSet rs=ps1.executeQuery();
				if(rs.next()){
					do{
					System.out.println(rs.getInt("enrollment")+" "+rs.getString("name")+" "+rs.getString("branch")+" "+rs.getInt("year")+" "+rs.getInt("semister"));
					}while(rs.next());
				}
				else{
					System.out.println("no record found");
				}
				
			
		}
			else if(ch1==4){
				System.out.println("enter roll number");
				int roll=sc.nextInt();
		
				System.out.println("enter semister for update");
				String semister=sc.next();
				String qr="update student set semister = ? where enrollment = ?";
				PreparedStatement ps=con.prepareStatement(qr);
				
				ps.setString(1,semister);
				ps.setInt(2, roll);
				
				ps.executeUpdate();
				System.out.println("updated");
				
				System.out.println("*******Remaining queries********");
				String qrr="select * from student";
				PreparedStatement ps1=con.prepareStatement(qrr);
				ResultSet rs=ps1.executeQuery();
				if(rs.next()){
					do{
					System.out.println(rs.getInt("enrollment")+" "+rs.getString("name")+" "+rs.getString("branch")+" "+rs.getInt("year")+" "+rs.getInt("semister"));
					}while(rs.next());
				}
				else{
					System.out.println("no record found");
				}
				
			
		}
		
		if(ch2==1){
			System.out.println("enter roll number");
		 int roll=sc.nextInt();
		String qr="delete from student where enrollment = ?";
		PreparedStatement ps=con.prepareStatement(qr);
		ps.setInt(1,roll);
		
		ps.executeUpdate();
		System.out.println("Deleted");
		
		System.out.println("*******Remaining queries********");
		String qrr="select * from student";
		PreparedStatement ps1=con.prepareStatement(qrr);
		ResultSet rs=ps1.executeQuery();
		if(rs.next()){
			do{
			System.out.println(rs.getInt("enrollment")+" "+rs.getString("name")+" "+rs.getString("branch")+" "+rs.getInt("year")+" "+rs.getInt("semister"));
			}while(rs.next());
		}
		else{
			System.out.println("no record found");
		}
		}
		
		
		else if(ch2==2){
			System.out.println("enter name ");
		 String  name=sc.next();
		String qr="delete from student where name = ?";
		PreparedStatement ps=con.prepareStatement(qr);
		ps.setString(1,name);
		
		ps.executeUpdate();
		System.out.println("Deleted");
		System.out.println("*******Remaining queries********");
		
		String qrr="select * from student";
		PreparedStatement ps1=con.prepareStatement(qrr);
		ResultSet rs=ps1.executeQuery();
		if(rs.next()){
			do{
			System.out.println(rs.getInt("enrollment")+" "+rs.getString("name")+" "+rs.getString("branch")+" "+rs.getInt("year")+" "+rs.getInt("semister"));
			}while(rs.next());
		}
		else{
			System.out.println("no record found");
		}
		}
	
		if(ch==3){
			System.out.println("enter id ");
			int roll=sc.nextInt();
			System.out.println("enter name ");
			 String  name=sc.next();
			 System.out.println("enter branch");
			 String  branch=sc.next();
			 System.out.println("enter year ");
			 int  year=sc.nextInt();
			 System.out.println("enter semister");
			 int semister=sc.nextInt();
			 
			String qr="insert into student values(?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(qr);
			ps.setInt(1,roll);
			ps.setString(2, name);
			ps.setString(3,branch);
			ps.setInt(4,year);
			ps.setInt(5,semister);
			
			
			ps.executeUpdate();
			System.out.println("query inserted");
			System.out.println("*******Remaining queries********");
			
			String qrr="select * from student";
			PreparedStatement ps1=con.prepareStatement(qrr);
			ResultSet rs=ps1.executeQuery();
			if(rs.next()){
				do{
				System.out.println(rs.getInt("enrollment")+" "+rs.getString("name")+" "+rs.getString("branch")+" "+rs.getInt("year")+" "+rs.getInt("semister"));
				}while(rs.next());
			}
			else{
				System.out.println("no record found");
			}
			}
		
			
		if(ch==4){
			String qr="select * from student";
			PreparedStatement ps=con.prepareStatement(qr);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				do{
					System.out.println(rs.getInt("enrollment")+" "+rs.getString("name")+" "+rs.getString("branch")+" "+rs.getInt("year")+" "+rs.getInt("semister"));
				}while(rs.next());
			}else{
				System.out.println("no record found");
			}
		}
			
		con.close();
		
	}catch(Exception e){
		e.printStackTrace();
	}
	}
	}

	


