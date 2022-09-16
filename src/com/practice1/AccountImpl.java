package com.practice1;

import java.util.Scanner;

public class AccountImpl implements Account {

	@Override
	public void getSavingAccount() {

		Scanner sc = new Scanner(System.in);

		int accountNumber;

	}

	@Override
	public void getUserDetails(String name, float balance) {

		
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int accountNumber = sc.nextInt();

		System.out.println("Enter name");
		String name = sc.next();

		System.out.println("Enter balance");
		float balance = sc.nextFloat();

		AccountImpl AccountImpl = new AccountImpl();

		AccountImpl.getSavingAccount();
		AccountImpl.getUserDetails(name, balance);

	}

}
