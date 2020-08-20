package com.java.springbootstarter.exception;

public class ApplicationException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 * @param msg
	 */
	public ApplicationException(String msg) {
		super(msg);
	}

	/**
	 * 
	 * @param msg
	 * @param t
	 */
	public ApplicationException(String msg, Throwable t) {
		super(msg, t);
	}

}
