package com.practice;

import java.util.Scanner;

public class EmployeeInformation {
	static String country= "India";
	
	String firstName;
	String lastName;
	String city;
	String mobilenumber;
	
	public static String getCountry() {
		return country;
	}
	public static void setCountry(String country) {
		EmployeeInformation.country = country;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	
	
	public static void getUserinput() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("first name");
		String firstName= sc.next();
		System.out.println("last name");
		String lastName=sc.next();
		System.out.println("city name");
		String city=sc.next();
		System.out.println("mobilenumber");
		String mobilenumber= sc.next();
		sc.close();
		System.out.println("Country..."+country);
		
		
		EmployeeInformation em= new EmployeeInformation();
		
		em.setFirstName(firstName);
		em.setLastName(lastName);
		em.setCity(city);
		em.setMobilenumber(mobilenumber);
		
		
		System.out.println("firstName>>>"+ firstName);
		System.out.println("lastName>>>"+ lastName);
		System.out.println("city>>>"+ city);
		System.out.println("mobilenumber>>>"+ mobilenumber);
		
		
		
	
	
	}
	public static void main(String[] args) {
		
		getUserinput(); 
		
		
		
		
	}
	}
	
	