package edu.saintjoe.cs.yohanesl.AnimalsYJL;

public class AnimalTester {

	public static void main(String[] args) {
		// Demonstration of various constructors
		// This instantiation calls the "default" (no parameter) constructor
		Animal myPet = new Animal();
		
		// This one uses the one-parameter constructor
		Animal myLocalPet = new Animal(23);
		
		//This instantiation uses the third constructor
		// uses the fourth
		// uses the fifth
		// uses the sixth
		
		
		System.out.println("My animal has " + myPet.location + " as its location");
		System.out.println("My animal has " + myLocalPet.location + " as its location");
		

	}

}
