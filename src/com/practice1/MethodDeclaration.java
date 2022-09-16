package com.practice1;

public class MethodDeclaration {
	
	
	public String getStudentName(String name) {
		
		
		return name; }
	
	public static void main(String[] args) {
		
		MethodDeclaration methodDeclaration= new MethodDeclaration();
		
		String studentName = methodDeclaration.getStudentName("Vishal Kawanpure");
		
		System.out.println(studentName);
		
		
		
	}

}
