package com.practice1;

import java.util.Scanner;

public class CheckNumberPositiveorNegative {
	
	public static void main(String[] args) {
		
		System.out.println("Add number");
		Scanner sc=new Scanner(System.in);
		int a= sc.nextInt();
		
		if(a>0) { System.out.println("Positive"); }
		
		else { System.out.println("Negative");}
		
		sc.close();
	}

}
