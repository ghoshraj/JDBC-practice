package raj;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ProductDao {
	
	public static void saveproduct() throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter id : ");
		int id = sc.nextInt();
		System.out.print("Enter brand : ");
		String brand = sc.next();
		System.out.println("Enter catagory : ");
		String catagory = sc.next();
		System.out.print("Enter cost : ");
		int cost = sc.nextInt();
		
		try {
			Connection con = Helper.getc();
            PreparedStatement ps = con.prepareStatement("insert into product (id ,brand ,cateogory, cost)values (?,?,?,?)");
            ps.setInt(1, id);
            ps.setString(2, brand);
            ps.setString(3, catagory);
            ps.setInt(4, cost);
            ps.executeUpdate();
            System.out.println("Done");
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	
	public static ResultSet findproductbyId() throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id : ");
		int id = sc.nextInt();
		
		Connection con = Helper.getc();
		PreparedStatement ps = con.prepareStatement("select * from product where id = ?");
		ps.setInt(1, id);
		
		ResultSet rs = ps.executeQuery();
		if(rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getInt(4));
			return rs;
		}
		else {
			System.out.println("Not available");
		}
		return null;
	}
	
	public static ResultSet displayallproduct() throws SQLException {
		
		Connection con = Helper.getc();
		PreparedStatement ps = con.prepareStatement("select * from product");
		
		ResultSet rs = ps.executeQuery();
		if(rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getInt(4));
			return rs;
		}
		else {
			System.out.println("Not available");
		}
		return null;
	}
	
	public static void updateproductbyid() throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id : ");
		int id = sc.nextInt();
		System.out.println("Enter brand : ");
		String brand = sc.next();
		System.out.println("Enter catagory :");
		String catagory = sc.next();
		System.out.println("Enter cost : ");
		int cost = sc.nextInt();
		
		Connection con = Helper.getc();
		PreparedStatement ps = con.prepareStatement("update product set cost = ?, cateogory = ? , brand = ? where id = ? ");
		ps.setInt(1, cost);
		ps.setString(2, catagory);
		ps.setString(3, brand);
      	ps.setInt(4, id);
		
      	ps.execute();
      	System.out.println("done bro .....");
	}
	
	
	public static void deleteproductbyId() throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id : ");
		int id = sc.nextInt();
		
		Connection con = Helper.getc();
		PreparedStatement ps = con.prepareStatement("delete from product where id = ?");
      	ps.setInt(1, id);
		
      	ps.execute();
      	System.out.println("done bro .....");
	}

}
