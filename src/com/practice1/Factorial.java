package com.practice1;

public class Factorial {
	
	int factorial(int num) {
		 
		int fact= 1;
		
		for(int i=1; i<=num; i++) {
			
			fact= fact*i; }
		return fact;
	}

	public static void main(String[] args) {
		Factorial factorial= new Factorial();
		
		int factorial2 = factorial.factorial(5);
		
		System.out.println(factorial2);
		
	}
}
