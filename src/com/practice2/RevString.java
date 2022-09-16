package com.practice2;

import java.util.Scanner;

public class RevString {
	
	public static void main(String[] args) {
		System.out.println("Add String");
		Scanner sc= new Scanner(System.in);
		
		String s=sc.next();
		
		StringBuffer StringBuffer= new StringBuffer(String.valueOf(s));
		
		java.lang.StringBuffer reverse = StringBuffer.reverse();
		
		System.out.println(reverse);
		
		
	}

}
