package raj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDataIntoTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","Rajesh");
		Statement st = con.createStatement();
		st.execute("insert into student values(1,'Rajesh',22)");
		st.execute("insert into student values(2,'Rajesh',23)");
		st.execute("insert into student values(3,'Rajesh',24)");

		System.out.println("done");
	}
}
