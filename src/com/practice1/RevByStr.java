package com.practice1;

import java.util.Scanner;

public class RevByStr {
	
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc= new Scanner(System.in);
		
		String num= sc.next();
		
		StringBuffer StringBuffer= new StringBuffer(String.valueOf(num));
		
		StringBuffer reverse = StringBuffer.reverse();
		
		System.out.println(reverse);
		sc.close();
		
		
		
	}

}
