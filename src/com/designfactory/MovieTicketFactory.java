package com.designfactory;

public class MovieTicketFactory {
	
	public static MovieTicketBooking createMovieTicketBooking(String input1) {
		
		if(input1.equalsIgnoreCase("first")) {
			
			return  new Screen1();
		}
		else if(input1.equalsIgnoreCase("second")) {
			
			return  new Screen2();
		}
		else if (input1.equalsIgnoreCase("third")) {
			return  new Screen3();
		}
		
		else {
			throw new IllegalArgumentException("Invalid input");
		}
	}

}
