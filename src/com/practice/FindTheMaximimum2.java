package com.practice;

import java.util.Scanner;

public class FindTheMaximimum2 {
	
	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		
		System.out.println("Enter the first number");
		Scanner sc= new Scanner(System.in);
		
		a= sc.nextInt();
		System.out.println("Enter the second number");
		b= sc.nextInt();
		System.out.println("Enter the third number");
		c= sc.nextInt();
		
		sc.close();
		
		if (a>b && a>c) { System.out.println("max is ..."+a);}
		
		else if ( b>a && b>c) { System.out.println("max is ...."+b);}
		
		else { System.out.println("max is ...."+c);}
		
		
	}

}
