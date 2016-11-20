package oop;

public class Dog {
	int age;
	double weight;
	boolean isHungry;
	
	Dog() {
		age = 0;
		weight = 0.0;
		isHungry = false;
	}
	
	Dog(int age, double weight, boolean isHungry) {
		this.age = age;
		this.weight = weight;
		this.isHungry = isHungry;
	}
	
	void speak() {
		System.out.println("woof!");
	}
	
	void feed(double foodWeight) {
		if (isHungry) {
			weight += foodWeight;
			isHungry = false;
		}
	}
}
