package com.practice2;

import java.util.Scanner;

public class RevString1 {
	
	public static void main(String[] args) {
		System.out.println("add string");
		Scanner sc= new Scanner(System.in);
		
		String s=sc.next();
		
		StringBuilder StringBuilder= new StringBuilder();
		StringBuilder append = StringBuilder.append(s);
		java.lang.StringBuilder reverse = append.reverse();
		
		System.out.println(reverse);
	}

}
