package com.designfactory;

public class SecondTier implements Booking{

	@Override
	public String getBooking() {
		
		return "SecondTier available seats are 30";
	}

}
