package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PreparedStatement {
	
	public static void main(String[] args) throws SQLException {
		
		Connection con;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcpracdb", "root", "root");
			
			java.sql.PreparedStatement pst = con.prepareStatement("Insert into Employees (Username, Password) values ( ?, ?)");
			
			pst.setString(1, "admin");
			pst.setString(2,  "admin@123");
			
			
			int i= pst.executeUpdate();
			
			System.out.println("Record Inserted....."+ i);
			
			
			
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}

}
