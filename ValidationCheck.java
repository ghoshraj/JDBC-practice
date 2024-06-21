package raj;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ValidationCheck {
public static void main(String[] args) throws SQLException {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter email :");
	String email = sc.next();
	System.out.println("Enter password ");
	String password = sc.next();
	
	Connection con = Helper.getc();
	PreparedStatement ps = con.prepareStatement("select * from user where email = ? and password = ? ");
	ps.setString(1, email);
	ps.setString(2, password);
	
	ResultSet rs = ps.executeQuery();
	
	if(rs.next()) {
		System.out.println("Welcome");
	}
	else {
		System.out.println("Wrong");
	}
}
}
