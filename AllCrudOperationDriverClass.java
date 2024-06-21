package raj;

import java.sql.SQLException;
import java.util.Scanner;

public class AllCrudOperationDriverClass {
	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the operation you want");
		int num = sc.nextInt();
		
		switch (num) {
		case 1:
			AllCrudOperationHelperClass.getadd();
			break;
			case 2 :
				AllCrudOperationHelperClass.getdata();
				break;
			case 3 :
				AllCrudOperationHelperClass.getupdate();
				break;
			case 4:
				AllCrudOperationHelperClass.getDelete();
				break;
		default:
			System.out.println("You choose the wrong operation");
			break;
		}
	}

}
