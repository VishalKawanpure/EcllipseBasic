package com.filehandling;

import java.io.*;
import java.util.Scanner;

public class FileReader2 {
	
	public static void main(String[] args)  {
		
		try {FileInputStream fis;
		
			fis = new FileInputStream ("C:\\Users\\Vishal\\Desktop\\Demo.txt");
		
		
		Scanner sc= new Scanner(fis);
		
		
		while(sc.hasNextLine()) {
			
			System.out.println(sc.nextLine());}
		
		sc.close();
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}

