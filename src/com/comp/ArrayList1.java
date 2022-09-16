package com.comp;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1 {
	
	
	public static void main(String[] args) {
		
		ArrayList<String>  Arraylist= new ArrayList<String>();
		
		Arraylist.add("ram");
		Arraylist.add("aam");
		Arraylist.add("sam");
		
		
		System.out.println(Arraylist);
		
		Collections.sort(Arraylist);
		
		System.out.println(Arraylist);
		
		
		
	}
	
	

}
