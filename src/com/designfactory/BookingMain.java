package com.designfactory;

import java.util.Scanner;

public class BookingMain {
	
	public static void main(String[] args) {
		
		String booking;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the AC type");
		
		booking= sc.next();
		
		Booking factory = BookingFactory.createBookingFactory(booking);
		
		//System.out.println(factory.getClass());
		
		System.out.println(factory.getBooking());
		
		sc.close();
		
	}
	
	

}
