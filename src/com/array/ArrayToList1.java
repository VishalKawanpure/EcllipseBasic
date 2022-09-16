package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList1 {
	
	public static void main(String [] args) {
	
	String  a[]= { "1","2","3","4"};
	
	List<String> asList = Arrays.asList(a);
	
	ArrayList<String> ArrayList= new ArrayList<String>(asList);
	
	
	ArrayList.add("ram");
	
	
	
	System.out.println(ArrayList);
	

}}
