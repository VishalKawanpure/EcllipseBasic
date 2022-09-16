package com.practice;

public class Account1_Accountlmpl implements Account1 {

	@Override
	public void getSavingAccount() {
		
		System.out.println("This is implemented Method");
		
		
	}

	@Override
	public void getUserdetails(String name, float balance) {
		
		System.out.println("Name = "+name+" And  balance= "+ balance);
		
		
		
		
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		Account1_Accountlmpl inter= new Account1_Accountlmpl();
		
		inter.getSavingAccount();
		inter.getUserdetails("vishal", 5000);
		
	}
	
	

}
