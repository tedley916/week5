package com.weekly.week5;

interface Animals {
	String animalColor();
	short numberOfLegs();
	boolean isViviparous();
}

public class Interfaces {

	public static void main(String[] args) {
		Animals longhorn = new Cow();
		Animals blackWidow = new Spider();
		
		// Long horn
		System.out.println("A longhorn cow is " + longhorn.animalColor() + ".");
		System.out.println("A longhorn cow has " + longhorn.numberOfLegs() + " legs.");
		System.out.println (longhorn.isViviparous() 
							? "Cows give live birth." 
							: "Cows lay eggs to birth their young."); 
	
		// Black widow
		System.out.println("A Black widow spider is " + blackWidow.animalColor() + ".");
		System.out.println("A Black widow spider has " + blackWidow.numberOfLegs() + " legs.");
		System.out.println (blackWidow.isViviparous() 
							? "Spiders give live birth." 
							: "Spiders lay eggs to birth their young."); 
	}
}  // Interfaces



class Cow implements Animals {

	@Override
	public String animalColor() {
		return "brown and white";
	}

	@Override
	public short numberOfLegs() {
		return 4;
	}

	@Override
	public boolean isViviparous() {
		return true;
	}
	
} // Cow


class Spider implements Animals {

	@Override
	public String animalColor() {
		return "black and red";
	}

	@Override
	public short numberOfLegs() {
		return 8;
	}

	@Override
	public boolean isViviparous() {
		return false;
	}
	
} // Spider