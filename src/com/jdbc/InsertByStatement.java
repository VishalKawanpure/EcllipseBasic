package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertByStatement {
	
	public static void main(String[] args) throws SQLException {
		
		Connection con;
		try {
			
			String sql= "Insert into Student1( LastName, FirstName) values ('Kawanpure', 'Vishal')";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcpracdb", "root", "root");
			Statement statement = con.createStatement();
			statement.execute(sql);
			System.out.println("Inserted Successfully...");
		} catch (ClassNotFoundException e) {
			
			
			e.printStackTrace();
		}
		
		
		
	}
	

}
