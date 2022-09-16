package com.practice;

public class PrintReverseNumber2 {
	
	
	
	public static void main(String[] args) {
		
		String num= "1234";
		
		StringBuffer sb= new StringBuffer (String.valueOf(num));
		
		StringBuffer rev = sb.reverse();
		
		System.out.println(rev);
	}

}
