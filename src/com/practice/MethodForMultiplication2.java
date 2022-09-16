package com.practice;

import java.util.Scanner;

public class MethodForMultiplication2 {
	
	public static void main(String[] args) {
		
		int num;
		System.out.println("Enter the Number");
		
		Scanner sc= new Scanner(System.in);
		num= sc.nextInt();
		sc.close();
		System.out.println("Multiplication table is");
		for( int i=1; i<=10; i++) {
			System.out.println(num+"  x "+i+" = "+ num*i);
		}
	}

}
