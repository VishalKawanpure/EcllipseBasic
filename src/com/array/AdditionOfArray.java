package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AdditionOfArray {
	
	public static void main(String[] args) {
		
	
	
	String[] s1= {"Ram", "Sam","Tom"};
	
	String[] s2= {"Rom", "Kam","Com"};
	
	List<String> asList = Arrays.asList(s1);
	List<String> asList2 = Arrays.asList(s2);
	
	ArrayList<String> ArrayList= new ArrayList<String>(asList);
	
	ArrayList.addAll(asList2);
	
	
	System.out.println(ArrayList);
	
	
	

}}
