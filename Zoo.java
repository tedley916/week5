package com.weekly.week5;

import com.weekly.week5.Animal.VOICE;

public class Zoo implements AnimalParkable {
		
	public static void main (String args[] ) {
		
		System.out.println ("main method");
		// class vs instance!!!!
		Zoo zoo = new Zoo();
		
		zoo.section1();
	//	zoo.section2(zoo);		
	}

	private void section1() {
		System.out.println ("------- 4 Pillars of OOP --------");

		// inheritance
		Dog dog1 = new Dog ("German Shepherd", VOICE.BARK);
		System.out.println (dog1.getVoice());
		System.out.println ("Number of legs = " + Dog.NUMBER_OF_LEGS);
		System.out.println ("----------");
		System.out.println ("Dog good pet? " + dog1.isGoodPet());
		Wolf wolf1 = new Wolf();
		System.out.println ("Wolf good pet? " + wolf1.isGoodPet());		
		// polymorphic behavior
		Wolf dog2 = new Dog();
		System.out.println ("Dog as type of wolf good pet? " + dog2.isGoodPet());	
		System.out.println ("----------");
		
		Dog dog3 = new Dog(23.4f, 53.4f);
		System.out.println (dog3.dogSize());
	}
	
	
	private void section2(Zoo myZoo) {
		System.out.println ("------- Interfaces --------");
		System.out.println (myZoo.numberOfAnimals(44));
	}

	@Override
	public String numberOfAnimals(int num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void cleanPublicAreas() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void openConsessionStands() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void openGiftShop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void startParkRides() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getSickAnimalReport() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
