package com.weekly.week5;

import java.text.SimpleDateFormat;
import java.util.Date;

/**  
 *            4 Pillars of OOP
 *            1. Encapsulation			
 *            2. Abstraction		
 *            3. Inheritance	
 *            4. Polymorphism	
 
 Encapsulation or scope:
                                                   Subclass      Subclass      
                        Class    current package   (same pkg)    (dif package)  world
public                    x            x            x            x              x
protected                 x            x            x            x
package (no identifier)   x            x            x
private                   x

*/

// abstract class concrete class
public abstract class Animal {
	
	private String breed;
	private float height;
	private float weight;

	protected String className;

	private String locations = "At your house";
	
	VOICE voice;
	
	protected enum VOICE {
		BARK,
		BRAY,
		CHIRP,
		GROWL,
		HISS,
		HOWL,
		SCREACH,
		WHIMPER,
		YOWL,
		GENERIC_ANIMAL_NOISE,
		none
	}
	
	// only avaialble to use after custom constructor if explicitly declared
	public Animal() {} 

	public Animal (String breed) {
		this.breed = breed;
	}
	
	public Animal (float height, float weight) {
		this.setHeight(height);
		this.setWeight(weight);
		this.voice = VOICE.GENERIC_ANIMAL_NOISE;
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
	
	abstract protected boolean isGoodPet();
	
	abstract protected String weightDescription();

	protected String getLocations() {
		return locations;
	}

	 void setLocations(String locations) {
		this.locations = locations;
	}
	
	 // 
	protected void fastestAnimals(String x) {
		System.out.println (x);
	}
	
	protected void fastestAnimals(String x, String y, String z) {
		System.out.println (x + " " + y + " " + z);
	}
	protected void fastestAnimals(String x, String y) {
		System.out.println (x + " " + y);	
	}
	/*
	 * cannot do this!!
	 * Identical method signatures with differing method types do not quailty for method overriding,
	int fastestAnimals(String x) {
		System.out.println(44);
	}
	 */
	
	protected boolean isLiving() { return true; }
	
	public static void birthDate() {
		Date currentDate = new Date(); 
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
		String currentDateTime = dateFormat. format(currentDate);
		System.out.println ("birthdate : " + currentDateTime);
		// this.setLocation("noooo workie!!!");
	}
	
	protected String whatAmI() {
		String className = this.getClass().getSimpleName();
		return (className);
	}
	
	
}
