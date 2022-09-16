package com.practice;

public class CheckForCharecter {
	
	public static void main(String[] args) {
		
		 char ch= '#';
		 
		 if (ch>=65 && ch<=90) {
			 System.out.println("Charcter is capital alphabet");
		 }
		 else if(ch>=97 && ch<=122) {
			 
			 System.out.println("Charcter is small alphabet");
		 }
		 else if (ch>=48 && ch<=57) { System.out.println("Charcter is digit");}
		 
		 else { System.out.println("Charcter is special symbol");}
	}

}
