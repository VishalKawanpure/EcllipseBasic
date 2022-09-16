package com.ashvinimadamproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayToarrayList2 {
	
	public static void main(String[] args) {
		
	
	String[] s= {"Pune", "Nagpur", "Mumbai"};
	
	List<String> list =new ArrayList<String>( Arrays.asList(s));
	
	list.add("Amravati");
	
	System.out.println(list);

}}
