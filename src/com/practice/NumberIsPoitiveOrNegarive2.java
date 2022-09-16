package com.practice;

import java.util.Scanner;

public class NumberIsPoitiveOrNegarive2 {
	
	public static void main(String[] args) {
		
		int num;
		
		System.out.println("Enter the number to be checked");
		
		Scanner sc= new Scanner( System.in);
		
		num= sc.nextInt();
		sc.close();
		if (num<0) { System.out.println("Number is negative");}
		
		else if(num>0) { System.out.println("Number is positive");}
		
		else { System.out.println("number is zero");}
	}

}
