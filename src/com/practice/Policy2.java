package com.practice;

import java.util.Scanner;

public class Policy2 {
	        
	        public static void getUserInput() {
			
			System.out.println("Enter the policyId");
			Scanner sc= new Scanner(System.in);
			int policyId =sc.nextInt();
			System.out.println("Enter the policyName");
			String policyName= sc.next();
			System.out.println("Enter the policyType ");
			String policyType= sc.next();
			System.out.println("Enter the policyAmount");
			int policyAmount= sc.nextInt();
			sc.close();
			Policy1 p1= new Policy1();
			
			p1.setPolicyId(policyId);
			p1.setPolicyName(policyName);
			p1.setPolicyType(policyType);
			p1.setPolicyAmount(policyAmount);
			
			System.out.println("policyId>>>"+p1.getPolicyId());
			System.out.println("policyName>>>"+ p1.getPolicyName());
			System.out.println("policyType>>>"+ p1.getPolicyType());
			System.out.println("policyAmount>>>"+ p1.getPolicyAmount());   }
		
		public static void main(String[] args) {
			
			
			getUserInput();
		}
		
		
		
	}




