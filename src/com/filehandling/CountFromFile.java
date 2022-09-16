package com.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountFromFile {
	
	
	public static void main(String[] args) throws FileNotFoundException {
		int alpha=0;
		FileInputStream fis= new FileInputStream("C:\\Users\\Vishal\\Desktop\\Demo.txt");
		
		Scanner sc= new Scanner(fis);
		
		while (sc.hasNextLine()) {
			//System.out.println(sc.nextLine());
			
			String str=sc.nextLine();
			str= str.toLowerCase();
			System.out.println(str);
			
			for (int i =0; i<str.length(); i++) {
				
				char ch= str.charAt(i);
				
				
				if(ch>='a' && ch<='z') { alpha++;}
				
				
			}
			System.out.println(alpha);
			}
		
		sc.close();
	}

}
