package com.weekly.week5;

import java.io.Serializable;

public class DogNotFoundException extends Exception implements Serializable {

	// Throwable (base class for Exception is serializable. 
	// This is required for Exceptions to be sent to remote
	private static final long serialVersionUID = 7641110831384186860L;

	public DogNotFoundException() {
		// chained constructors must be the first statement!
        super();
    }
	
    public DogNotFoundException(String message) {
        super(message);
    }
}
