package com.practice;

public class FindRevByString1 {
	
	public static void main(String[] args) {
		
		String name= "1234";
		
		StringBuilder sb= new StringBuilder();
		sb.append(name);
			StringBuilder rev = sb.reverse();
			
			System.out.println(rev);
				
	}

}
