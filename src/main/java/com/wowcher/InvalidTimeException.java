package com.wowcher;

/**
 * Invalid time exception
 * 
 * @author miroslav
 */
public class InvalidTimeException extends RuntimeException {
	private static final long serialVersionUID = -5600057890022102537L;
	
	public InvalidTimeException(final String e) {
		super(e);
	}
}