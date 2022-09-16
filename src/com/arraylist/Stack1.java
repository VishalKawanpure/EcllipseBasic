package com.arraylist;

import java.util.Collections;
import java.util.Stack;

public class Stack1 {
	
	public static void main(String[] args) {
		
		Stack<String> s= new Stack<String>();
		
		s.push("Red");
		s.push("Blue");
		s.push("Green");
		s.push("Red");
		s.push("Blue");
		s.push("Red");
		s.push("Blue");
		s.push("Green ");
		
		System.out.println(s);
		
		Collections.sort(s);
		
		System.out.println("after sort>>>"+s);
		
		Collections.reverse(s);
		System.out.println("Reverse>>>"+s);
		
	
		
		
		
	}

}
