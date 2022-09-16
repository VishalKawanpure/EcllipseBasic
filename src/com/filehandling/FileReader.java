package com.filehandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileReader {
	
	public static void main(String[] args) {
		
		try{ FileInputStream fis= new FileInputStream ("C:\\Users\\Vishal\\Desktop\\Demo.txt");
		Scanner sc= new Scanner(fis);
		
		while(sc.hasNextLine()) {
			
			System.out.println(sc.nextLine());}
		    sc.close();
		    
		}catch (IOException e) {
			
			System.out.println(e);
		}
		
	}

}
