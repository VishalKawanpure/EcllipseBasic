package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UpdatePreparedStatement {
	
	public static void main(String[] args) throws SQLException {
		
		Connection con;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcpracdb", "root", "root");
			PreparedStatement ps = con.prepareStatement("update employee set Firstname=? where id=?");
			
			PreparedStatement del = con.prepareStatement("delete from Employee where id=?");
			PreparedStatement ret = con.prepareStatement("select *from Employee");
			
			
			
			
			ps.setString(1, "Nagesh");
			ps.setString(2, "2" );
			
			
			del.setString(1, "3");
			
			ResultSet rs = ret.executeQuery();
			
			while(rs.next()) { 
				System.out.println(" Id= "+ rs.getInt(1));
				System.out.println(" Firstname= "+ rs.getString(2));
				System.out.println(" Firstname= "+ rs.getString(3));
				
			}
			int i = ps.executeUpdate();
			int d= del.executeUpdate();
			
			System.out.println("Record Updated...."+i);
			System.out.println("Record deleted...."+d);
			
			ps.close();
			con.close();
			
			
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}

}
