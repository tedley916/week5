package com.weekly.week5;

public class Wolf extends Animal {

	static final int NUMBER_OF_LEGS = 4;
	
	private String coatColor;
	private String locations = "Colder wilderness climates";  // concrete in Animal

	
	public Wolf (String breed) {
		super(breed);
	}
	
	public Wolf(String breed, VOICE voice) {
		super(breed, voice);
	}
	
	public Wolf (float height, float weight) {
		super(height, weight);
		this.setHeight(height);
		this.setWeight(weight);
	}
	
	public Wolf () { super(); }
	
	final private boolean isGoodPet = false;
	
	@Override
	protected boolean isGoodPet() {
		return isGoodPet;
	}

	public String howl() {
		return "yes";
	}
	
	@Override
	public String weightDescription() {
		if (this.getWeight() <= 50.0) {
			return "this is a tiny wolf!";
		}
		else if (this.getWeight() <= 1000.0) {
			return "this is a small wolf!";
		}	
		else if (this.getWeight() <= 150.0) {
			return "this is a average wolf!";
		}	
		else if (this.getWeight() <= 200.0) {
			return "this is a large wolf!";
		}	
		return "This wolf is HUGE!!!!";
	}
	
	
	public String getCoatColor() {
		return coatColor;
	}

	public void setCoatColor(String coatColor) {
		this.coatColor = coatColor;
	}
	
	@Override
	public String getLocations() {
		return locations;
	}

	@Override
	public void setLocations(String locations) {
		this.locations = locations;
	}

}
