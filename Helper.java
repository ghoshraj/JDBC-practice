package raj;

import java.sql.Connection;
import java.sql.DriverManager;

public class Helper {
	
	public static Connection getc() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","Rajesh");
			return con;
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}

}
