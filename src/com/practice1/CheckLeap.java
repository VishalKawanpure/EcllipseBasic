package com.practice1;

public class CheckLeap {
	
	public static void main(String[] args) {
		
		int year=2013;
		
		if ((year % 4==0 ) || (year % 400==0 ) && ( year %100 !=0)) {
			
			System.out.println("Leap year");
		}
		
		else { System.out.println("Not leap");}
	}

}
