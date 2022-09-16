package com.practice1;

import java.util.Scanner;

public class EmployeeInfo {
	
	private static String firstName;
	private static String lastName;
	private static String mobileNumber;
	private static String city;
	private static String country;

	public void getUserInput(String firstName2, String lastName2, String mobileNumber2, String city2, String country2) {
		
		Employee employee =new Employee();
		
		employee.setFirstName(firstName);
		employee.setLastName(lastName);
		employee.setMobileNumber(mobileNumber);
		employee.setCity(city);
		employee.setCountry(country);
		
		
		
		System.out.println(employee.getFirstName());
		System.out.println(employee.getLastName());
		System.out.println(employee.getMobileNumber());
		System.out.println(employee.getCity());
		System.out.println(employee.getCountry());  }
	
	public static void main(String[] args) {
		
		EmployeeInfo employeeInfo= new EmployeeInfo();
		
		
		System.out.println("Enter firstname");
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		firstName= sc.next();
		System.out.println("Enter lastName");
		lastName= sc.next();
		System.out.println("Enter mobileNumber");
		mobileNumber= sc.next();
		System.out.println("Enter city");
		city= sc.next();
		System.out.println("Enter country");
		country=sc.next();
		
		employeeInfo.getUserInput(firstName, lastName, mobileNumber, city, country);
		
		
		
	}

}
