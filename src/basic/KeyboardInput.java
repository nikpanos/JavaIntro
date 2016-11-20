package basic;

import java.util.Scanner;

public class KeyboardInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Give an integer: ");
		int i = sc.nextInt();
		System.out.println("You gave: " + i);
		
		if (i > 5) {
			System.out.println("The integer you gave is greater than 5.");
		}
		else if (i == 5) {
			System.out.println("The integer you gave is equal to 5.");
		}
		else {
			System.out.println("The integer you gave is lower than 5.");
		}
		
		while (i < 10) {
			i++;
			System.out.println("New value of i (while): " + i);
		}
		
		do {
			i -= 2;
			System.out.println("New value of i (do...while): " + i);
		} while (i > 0);
		
		for (i = 0; i < 5; i++) {
			System.out.println("New value of i (for): " + i);
		}
	}
}
