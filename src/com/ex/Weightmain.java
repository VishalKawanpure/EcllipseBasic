package com.ex;

import java.util.Scanner;

public class Weightmain {
	
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Ente the weight");
		
		int weight = sc.nextInt();
		
		sc.close();
		
		Weight w1= new Weight();
		
		try {
			w1.checkWeight(weight);
		} catch (WeightException e) {
			System.out.println("You are overweight");
			e.printStackTrace();
		}
	}
	
	

}
