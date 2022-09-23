package Ifelse;

import java.util.Scanner;

public class ReadNumber {

	static int Number;

	public static void main(String[] args) {

		// user input
		Scanner A = new Scanner(System.in);
		System.out.print("Enter any single Digit Number: ");
		Number = A.nextInt();

		if (Number == 0) {
			System.out.println("Zero");
		} else if (Number == 1) {
			System.out.println("One");
		} else if (Number == 2) {
			System.out.println("Two");
		} else if (Number == 3) {
			System.out.println("Three");
		} else if (Number == 4) {
			System.out.println("Four");
		} else if (Number == 5) {
			System.out.println("Five");
		} else if (Number == 6) {
			System.out.println("six");
		} else if (Number == 7) {
			System.out.println("seven");
		} else if (Number == 8) {
			System.out.println("Eight");
		} else if (Number == 9) {
			System.out.println("Nine");
		} else {
			System.out.println("Enter only single digit Number");
		}
		A.close();
	}
}
