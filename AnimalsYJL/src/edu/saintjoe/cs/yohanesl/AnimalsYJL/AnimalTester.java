package edu.saintjoe.cs.yohanesl.AnimalsYJL;

public class AnimalTester {

	public static void main(String[] args) {
		// Demonstration of various constructors
		Animal myPet = new Animal();
		Animal myLocalPet = new Animal(23);
		
		System.out.println("My animal has " + myPet.location + " as its location");
		System.out.println("My animal has " + myLocalPet.location + " as its location");
		

	}

}
