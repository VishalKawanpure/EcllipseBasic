package com.jdbc.officers;

import java.util.Scanner;

public class OfficersMain {
	public static void main(String[] args) {
		
	
	Scanner sc= new Scanner(System.in);
	
	for( int i= 0; i<3; i++) {
		
		System.out.println("Enter the firstname");
		String firstname = sc.next();
		System.out.println("Enter the lastname");
		String lastname = sc.next();
		UserInput userInput = new UserInput();
		userInput.insertOfficersData(firstname, lastname);}
	sc.close();
	System.out.println("successfull");
}}
