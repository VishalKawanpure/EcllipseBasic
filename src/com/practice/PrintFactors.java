package com.practice;

public class PrintFactors {
	
	public static void main(String[] args) {
		
		int num=9;
		System.out.println("factors are");
		for (int i=1; i<=num; i++) {
			
			if (num % i==0) {
				System.out.println(i);
			}
		}
	}

}
