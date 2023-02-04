package com.weekly.week5;

@SuppressWarnings("serial")
public class DogNotFoundException extends Exception {

    public DogNotFoundException() {
        super();
    }
	
    public DogNotFoundException(String message) {
        super(message);
    }
}
