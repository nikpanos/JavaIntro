package oop.inheritance;

public class Dog extends Mammal {
	private String breed;
	
	public Dog(double weight, String breed) {
		super(weight);
		this.breed = breed;
	}
	
	public Dog() {
		super();
		this.breed = "Labrador";
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	public void feed(double foodWeight) {
		this.weight += foodWeight;
	}
}
