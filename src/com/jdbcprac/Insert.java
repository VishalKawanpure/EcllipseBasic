package com.jdbcprac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {
	
	
	
	public static void main(String[] args) throws SQLException {
		String query= "insert into stud2 (name, city) values ('Ram', 'Pune')";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcpracdb", "root", "root");
			
			Statement statement = connection.createStatement();
			
			 statement.execute(query);
			
			System.out.println("Record inserted");
			
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
