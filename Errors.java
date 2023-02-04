package com.weekly.week5;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Errors {

	public static void main(String[] args)  {
		boolean run = true;
		//////////////////////////
		// Unhecked exceptions 
		//////////////////////////
		// 1. Things (errors) that occur at RUNTIME that Shouldn't 
		// 2. Program crashes because it doesn't know how to continue
		// 3.  Things the developer is responsible to catch. 

	
		if ( !run ) {	
		// java.lang.ArithmeticException
			int x = 0, y = 0;
			int q = x / y;  
		}

		if ( !run ) {	
		// java.lang.ArrayIndexOutOfBoundsException
			int[] intArr = { 1,2,3,4 };
			int intVal = intArr[3];
		}
		
		String str = null;

		if ( !run ) {	
		// java.lang.NullPointerException
		// null guard 
			if (str != null) {
				System.out.println (str.length());
			} else {
				System.out.println ("execute alternate code");
			}
			
		}

		// or just use try/catch
		if ( !run ) {					
			str = null;  // run as null and !null

			try {
				System.out.println ("no exception thrown " + str.length());
			} catch (Exception e) {
				System.out.println ("str is null");
			} finally {
				System.out.println ("This code runs unconditionally");
			}
		}
		
		//////////////////////////
		// Checked exceptions 
		//////////////////////////
		// 1. Things (errors) that occur at COMPILE TIME
		// 2. caught by existing try/catch and throws statements

		if ( !run ) {
		//  FileReader noSuchFile = new FileReader("no-such-file.txt");
		
			try {
				FileReader file = new FileReader("no-such-file.txt");
			} catch (FileNotFoundException e) {
			//	e.printStackTrace();
				System.err.println ("stack trace printed");
			}
		
		}

		if ( !run ) {
			
			Errors errs = new Errors();
			try {			
				//	errs.exception1(20, 10);
				//	System.out.println (errs.exception2(20, 0));
				//  errs.exception3();
				//	errs.exception4();
					errs.exception5();
			} catch (Exception e) {
				System.out.println (e.getMessage());
			}
		}
	
		if ( run ) {
		
			Errors errs = new Errors();
			List<Dog> dogList = new ArrayList<>();
			dogList.add (new Dog("Poodle"));
			dogList.add (new Dog("German Shepherd"));
			dogList.add (new Dog("Beagle"));		
			dogList.add (new Dog("Rottweiler"));		
			dogList.add (new Dog("Bulldog"));		
			dogList.add (new Dog("Labrador Retriever"));		
			dogList.add (new Dog("Golden Retriever"));		
				
			String breed = "Jack Russell Terrier";
			try {
				errs.findDog(breed, dogList);
				System.out.println (breed + " Found!");		
			} catch (DogNotFoundException d) {
				System.out.println (d.getMessage());
			}

		}
	}  // main
	
	void exception1(int x, int y)  {
		System.out.println (x + " / "+ y + " + "  + x / y);
	}

	// manually check for the condition causing the exception and throw it yourself.
	int exception2 (int x, int y) throws Exception {
		if (y == 0) {
			throw new Exception ("Division by zero not allowed");
		}
		return x / y;
	}
	
	// notice no try/catch block because the of the thrown keyword
	void exception3 () throws IOException {
		FileReader file = new FileReader("no-such-file.txt");
	}
	
	// multiple catches
	
	// toss them back upstream
	void exception4 () throws NullPointerException, Exception {
		FileReader file = new FileReader("/users/tedstandley/Documents/foo.txt");
		String foo = null;
		System.out.println (foo.length());
	}
	
	// catch and handle locally
	void exception5 () {
		try {
			// throws FileNotFoundException
			FileReader file = new FileReader("/users/tedstandley/Documents/foo.txt"); 
			
			// throws NullPointerException
			String foo = null;
			System.out.println (foo.length());
			
			// throws ArithmeticException but notice that Exception caught it.
			exception1(20,10);
			
		} catch (IOException e) {
			System.out.println (e.getClass().toString());
		} catch (NullPointerException e) {
			System.out.println (e.getClass().toString());
		} catch (Exception e) {
			System.out.println (e.getClass().toString());
		}	
	}

	public void findDog(String breed, List<Dog> dogs) throws DogNotFoundException {
		boolean dogFound = false;
		for (Dog dog : dogs) {
			if (dog.getBreed().equals(breed)) {
				dogFound = true;    
				break;
			}
		}
		if (!dogFound) {
			throw new DogNotFoundException (breed + " not found!");
		}
	}

}
