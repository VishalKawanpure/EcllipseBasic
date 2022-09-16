package com.exception;

import java.util.Scanner;

public class WeightMain {
	
	public static void main(String[] args) {
		System.out.println("Enter your weight");
		Scanner sc= new Scanner(System.in);
		
		int weight = sc.nextInt();
		
		sc.close();
		
		
		Weight w= new Weight();
		
		try {
			w.weightCheck(weight);
		} catch (WeightException e) {
			
			e.printStackTrace();
			System.out.println("Your weight is not ok");
		}
	}

}
