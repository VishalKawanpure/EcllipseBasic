package com.practice1;

import java.util.Scanner;

public class GreaterThan100 {
	
	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc= new Scanner(System.in);
		
		int num= sc.nextInt();
		
		if (num>100) { System.out.println("geater than 100");
			
		}
		
		else { System.out.println("less thann 100");}
		
		
	}

}
