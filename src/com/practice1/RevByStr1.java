package com.practice1;

public class RevByStr1 {
	
	public static void main(String[] args) {
		
		String num= "3456";
		
		StringBuilder StringBuilder= new StringBuilder();
		
		StringBuilder.append(num);
		
		StringBuilder reverse = StringBuilder.reverse();
		
		System.out.println(reverse);
	}

}
