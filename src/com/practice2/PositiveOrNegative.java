package com.practice2;

import java.util.Scanner;

public class PositiveOrNegative {
	
	public static void main(String[] args) {
		System.out.println("Add number");
		int num;
		Scanner sc= new Scanner(System.in);
		
		 num= sc.nextInt();
		 
		 if(num<0) {
			 System.out.println("number is negative");
		 }
		 else {System.out.println("is positive");}
		
		
	}

}
