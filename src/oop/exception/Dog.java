package oop.exception;

public class Dog {
	private double weight;
	
	public Dog() {
		this.weight = 4.2;
	}
	
	public void feed(double foodWeight) throws Exception {
		try {
			if (foodWeight < 0) {
				throw new IllegalArgumentException("foodWeight cannot be less than zero");
			}
		}
		catch (IllegalArgumentException ex) {
			System.out.println("foodWeight cannot be less than zero");
			return;
		}
		
		weight += foodWeight;
		
		if (weight > 1000) {
			throw new Exception("A dog cannot be over 1000 kg");
		}
	}

	public double getWeight() {
		return weight;
	}
}


