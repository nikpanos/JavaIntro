package oop.override;

public class Dog extends Animal {
	protected boolean isHungry;
	
	public Dog(double weight, boolean isHungry) {
		super(weight);
		this.isHungry = isHungry;
	}
	
	public void printInfo() {
		System.out.print("I am a dog and ");
		super.printInfo();
	}

	public boolean isHungry() {
		return isHungry;
	}
	
	public void feed(double foodWeight) {
		if (isHungry) {
			weight += foodWeight;
		}
	}
}
