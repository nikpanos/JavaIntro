package oop.override;

public class Animal {
	protected double weight;
	
	public Animal(double weight) {
		this.weight = weight;
	}
	
	public void printInfo() {
		System.out.println("I am an animal. My weight is " + weight + " kg");
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void feed(double foodWeight) {
		weight += foodWeight;
	}
}
