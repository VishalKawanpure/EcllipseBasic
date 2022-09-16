package com.practice;

import java.util.Scanner;

public class PrintFactors2 {
	public static void main(String[] args) {
		
	
	System.out.println("Enter the number");
	int num;
	
	Scanner sc= new Scanner(System.in);
	num= sc.nextInt();
	sc.close();
	System.out.println("factors are");
	for (int i=1; i<=num; i++) {
		
		if (num % i==0) {System.out.println(i);}
	}

}}
