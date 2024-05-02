package com.weekly.week5;

import com.weekly.week5.Animal.VOICE;

public class Rescue {
		
	public static void main (String args[] ) {
		
		// class vs instance!!!!
		Rescue rescue = new Rescue();
		
		rescue.section1();
		rescue.section2();
	
	}
	
	private void section1() {
		
		String the4PillarsOfOOP = """
                        ----  Pillars of OOP ---\n
				             1. Encapsulation			
				             2. Abstraction		
				             3. Inheritance	
				             4. Polymorphism\n
				 		""";
		
		System.out.println (the4PillarsOfOOP);

		System.out.println ("----- inheritance -----");
		Dog dog = new Dog ("German Shepherd", VOICE.BARK);
		Wolf wolf = new Wolf ("Timber wolf", VOICE.YOWL);

		System.out.println ("1. Dog voice: " + dog.getVoice());  // voice from Animal
		System.out.println ("2. Wolf voice: " + wolf.getVoice());  // voice from Animal
		System.out.println ("3. Number oflegs = " + Dog.NUMBER_OF_LEGS);  // from Wolf static, notice the class name
		
		System.out.println ("4. Dog good pet: " + dog.isGoodPet());      // from Animal abstract
		System.out.println ("5. Wolf good pet: " + wolf.isGoodPet());
		
		System.out.println ("6. Dog AKA certiried :" + dog.isAKACertified());  // from Dog
		System.out.println ("7. Dog's howl: "  + dog.howl()); // from Wolf, not implemented in Dog
		System.out.println ("8. Dog AKA Certified: " + dog.isAKACertified());    // from Dog
		
		System.out.println("\n--- Compile time Polymorphism (method overloading) ---");
		dog.fastestAnimals("1. Golden Retriever");
		dog.fastestAnimals("2. Labrador Retriever,", "German Shepherd");
		dog.fastestAnimals("3. Irish Setter,", "Rotweiler,", "Doberman");
		// Mention signature constraints.  
		
		System.out.println("\n--- Runtime Polymorphism ---");
		//		Dog dogAsAniumal = new Animal();  // can't do it, Animal is not a type of dog
		//      Wrong: <Sub-class> reference = new <Super-class>();
		//		Right: <Super-class> reference = new <Sub-class();
		
		// A Dog as a type of Animal
		Animal dogAsTypeOfAnimal = new Dog(10, 50);
		dogAsTypeOfAnimal.setVoice(VOICE.BARK);
				
		// A wolf as a type of animal
		Animal wolfAsTypeOfAnimal = new Wolf(10, 50);
		wolfAsTypeOfAnimal.setVoice(VOICE.HOWL);

		// Directly from constructor
		System.out.println("1. dog as animal voice: " + dogAsTypeOfAnimal.getVoice());  
		System.out.println("2. wolf as animal voice: " + wolfAsTypeOfAnimal.getVoice());
		// abstract in Animal, overridden in Dog and Wolf"
		System.out.println ("3. Dog as type of animal good pet: " + dogAsTypeOfAnimal.isGoodPet());
		System.out.println ("4. Wolf as type of animal good pet: " + wolfAsTypeOfAnimal.isGoodPet());	
		// getters/setters in Animal, overridden in Dog and Wolf"
		System.out.println ("5. " + wolfAsTypeOfAnimal.weightDescription());
		System.out.println ("6. " + dogAsTypeOfAnimal.weightDescription()); 
		// declared as abstract in Animal and overridden in Wolf and Dog
		System.out.println ("7. Dog are: " + dogAsTypeOfAnimal.getLocations());
		System.out.println ("8. Wolves are in: " + wolfAsTypeOfAnimal.getLocations());
		 
		 // To use a method that's in the base class, use a cast
		// dogAsTypeOfAnimal).setCoatColor("silver");
		((Wolf) dogAsTypeOfAnimal).setCoatColor("silver");
		((Dog) dogAsTypeOfAnimal).setCoatColor("brown");
		((BullDog) dogAsTypeOfAnimal).setCoatColor("brown");
		
		System.out.println ("9. coat color:  " + ((Wolf) dogAsTypeOfAnimal).getCoatColor());

		/*
		 *   Use base Class to instantiate so you can substitute any subclass later in development.
		 *   This works because getCoatColor() is declared in the base class Wolf.	
		 *   coatColor set in Wolf, base Class here is Wolf
		 */
		
		Animal bdAsAnimal = new BullDog(10, 50);
		// bdAsAnimal.listOfbullDogSupportGroups();
		// ((BullDog) bdAsAnimal).listOfbullDogSupportGroups();  // class cast exception because BullDog is subclass of Dog
		
		Wolf dogAsTypeOfWolf = new Dog(10,10);
		//dogAsTypeOfWolf.setCoatColor("brown");
		System.out.println ("10. coat color:  " + dogAsTypeOfWolf.getCoatColor()); // coatColor from Wolf
		System.out.println ("11. coat color:  " + ((Dog) dogAsTypeOfAnimal).getCoatColor());
		
		System.out.println("\n--- Objects are self-aware!!!! ---");
		System.out.println ("12. I am a " + dog.whatAmI());
		System.out.println ("13. I am a " + wolf.whatAmI());
		System.out.println ("14. I am a " + dogAsTypeOfAnimal.whatAmI());
		System.out.println ("15. I am a " + dogAsTypeOfWolf.whatAmI());
	}
	
	private void section2() {
		System.out.println ("\n--- Static Variables and methods ---");
		Dog.birthDate();
		Wolf.birthDate();
		Animal.birthDate();
	}

}
