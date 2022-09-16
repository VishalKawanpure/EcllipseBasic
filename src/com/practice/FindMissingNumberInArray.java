package com.practice;

public class FindMissingNumberInArray {
public static void main(String[] args) {
	

	int a []= {1,2,3,4,5,6,8,9};
	
	int sum1= 0;
	int sum2= 0;
	
	for (int i=0; i<a.length; i++) {
		
		sum1= sum1+ a[i];
	}
System.out.println("Sum of elements in given array= "+sum1);


for (int i=1; i<=9; i++) {
	sum2= sum2+i;
}

System.out.println("expected sum of the numbers in array= "+sum2);

System.out.println("Misssing number in array is= "+(sum2-sum1));
}}
