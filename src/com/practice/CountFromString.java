package com.practice;

import java.util.Scanner;

public class CountFromString {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String");
		String str= sc.nextLine();
		str =str.toLowerCase();
		sc.close();
		
		int vowels = 0, alphabets = 0, numbers = 0, space = 0,speacial=0;
		char ch;
		
		for(int i=0; i<str.length(); i++) {
			
			ch = str.charAt(i);
			
			if(ch>='a' && ch<='z') {
				
				if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch =='u') {
					
					vowels++;}
				
				else {alphabets  ++;}}
			
			else if(ch>='0' && ch<='9') {
				
				numbers++;
					
				}
			else if(ch==' ') { space++;}
			
			
			else { speacial++;}	
				
			}
		System.out.println("Numbers of Vowels = "+vowels );	
		System.out.println("Number Of alphabets = "+ alphabets);
		System.out.println("Number of Numbers = "+numbers );
		System.out.println("Numbers Of spaces = "+ space);
		System.out.println("Number of special characters= "+ speacial);	
		}
		
		
	}


