package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatement1 {
	
	public static void main(String[] args) throws SQLException {
		
		
		Connection con;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcpracdb", "root", "root");
			PreparedStatement pst = con.prepareStatement("Insert into employee( Firstname, Lastname) values (?,?)");
			
			pst.setString(1, "Vishal");
			pst.setString(2, "Kawanpure");
			
			
			int i = pst.executeUpdate();
			
			System.out.println("Record Inserted...."+ i);
			
			con.close();
			pst.close();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}

}
