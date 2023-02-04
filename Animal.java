package com.weekly.week5;

/**  
 *          4 Pillars of OOP
 *            1. Encapsulation			
 *            2. Abstraction		
 *            3. Inheritance	
 *            4. Polymorphism	
 
 Encapsulation or scope:
                                                  Subclass      Subclass      
                        Class       package P     (same pkg)    (dif package)  world
public                    x            x            x            x            x
protected                 x            x            x            x
package (no identifier)   x            x            x
private                   x

*/

// abstract class concrete class
public abstract class Animal {
	
	private String breed;
	protected float height;
	protected float weight;
	protected boolean hasFur;
	
	
	VOICE voice;
	
	public enum VOICE {
		BARK,
		BRAY,
		CHIRP,
		GROWL,
		HISS,
		HOWL,
		SCREACH,
		WHIMPER,
		YOWL,
		none
	}
	
	// only avaialble to use after custom constructor if explicitly declared
	public Animal() {}

	public Animal (String breed) {
		this.breed = breed;
	}

	public Animal (String breed, VOICE voice) {
		this.breed = breed;
		this.voice = voice;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public VOICE getVoice() {
		return voice;
	}

	public void setVoice(VOICE voice) {
		this.voice = voice;
	}
	
	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public boolean isHasFur() {
		return hasFur;
	}
	
	protected abstract boolean isGoodPet();
	
}
