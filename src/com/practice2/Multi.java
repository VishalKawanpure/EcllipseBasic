package com.practice2;

import java.util.Scanner;

public class Multi {
	
	public static void main(String[] args) {
		System.out.println("Add number");
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("table is");
		for(int i=1; i<=10; i++) {
			
			
			System.out.println(num*i);
		}
	}

}
