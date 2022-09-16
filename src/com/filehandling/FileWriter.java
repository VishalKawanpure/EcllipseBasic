package com.filehandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FileWriter {
	
	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos= new FileOutputStream("C:\\Users\\Vishal\\Desktop\\Demo.txt");
		
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		
		System.out.println("Finished");
		
		try {
			oos.writeChars("Hello Good Morning All @123");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		oos.close();
	}

}
