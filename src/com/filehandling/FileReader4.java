package com.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader4 {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		int alpha=0;
		int digit=0;
		
		FileInputStream fis= new FileInputStream("C:\\Users\\Vishal\\Desktop\\Demo.txt");
		
		Scanner sc= new Scanner(fis);
		
		while(sc.hasNextLine()) {
			
			//System.out.println(sc.nextLine());
			
			String line = sc.nextLine();
			String case1 = line.toLowerCase();
			
			System.out.println(case1);
			
			for(int i=0; i<case1.length(); i++) {
				
				char ch= case1.charAt(i);
				
				if(ch>='a' && ch<='z') {alpha++;}
				
				else if(ch>='1' && ch<='9') {digit++;}
			}
			
			System.out.println(alpha);
			System.out.println(digit);
		}
		
	}

}
