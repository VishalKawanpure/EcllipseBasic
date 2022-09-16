package com.practice1;

import java.util.Scanner;

public class ReverseNum {
	
	public static void main(String[] args) {
		int rev=0;
		System.out.println("Enter the number");
		
		Scanner sc= new Scanner(System.in);
		
		int num= sc.nextInt();
		
		while(num!=0) {
			
			rev= rev*10 +num%10;
			num= num/10;
			}
		
		System.out.println(rev);
	}

}
