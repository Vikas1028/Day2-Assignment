package OperatorPrograme;

import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {

		// declare variable
		int x, y;

		// user input
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter point X: ");
		x = inp.nextInt();
		System.out.print("Enter point Y: ");
		y = inp.nextInt();

		// compute distance to (0, 0)
		double dist = Math.sqrt(x * x + y * y);

		// output distance
		System.out.println("distance from (" + x + ", " + y + ") to (0, 0) = " + dist);

		inp.close();
	}
}