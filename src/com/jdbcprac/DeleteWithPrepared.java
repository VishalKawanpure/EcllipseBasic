package com.jdbcprac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteWithPrepared {
	
	public static void main(String[] args) throws SQLException {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcpracdb", "root", "root");
			
			PreparedStatement prepareStatement = connection.prepareStatement("delete from stud2 where id=?");
			
			prepareStatement.setInt(1, 3);
			int executeUpdate = prepareStatement.executeUpdate();
			
			System.out.println("Record deleted"+ executeUpdate);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
