package raj;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteDataDynamically {
	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id : ");
		int id = sc.nextInt();
		
		Connection con = Helper.getc();
		PreparedStatement ps = con.prepareStatement("delete from student where id = ?");
      	ps.setInt(1, id);
		
      	ps.execute();
      	System.out.println("done bro .....");
	}


}
