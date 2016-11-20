package oop.override;

public class Program {

	public static void main(String[] args) {
		Dog rex = new Dog(12.6, true);
		Puppy rocky = new Puppy(3.2, true);
		
		rex.printInfo();
		rocky.printInfo();
		
		rex.feed(1.2);
		rocky.feed(0.8);
		
		rex.printInfo();
		rocky.printInfo();
	}

}
