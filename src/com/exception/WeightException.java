package com.exception;

public class WeightException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String message;

	public WeightException(String message) {
		super(message);
		this.message = message;
	}

}
