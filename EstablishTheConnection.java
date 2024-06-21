package raj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EstablishTheConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","Rajesh");
		System.out.println("2nd step done");
	}

}
