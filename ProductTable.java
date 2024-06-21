package raj;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductTable {
	public static void main(String[] args) throws SQLException {
		Connection con = Helper.getc();
		Statement st = con.createStatement();
		st.execute("create table product (id int,brand varchar(25) , cateogory varchar(25), cost int)");
		System.out.println("Table is created");
	}
}
