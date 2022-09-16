package com.practice2;

import java.util.Scanner;

public class EmployeeInformation {
	
	Employee employee= new Employee();
	
	public void getUserInput(String firstName, String lastName, String city, String mobileNumber, String country) {
		
		employee.setCity(city);
		employee.setFirstName(firstName);
		employee.setLastName(lastName);
		employee.setMobileNumber(mobileNumber);
		employee.setCountry(country);
		
		
		
		System.out.println(employee.getFirstName());
        System.out.println(employee.getLastName());
        System.out.println(employee.getCity());
        System.out.println(employee.getMobileNumber());
        System.out.println(employee.getCountry());
       
        
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter firstName");
		String firstName= sc.next();
		System.out.println("Enter lastName");
		String lastName= sc.next();
		System.out.println("Enter city");
		String city= sc.next();
		System.out.println("Enter mobileNumber");
		String mobileNumber= sc.next();
		System.out.println("Enter country");
		String country= sc.next();
		EmployeeInformation EmployeeInformation= new EmployeeInformation();
		EmployeeInformation.getUserInput(firstName, lastName, city, mobileNumber, country);
	}

}
