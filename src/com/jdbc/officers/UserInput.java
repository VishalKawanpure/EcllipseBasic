package com.jdbc.officers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserInput {
	
	Connection con;
	public void insertOfficersData(String firstname, String lastname) {
		try {
		ConnectionTest connectionTest= new ConnectionTest();
		
			con= connectionTest.getConnectiondetails();
			
			PreparedStatement ps = con.prepareStatement("Insert into officers ( firstname, lastname) values (?,?)");
			ps.setString(1, firstname);
			ps.setString(2, lastname);
			
			int i= ps.executeUpdate();
			System.out.println("Record is inserted>>>"+ i);
			
			con.close();
			ps.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
	}

}
