package com.practice;

public class CheckForPrimeNumber1 {
	
	public static void main(String[] args) {
		
		int num=7 ;
		
		int count=0;
		
		for ( int i =1; i<=num; i++) {
			
			if (num %i ==0)
				count++;
		}
		if(count==2) { System.out.println("Is prime");}
		
		else { System.out.println("Not a prime");
		}
	}

}
