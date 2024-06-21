package raj;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchProcessing {
	public static void main(String[] args) throws SQLException {
		Connection con = Helper.getc();
		Statement st = con.createStatement();
		st.addBatch("insert into student values (5,'rrr',25)");
		st.addBatch("insert into student values (6,'aaa',26)");
		st.addBatch("insert into student values (7,'ryy',22)");
		st.addBatch("delete from student where id = 7");
		st.executeBatch();
	}
}
