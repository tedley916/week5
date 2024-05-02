package com.weekly.week5;

import java.util.List;

public class BullDog extends Dog {

	public BullDog () { super(); } 
	
	public BullDog (String breed) {
		super(breed);
	}
	
	public BullDog(String breed, VOICE voice) {
		super(breed, voice);
	}
	
	public BullDog (float height, float weight) {
		super(height, weight);   // constructor chaining.  
		this.setHeight(height);
		this.setWeight(weight);
	}
	
	protected List<String> listOfbullDogSupportGroups() {
		return null;
	}
	
}
