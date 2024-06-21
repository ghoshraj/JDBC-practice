package raj;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AllCrudOperationHelperClass {
	
	//Adding the data
	public static PreparedStatement getadd() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter id : ");
		int id = sc.nextInt();
		System.out.print("Enter name : ");
		String name = sc.next();
		System.out.print("Enter age : ");
		int age = sc.nextInt();
		
		try {
			Connection con = Helper.getc();
            PreparedStatement ps = con.prepareStatement("insert into student (id ,name ,age)values (?,?,?)");
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setInt(3, age);
            ps.execute();
            System.out.println("Done");
            return ps;
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}
	
	//fetch the data 
	public static void getdata() throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id : ");
		int id = sc.nextInt();
		
		Connection con = Helper.getc();
		PreparedStatement ps = con.prepareStatement("select * from student where id = ?");
		ps.setInt(1, id);
		
		ResultSet rs = ps.executeQuery();
		if(rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getInt(3));
		}
		else {
			System.out.println("Not available");
		}
	}
	
	//update data
	public static PreparedStatement getupdate() throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id : ");
		int id = sc.nextInt();
		System.out.println("Enter Name : ");
		String name = sc.next();
		System.out.println("Enter age : ");
		int age = sc.nextInt();
		
		Connection con = Helper.getc();
		PreparedStatement ps = con.prepareStatement("update student set name = ? , age = ? where id = ? ");
		ps.setString(1, name);
		ps.setInt(2, age);
      	ps.setInt(3, id);
		
      	ps.execute();
      	System.out.println("done bro .....");
      	return ps;
	}
	
	//delete the data --
	public static PreparedStatement getDelete() throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id : ");
		int id = sc.nextInt();
		
		Connection con = Helper.getc();
		PreparedStatement ps = con.prepareStatement("delete from student where id = ?");
      	ps.setInt(1, id);
		
      	ps.execute();
      	System.out.println("done bro .....");
      	return ps;
	}
}
