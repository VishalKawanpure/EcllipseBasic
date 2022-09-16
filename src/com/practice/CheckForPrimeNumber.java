package com.practice;

public class CheckForPrimeNumber {
	
	public static void main(String[] args) {
		
		int num= 19;
		int count= 0;
		
		for (int i =1; i<=num; i++) {
			
			if(num % i==0) 
				count++;
			}
			if(count==2) {System.out.println("Is Prime Number");}
			
			else { System.out.println("Not a prime Number");}
		}
		
	}


