package com.practice;

import java.util.Scanner;

public class CheckForPrimeNumber2 {
	
	public static void main(String[] args) {
		
		int num;
		int count=0;
		Scanner sc= new Scanner( System.in);
		System.out.println("Enter the number to check");
		 num= sc.nextInt();
		 
		sc.close();
		for (int i= 1; i<=num; i++) {
			if(num % i==0)
				count++;}
		if(count==2) { System.out.println("is Prime number");}
		
		else { System.out.println("not a prime number");
		
		}
		
		
		
		
	}

}
