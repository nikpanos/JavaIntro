package oop;

public class Main {

	public static void main(String[] args) {
		Dog rex = new Dog();
		rex.age = 5;
		rex.weight = 5.6;
		rex.isHungry = true;
		
		System.out.println("Rex's weight: " + rex.weight);
		rex.speak();
		
		rex.feed(0.2);
		System.out.println("Rex's new weight: " + rex.weight);
		
		Dog rocky = new Dog(5, 6.7, true);
		System.out.printf("Rocky's age: %d and weight: %f\n", rocky.age, rocky.weight);
	}

}
