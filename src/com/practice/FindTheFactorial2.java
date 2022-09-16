package com.practice;

import java.util.Scanner;

public class FindTheFactorial2 {

	public static void main(String[] args) {
		System.out.println("Enter the number to get factorial");
		int num;
		int fact =1;
		
		Scanner sc=new Scanner(System.in); 
		
		num= sc.nextInt();
		
		sc.close();
		
		for( int i =1; i<=num; i++) {
			
			fact= fact*i;
			
		}
		System.out.println("factorial is...." +fact);
		
		
	}
}
