package WhileLoop;

import java.util.Scanner;

public class sum {

	static int Number, sum = 0, b;

	public static void main(String[] args) {

		System.out.print("Enter any Number: ");
		Scanner a = new Scanner(System.in);
		Number = a.nextInt();
		b = Number;
		while (Number != 0) {

			sum = sum + Number;
			Number = Number - 1;
		}
		System.out.println("Sum of " + b + " natural numbers: " + sum);
		a.close();
	}

}
