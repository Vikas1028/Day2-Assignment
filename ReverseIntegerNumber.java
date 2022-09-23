package WhileLoop;

import java.util.Scanner;

public class ReverseIntegerNumber {

	static int Number, b, Sum;

	public static void main(String[] args) {
		System.out.print("Enter any Number: ");
		Scanner a = new Scanner(System.in);
		Number = a.nextInt();

		while (Number != 0) {

			b = Number % 10;
			Sum = Sum * 10 + b;
			Number = Number / 10;
		}

		System.out.println("Reverse: " + Sum);
		a.close();
	}
}
