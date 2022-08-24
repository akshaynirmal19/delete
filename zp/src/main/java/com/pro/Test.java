package com.pro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","NIRMAL@131572");
			

			
//			Scanner sc = new Scanner(System.in);
//			
//			System.out.println("Enter order_id");
//			int order_id = sc.nextInt();
//			
//			
//			System.out.println("Enter order_name");
//			String order_name = sc.next();
//			
//			System.out.println("Enter order_date");
//			String order_date = sc.next();
//			
//			System.out.println("Enter dispatch_date");
//			String dispatch_date = sc.next();
//			
//			System.out.println("Enter delivery_date");
//			String delivery_date = sc.next();
			
			
			PreparedStatement ps = conn.prepareStatement("ALTER TABLE order_details Drop delivery_date");
			
//			ps.setInt(1, order_id);
//			ps.setString(2, order_name);
//			ps.setString(3, order_date);
//			ps.setString(4, dispatch_date);
//			ps.setString(5, delivery_date);
			
			int a = ps.executeUpdate();
			System.out.println("A column from the table is deleted.");
			
			
			
		}catch(Exception e){
			
			e.printStackTrace();
			
			
		}
		
		
		

	}

}
