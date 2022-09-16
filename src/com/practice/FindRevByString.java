package com.practice;

public class FindRevByString {
	
	public static void main(String[] args) {
		
		String num="Vishal";
		
		StringBuffer sb=new StringBuffer(String.valueOf(num));
		
		StringBuffer rev = sb.reverse();
		
		System.out.println(rev);
				
				
		
	}

}
