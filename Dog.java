package com.weekly.week5;

public class Dog extends Wolf {
	
	private boolean akaCertified;
	private String locations = "Everywhere";
	
	public Dog () { super(); } 
	
	public Dog (String breed) {
		super(breed);
	}
	
	public Dog(String breed, VOICE voice) {
		super(breed, voice);
	}
	
	public Dog (float height, float weight) {
		super(height, weight);   // constructor chaining.  
		this.setHeight(height);
		this.setWeight(weight);
	}
	
	final private boolean isGoodPet = true;

	@Override
	public boolean isGoodPet() {
		return isGoodPet;
	}
	
	@Override
	public String weight() {
		if (this.getWeight() <= 10.0) {
			return "this is a tiny dog!";
		}
		else if (this.getWeight() <= 30.0) {
			return "this is a small dog!";
		}	
		else if (this.getWeight() <= 60.0) {
			return "this is a average dog!";
		}	
		else if (this.getWeight() <= 90.0) {
			return "this is a large dog!";
		}	
		return "This dog is HUGE!!!!";
	}

	public boolean isAKACertified() {
		return akaCertified;
	}

	public void setAKACertified(boolean akaACertified) {
		this.akaCertified = akaACertified;
	}
	
	@Override
	public String getLocations() {
		return locations;
	}

	@Override
	public void setLocations(String locations) {
		this.locations = locations;
	}
	
	@Override
	public String howl() {
		return "whenever";
	}

}

