 package com.order.management.exception;

public class OrderNotFoundException extends RuntimeException{

	/**
	 * CountryExceptionClass
	 */
	
	private static final long serialVersionUID = -6513666078709813858L;
	private String exceptionMessage;
	
	
	public OrderNotFoundException(String exceptionMessage) {
		super();
		this.exceptionMessage = exceptionMessage;
	}


	public String getExceptionMessage() {
		return exceptionMessage;
	}


	public void setExceptionMessage(String exceptionMessage) {
		this.exceptionMessage = exceptionMessage;
	}	

}
