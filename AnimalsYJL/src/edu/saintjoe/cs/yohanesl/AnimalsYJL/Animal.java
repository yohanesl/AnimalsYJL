package edu.saintjoe.cs.yohanesl.AnimalsYJL;

public class Animal {
	
		String picture;
		String location;
		int weight;
		
		public Animal() {
			this.location = "Nowhere";
			this.picture = "No picture";
			
		}
		
		public Animal(String startingLocation) {
			this.location = startingLocation;
			
		}
		
		public Animal(int startingWeight) {
			this.weight = startingWeight;
		}
		
		
		public Animal(String startLocation, String startPicture, int startWeight) {
			this.weight = startWeight;
			this.location = startLocation;
			this.picture = startPicture;
		}
		
		public Animal(int startWeight, String secondParam) {
			
		}
		
		public Animal(String firstParm, int startWeight) {
			
		}
		
		public String makeNoise() {
			return ("Ommmmmmmmmmmmmm");
		}
		
		public void eat () {
			System.out.println("Animal is eating");
		}

	

}
