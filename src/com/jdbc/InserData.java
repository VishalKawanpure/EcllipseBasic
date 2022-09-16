package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InserData {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con;
		try{ String sql= "Insert Into students( LastName, FirstName, City, salary) "
				+ "values ( 'Kawanpure', 'Vishal', 'Amravati', '150000')";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcpracdb", "root", "root");
		
		Statement statement= con.createStatement();
		
		statement.execute(sql);
		System.out.println("Insertion Successfully....");
		
		con.close();
		statement.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
