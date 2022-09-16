package com.practice;

import java.util.Scanner;

public class CheckingLeapOrNot2 {
	
	public static void main(String[] args) {
		
		int year;
		
		System.out.println("Enter the year to be check");
		
		Scanner sc= new Scanner( System.in);
		
		year= sc.nextInt();
		sc.close();
		if ((year % 400==0)|| (year % 4 ==0) && (year %100 !=0)) {
			System.out.println("Year is leap");
		}
		
		else { System.out.println("Year is not leap");}
	}

}
