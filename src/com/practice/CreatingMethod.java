package com.practice;

public class CreatingMethod {
	
	String getStudentName (String name) {
		
		return name;
	}
	
	public static void main(String[] args) {
		
		CreatingMethod m1 = new CreatingMethod();
		
		String name = m1.getStudentName("Vishal");
		
		System.out.println("Name Of The Student is..."+ name);
		
		
		
		
	}

}
