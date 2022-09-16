package com.exception;

public class ProductException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String message;

	public ProductException(String message) {
		super();
		this.message = message;
	}
	

}
