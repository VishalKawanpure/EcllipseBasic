package com.practice1;

public class ArithmaticOperations {
	
	public int getAddition( int a, int b) {
		 int c= a+ b;
		 
		 return c;
		}
	
	public int getSubSrtaction( int x,int y) {
		
		int z= x-y;
		
		return z;
	}
	
	public int getMultiplication(int e, int f) {
		
		int g=e *f;
		return g;
	}
   public int getDevision(int i, int j) {
	   
	   int k= i/j;
	   return k;
   }
   
   public int getAvarage(int l, int m, int n, int o, int p) {
	   
	   int q= (l+m+n+o+p)/5;
	   return q;
	   
	   
   }
   
   public static void main(String[] args) {
	
	   ArithmaticOperations arithmaticOperations= new ArithmaticOperations();
	   
	   int addition = arithmaticOperations.getAddition(2, 3);
	   int subSrtaction = arithmaticOperations.getSubSrtaction(5, 3);
	   int multiplication = arithmaticOperations.getMultiplication(2, 3);
	   int devision = arithmaticOperations.getDevision(10, 5);
	   int avarage = arithmaticOperations.getAvarage(1, 2, 3, 4, 5);
	   
	   System.out.println(addition);
	   System.out.println(subSrtaction);
	   System.out.println(multiplication);
	   System.out.println(devision);
	   System.out.println(avarage);
}
}
