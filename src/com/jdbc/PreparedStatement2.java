package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatement2 {
	
	public static void main(String[] args) throws SQLException {
		
		Connection con;
		String sql= "Insert into employee (Firstname, Lastname) values (?, ?)";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcpracdb", "root", "root");
		
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, "Ravi");
		pst.setString(2,  "Rane");
		
		int a= pst.executeUpdate();
		
		System.out.println("record inserted...."+ a);
		
		
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}

}
