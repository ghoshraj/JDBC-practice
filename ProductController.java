package raj;

import java.sql.SQLException;
import java.util.Scanner;

public class ProductController {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		System.out.println("Enter 1 for save product");
		System.out.println("Enter 2 for findproduct");
		System.out.println("Enter 3 for displayallproduct");
		System.out.println("Enter 4 for updateproductbyid");
		System.out.println("Enter 5 for deleteproduct by id");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		switch (n) {
		case 1:
			ProductDao.saveproduct();
			break;
		case 2:
			ProductDao.findproductbyId();
			break;
		case 3:
			ProductDao.displayallproduct();
			break;
		case 4:
			ProductDao.updateproductbyid();;
			break;
		case 5:
			ProductDao.deleteproductbyId();;
			break;
		default:
			break;
		}
	}

}
