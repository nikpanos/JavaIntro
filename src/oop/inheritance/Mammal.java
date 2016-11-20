package oop.inheritance;

public class Mammal {
	protected double weight;
	
	public Mammal() {
		this.weight = 4.2;
	}
	
	public Mammal(double weight) {
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
}
