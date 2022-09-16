package com.practice2;

public class Leap1 {

	public static void main(String[] args) {
		
		int year=2012;
		
		
		if((year%4==0) || (year%400==0)&&(year%100!=0)){
			
			System.out.println("is leap");
		}
		else { System.out.println("not leap");}
	}
}
