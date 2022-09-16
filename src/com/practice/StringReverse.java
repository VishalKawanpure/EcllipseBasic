package com.practice;

import java.util.Scanner;

public class StringReverse {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String");
		String str= sc.nextLine();
		sc.close();
		
		//StringBuffer sb= new StringBuffer(String.valueOf(str));
		
		//StringBuffer reverse = sb.reverse();
		
		StringBuilder sb= new StringBuilder();
		sb.append(str);
		
		StringBuilder reverse = sb.reverse();
		 
		
		System.out.println("Reverse String is >>>"+reverse);
		
	}

}
