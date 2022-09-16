package com.practice1;

import java.util.Scanner;

public class ToCheckEvenOrOdd {
	
	
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc= new Scanner(System.in);
		
		int num= sc.nextInt();
		
		if(num % 2==0) { System.out.println("is even");}
		
		else { System.out.println("is odd");}
		
		sc.close();
	}

}
