package com.exception;

public class NewWeightException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String massage;
	public NewWeightException(String massage) {
		super();
		this.massage = massage;
	}

	

}
