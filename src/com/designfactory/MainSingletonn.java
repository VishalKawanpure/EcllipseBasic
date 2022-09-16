package com.designfactory;

public class MainSingletonn {

	public static void main(String[] args) {

		Singletonn single = Singletonn.getSingle();
		
		Singletonn single1 = Singletonn.getSingle();
		Singletonn single2 = Singletonn.getSingle();

		System.out.println(single.hashCode());
		System.out.println(single1.hashCode());
		System.out.println(single2.hashCode());

	}

}
