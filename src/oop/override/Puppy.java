package oop.override;

public class Puppy extends Dog {
	
	public Puppy(double weight, boolean isHungry) {
		super(weight, isHungry);
	}
	
	public void printInfo() {
		System.out.print("I am a puppy and ");
		super.printInfo();
	}
	
	public void feed(double foodWeight) {
		if (isHungry) {
			if (foodWeight > 0.5) {
				weight += 0.5;
			}
			else {
				weight += foodWeight;
			}
		}
	}
}
