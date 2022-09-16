package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertByStatement1 {
	
	public static void main(String[] args) throws SQLException {
		
		Connection con;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcpracdb", "root", "root");
			
			Statement statement = con.createStatement();
			
			String sql= "Insert into employee( Firstname, Lastname) values ( 'ram', 'pawar')";
			
			statement.execute(sql);
			System.out.println("Record Inserted");
			
			con.close();
			statement.close();
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
	}

}
