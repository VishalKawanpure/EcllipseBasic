package com.jdbc.officers;

import java.util.Scanner;

public class OfficersMain1 {
	
	public static void main(String[] args) {
		
	
	
	Scanner sc= new Scanner(System.in);
	
	for( int i=0; i<2; i++) {
		
		System.out.println("Enter the fisrtname>>>");
		String firstname = sc.next();
		System.out.println("Enter the lastname>>>");
		String lastname = sc.next();
		
		UserInput1 u1= new UserInput1();
		u1.getOfficersData(firstname, lastname);  }
	
	sc.close();
	System.out.println("Successfull");

}}
