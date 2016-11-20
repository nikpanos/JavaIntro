package oop.exception;

public class Program {

	public static void main(String[] args) throws Exception {
		Dog rex = new Dog();
		
		try {
			rex.feed(-0.3);
			
			rex.feed(1500);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		rex.feed(0.2);
	}

}


