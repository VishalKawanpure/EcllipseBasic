package com.jdbc.officers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connectionnew {
	Connection con;
	public Connection getConnectiondetails() throws SQLException {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcpracdb", "root", "root");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		return con;
		
		
	}

}
