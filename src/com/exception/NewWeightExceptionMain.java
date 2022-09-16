package com.exception;

import java.util.Scanner;

public class NewWeightExceptionMain {
	
public static void main(String[] args)throws WeightException  {
	
	System.out.println("Enter the weight");
	Scanner sc= new Scanner(System.in);
	
	int weight= sc.nextInt();
	
	if(weight<100) {
		
		System.out.println("weight is ok");}
	else { 
		try {
			throw new WeightException("Weight is Not Ok");
		} catch (WeightException e) {
			
			e.printStackTrace();
		}
	}
	
	
	}

}
