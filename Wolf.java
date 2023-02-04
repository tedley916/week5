package com.weekly.week5;

public class Wolf extends Animal {

	static final int NUMBER_OF_LEGS = 4;
	
	private String coatColor;

	
	public Wolf (String breed) {
		super(breed);
	}
	
	
	
	public Wolf(String breed, VOICE voice) {
		super(breed, voice);
		// TODO Auto-generated constructor stub
	}

	
	public Wolf () { super(); }
	
	final private boolean isGoodPet = false;
	
	@Override
	protected boolean isGoodPet() {
		return isGoodPet;
	}

	public String getCoatColor() {
		return coatColor;
	}

	public void setCoatColor(String coatColor) {
		this.coatColor = coatColor;
	}

}
