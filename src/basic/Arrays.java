package basic;

import java.util.Scanner;

public class Arrays {
	public static void main(String[] args) {
		int[] array = {8, 2, 3, 10};
		for (int i = 0; i < 4; i++) {
			System.out.println("Value of array (for): " + array[i]);
		}
		
		for (int a : array) {
			System.out.println("Value of array (for enhanced): " + a);
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Give array size: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.print("Give array value: ");
			arr[i] = sc.nextInt();
		}
		for (int a : arr) {
			System.out.println("Value of arr: " + a);
		}
	}
}
