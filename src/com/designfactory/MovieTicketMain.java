package com.designfactory;

import java.util.Scanner;

public class MovieTicketMain {
	
	public static void main(String[] args) {
		
		String booking1;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Please enter the screen number");
		
		
		booking1= sc.next();
		
		MovieTicketBooking ticketBooking = MovieTicketFactory.createMovieTicketBooking(booking1);
		
		System.out.println(ticketBooking.getMovieTicket());
		
		
		
	}

}
