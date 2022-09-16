package com.jdbcprac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateByPrepared {
	
	public static void main(String[] args) throws SQLException {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcpracdb", "root","root");
			
			PreparedStatement prepareStatement = connection.prepareStatement("update stud2 set name=? where id=?");
			
			prepareStatement.setString(1, "Ramesh");
			prepareStatement.setInt(2, 2);
			int executeUpdate = prepareStatement.executeUpdate();
			
			System.out.println("Table updated"+executeUpdate);
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
