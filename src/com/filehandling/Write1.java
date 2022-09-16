package com.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class Write1 {
	
	public static void main(String[] args) {
		
		try {
			FileWriter fw= new FileWriter("C:\\Users\\Vishal\\Desktop\\Demo.txt");
			
			fw.write("Vishal kawanpure");
			
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Finished");
	}

}
