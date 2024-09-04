package com.weekly.week5;

public class BullDog extends Dog {
	
	private boolean skinFoldProblems;
	private boolean eyeProblems;

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

	public boolean hasSkinFoldProblems() {
		return skinFoldProblems;
	}

	public void setSkinFoldProblems(boolean skinFoldProblems) {
		this.skinFoldProblems = skinFoldProblems;
	}

	public boolean hasEyeProblems() {
		return eyeProblems;
	}

	public void setEyeProblems(boolean eyeProblems) {
		this.eyeProblems = eyeProblems;
	}
	
}
