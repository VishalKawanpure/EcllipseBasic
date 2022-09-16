package com.practice;

import java.util.Scanner;

public class PrintReverseNumber4 {
	
	public static void main(String[] args) {
		System.out.println("Enter the number to reverse");
		String num;
		
		Scanner sc= new Scanner(System.in);
		num= sc.next();
		sc.close();
		StringBuilder sb= new StringBuilder();
		
		sb.append(num);
		StringBuilder rev = sb.reverse();
		System.out.println("reverse is");
		System.out.println(rev);
		
		
		
	}

}
