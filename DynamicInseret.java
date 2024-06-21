package raj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DynamicInseret {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ID :");
		int id = sc.nextInt();
		System.out.println("Enter Name");
		String name = sc.next();
		System.out.println("Enter age");
		int age = sc.nextInt();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","Rajesh");
            PreparedStatement ps = con.prepareStatement("insert into student (id ,name ,age)values (?,?,?)");
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setInt(3, age);
            ps.execute();
            System.out.println("Done");
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
