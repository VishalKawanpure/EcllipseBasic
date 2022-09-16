package com.practice2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReturnList {

	public List<String> getEmployee() {

		List<String> List = new ArrayList<String>();
		List.add("ram");
		List.add("sohan");
		List.add("ashok");
		List.add("ajay");
		List.add("prassanna");
		System.out.println(List);

		Collections.sort(List);

		System.out.println("Sorted" + List);

		return List;

	}

	public static void main(String[] args) {

		ReturnList ReturnList = new ReturnList();
		ReturnList.getEmployee();

	}

}
