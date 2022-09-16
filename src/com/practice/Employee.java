package com.practice;

public class Employee {
	
	String firstName;
	String lastName;
	String city;
	String mobileNumber;
	String country;
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
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public static void main(String[] args) {
		
		Employee emp= new Employee();
		
		emp.setCity("Amravati");
		emp.setCountry("India");
		emp.setFirstName("Vishal");
		emp.setLastName("kawanpure");
		emp.setMobileNumber("9604804219");
		
		System.out.println(emp.getCity());
		System.out.println(emp.getCountry());
		System.out.println(emp.getFirstName());
		System.out.println(emp.getLastName());
		System.out.println(emp.getMobileNumber());
		
	}

}
