package com.practice1;

import java.util.Scanner;

public class CheckLeap1 {
	
	public static void main(String[] args) {
		System.out.println("give the year");
		Scanner sc= new Scanner(System.in);
		
		int year= sc.nextInt();
		
		if((year%400==0) || (year %4==0) && (year %100 !=0)){  System.out.println("is leap");}
		
		else { System.out.println("not leap"); }
		
		sc.close();
	}

}
