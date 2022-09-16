package com.jdbcprac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertByPrepared {
	
	public static void main(String[] args) throws SQLException {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcpracdb", "root", "root");
			PreparedStatement prepareStatement = connection.prepareStatement("insert into stud2 (name, city) values (?,?)");
			
			prepareStatement.setString(1, "Rohan");
			prepareStatement.setString(2, "Amravati");
			
			
			int update = prepareStatement.executeUpdate();
			
			System.out.println("Record Inserted"+update);
			
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
