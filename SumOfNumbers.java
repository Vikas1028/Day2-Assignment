package ForLoop;

import java.util.Scanner;

public class SumOfNumbers {

	static int Number, sum = 0, b;

	public static void main(String[] args) {

		System.out.print("Enter any Number: ");
		Scanner a = new Scanner(System.in);
		Number = a.nextInt();
		b = Number;
		for (int i = Number; i != 0; i--) {

			sum = sum + i;
		}
		System.out.println("Sum of " + b + " natural numbers: " + sum);
		a.close();
	}
}
