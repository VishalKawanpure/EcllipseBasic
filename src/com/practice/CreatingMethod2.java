package com.practice;

public class CreatingMethod2 {
	
	String getStudentName(String name) {
		
		return name;
	}
public static void main(String[] args) {
	CreatingMethod2 m2= new CreatingMethod2();
	
	String name= m2.getStudentName("Vishal");
	
	System.out.println("Name is...."+ name);
}
}
