package com.jdbc.officers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserInput1 {
	Connection con;
	public void getOfficersData(String firstname, String lastname) {
		
		try {
			
			Connectionnew connectionnew= new Connectionnew();
			con= connectionnew.getConnectiondetails();
			
			PreparedStatement pst = con.prepareStatement("Insert into officers( firstname, lastname) values (?,?)");
			
			pst.setString(1, firstname);
			pst.setString(2, lastname);
			
			int i= pst.executeUpdate();
			
			System.out.println("Record Inserted...."+i);
			
			con.close();
			pst.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	
		
		
	}

}
