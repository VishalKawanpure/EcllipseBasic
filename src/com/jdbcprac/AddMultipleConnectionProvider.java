package com.jdbcprac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AddMultipleConnectionProvider {
	Connection connection;

	public Connection getConnection() throws SQLException {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcpracdb", "root", "root");

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
		return connection;

	}

}
