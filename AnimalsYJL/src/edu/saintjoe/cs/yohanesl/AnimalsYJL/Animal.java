package edu.saintjoe.cs.yohanesl.AnimalsYJL;

public class Animal {
	
		String picture;
		String location;
		int weight;
		
		/* ---- */
		
		// Note we have SIX constructors; each one has a different signature
		// Even though we didn't write this before; it was always here by default!
		
		public Animal() {
			// This is a constructor; see p. 241
			this.location = "Nowhere";
			this.picture = "No picture";
			
		}
		
		public Animal(String startingLocation) {
			this.location = startingLocation;
			
		}
		
		public Animal(int startingWeight) {
			// This is legal, but completely pointless
			this.weight = startingWeight;
		}
		
			// Add a two-string parameter here
		
		public Animal(String startLocation, String startPicture, int startWeight) {
			this.weight = startWeight;
			this.location = startLocation;
			this.picture = startPicture;
		}
		
		public Animal(int startWeight, String secondParam) {
			// Do nothing, just for fun
		}
		
		public Animal(String firstParm, int startWeight) {
			// Also pointless
		}
		
		public String makeNoise() {
			return ("Ommmmmmmmmmmmmm");
		}
		
		public void eat () {
			System.out.println("Animal is eating");
		}

	

}
