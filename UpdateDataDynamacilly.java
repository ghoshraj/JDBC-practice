package raj;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateDataDynamacilly {
	public static void main(String[] args) throws SQLException {
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
	}

}
