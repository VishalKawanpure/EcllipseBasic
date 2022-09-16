package com.jdbcprac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RetriveByPrepared {
	
	public static void main(String[] args) throws SQLException {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcpracdb", "root", "root");
			
			PreparedStatement prepareStatement = connection.prepareStatement("select * from stud2");
			
			ResultSet executeQuery = prepareStatement.executeQuery();
			
			while(executeQuery.next()) {
				
				System.out.println("id>>>>"+executeQuery.getInt(1));
				
				System.out.println("Name>>>>"+executeQuery.getString(2));
				
				System.out.println("City>>>>"+executeQuery.getString(3));
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
