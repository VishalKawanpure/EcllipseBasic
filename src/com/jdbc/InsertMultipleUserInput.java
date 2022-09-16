package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertMultipleUserInput {
	
	Connection con;
	
	
	
	public void isertStudentData(String firstname, String lastname) {
	
		
		
		
		try {
			InsertMultiple multiple= new InsertMultiple();
			
			 multiple.getConnectionDetails();
			 
			PreparedStatement ps = con.prepareStatement("insert into Employee (Firstname, Lastname) values (?,?)");
			 
			 ps.setString(1, firstname);
			 ps.setString(2,  lastname);
			 
			int i= ps.executeUpdate();
		
			
			System.out.println("record inserted...."+ i);
			 
			 ps.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}
