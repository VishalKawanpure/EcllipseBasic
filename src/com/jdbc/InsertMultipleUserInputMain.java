package com.jdbc;

import java.sql.SQLException;
import java.util.Scanner;

public class InsertMultipleUserInputMain {

	
	

	public static void main(String[] args) throws SQLException {
		
		Scanner sc= new Scanner(System.in);
		
		for (int i= 0; i<2; i++) {
			
			System.out.println("Enter the Firstname>>");
			String firstname= sc.next();
			System.out.println("Enter Lastname");
			String lastname= sc.next();
			InsertMultipleUserInput input= new InsertMultipleUserInput();
			input.isertStudentData(firstname, lastname);
			sc.close();
		}
	}
}
