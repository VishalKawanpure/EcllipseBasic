package com.practice2;

public class Method {
	
	public String getStudent(String name) {
		System.out.println(name);
		return name;
		
	}
	
	public static void main(String[] args) {
		
		Method Method= new Method();
		
		Method.getStudent("Ram");
	}

}
