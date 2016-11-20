package oop.inheritance;

public class Main {

	public static void main(String[] args) {
		Mammal myMammal = new Mammal();
		myMammal.setWeight(5.9);
		System.out.println("myMammal's weight: " + myMammal.getWeight());
		
		Dog rex = new Dog();
		rex.setWeight(4.8);
		System.out.println("Rex's weight: " + rex.getWeight());
		rex.setBreed("German shepherd");
		System.out.println("Rex's breed: " + rex.getBreed());
		
		Dog idefix = new Dog(3.4, "Terrier");
		System.out.println("Idefix's weight: " + idefix.getWeight());
	}

}
