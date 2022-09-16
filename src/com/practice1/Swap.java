package com.practice1;

public class Swap {
	
	public static void main(String[] args) {
		
		int a=10;
		int b=14;
	
		System.out.println("before Swap" +a+"    "+b);
		
		 a= a+b;
		 b= a-b;
		 a= a-b;
		
		 System.out.println("afer Swap" +a+"    "+b); 
	}

}
