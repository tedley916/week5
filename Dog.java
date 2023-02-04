package com.weekly.week5;

import com.weekly.week5.Animal.VOICE;

public class Dog extends Wolf {
	
	public Dog () { super(); } 
	
	public Dog (String breed) {
		super(breed);
	}
	
	public Dog(String breed, VOICE voice) {
		super(breed, voice);
	}
	
	public Dog (float height, float weight) {

		this.height = height;
		this.weight = weight;
	}
	
	final private boolean isGoodPet = true;

	@Override
	public boolean isGoodPet() {
		return isGoodPet;
	}
	
	public String dogSize() {
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
}
