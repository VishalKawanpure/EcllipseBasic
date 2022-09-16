package com.practice1;

import java.util.Scanner;

public class Calender {
	
	public static void main(String[] args) {
		
		System.out.println("enter the month");
		Scanner sc= new Scanner(System.in);
		
		int month = sc.nextInt();
		
		switch(month) {
		
		case 1 : System.out.println("Month is jan");
		break;
		
		case 2 : System.out.println("Month is feb");
		break;
		
		case 3 : System.out.println("Month is mar");
		break;
		
		case 4 : System.out.println("Month is apr");
		break;
		
		case 5 : System.out.println("Month is may");
		break;
		
		case 6 : System.out.println("Month is jun");
		break;
		
		case 7 : System.out.println("Month is july");
		break;
		
		case 8 : System.out.println("Month is aug");
		break;
		
		case 9 : System.out.println("Month is sep");
		break;
		
		case 10 : System.out.println("Month is oct");
		break;
		
		case 11 : System.out.println("Month is nov");
		break;
		
		case 12 : System.out.println("Month is dec");
		break;
		
		default : System.out.println("invalid month");
		}
		
		sc.close();
	}

}
