package ForLoop;

import java.util.Scanner;

public class PalindromeNumber {

	static int Number, b, Sum, c;

	public static void main(String[] args) {
		System.out.print("Enter any Number: ");
		Scanner a = new Scanner(System.in);
		Number = a.nextInt();
		c = Number;

		for (int i = Number; i != 0; i--) {

			b = i % 10;
			Sum = Sum * 10 + b;
			i = i / 10 + 1;
		}

		if (c == Sum) {
			System.out.println(c + " is a Palindrome Number");
		} else {
			System.out.println(c + " is not a Palindrome Number");
		}
	 a.close();
	}
}