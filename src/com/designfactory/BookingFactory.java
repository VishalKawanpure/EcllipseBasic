package com.designfactory;

public class BookingFactory {

	public static Booking createBookingFactory(String input) {

		if (input.equalsIgnoreCase("first")) {

			return new FirstTier();
		}

		else if (input.equalsIgnoreCase("second")) {

			return new SecondTier();
		}

		else if (input.equalsIgnoreCase("third")) {

			return new ThirdTier();
		}

		else {
			throw new IllegalArgumentException("Not Valid input");
		}
	}

}
