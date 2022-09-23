package ForLoop;

import java.util.Scanner;

public class ReverseNumber {

	static int Number, b, Sum;

	public static void main(String[] args) {
		System.out.print("Enter any Number: ");
		Scanner a = new Scanner(System.in);
		Number = a.nextInt();

		for (int i = Number; i != 0; i--) {

			b = i % 10;
			Sum = Sum * 10 + b;
			i = i / 10 + 1;
		}

		System.out.println("Reverse: " + Sum);
		a.close();
	}
}
