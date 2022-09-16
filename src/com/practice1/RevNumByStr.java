package com.practice1;

public class RevNumByStr {
	
	public static void main(String[] args) {
		
	
	
	String num="1234";
	
	StringBuffer stringBuffer= new StringBuffer(String.valueOf(num));
	
	StringBuffer reverse = stringBuffer.reverse();
	
	System.out.println(reverse);


}}
