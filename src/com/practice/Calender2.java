package com.practice;

import java.util.Scanner;

public class Calender2 {
	
	public static void main(String[] args) {
		
		int month;
		System.out.println("Enter the month number");
		Scanner sc= new Scanner( System.in);
		
		month= sc.nextInt();
		sc.close();
		
		switch(month) {
		
		case 1: System.out.println("month is jan");
		break;
		case 2: System.out.println("Month is Feb");
		break;
		case 3: System.out.println("Month is Mar");
		break;
		case 4: System.out.println("Month is Apr");
		break;
		case 5: System.out.println("Month is May");
		break;
		case 6: System.out.println("Month is jun");
		break;
		case 7: System.out.println("Month is Jul");
		break;
		case 8: System.out.println("Month is Aug");
		break;
		case 9: System.out.println("Month is Sep");
		break;
		case 10: System.out.println("Month is Oct");
		break;
		case 11: System.out.println("Month is Nov");
		break;
		case 12: System.out.println("Month is Dec");
		break;
		
		default: System.out.println("Invalid month");
		
	
		}
	}

}
