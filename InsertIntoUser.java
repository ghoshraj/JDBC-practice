package raj;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertIntoUser {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Entere id");
		int id = sc.nextInt();
		System.out.println("Enter name");
		String name = sc.next();
		System.out.println("Enter email");
		String email = sc.next();
		System.out.println("Enter password");
		String password = sc.next();
		
		Connection con = Helper.getc();
		PreparedStatement ps = con.prepareStatement("insert into user values (? ,? ,? ,?)");
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setString(3, email);
		ps.setString(4, password);
		ps.execute();
		
		System.out.println("Done bro");
	}

}
