package OperatorPrograme;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {

		// variable declare
		double A, B, C, Delta, R1, R2;

		// user input
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter Value of A: ");
		A = inp.nextDouble();
		System.out.print("Enter Value of B: ");
		B = inp.nextDouble();
		System.out.print("Enter Value of C: ");
		C = inp.nextDouble();

		// to find the roots of the equation a*x*x + b*x + c
		// First find delta = b*b - 4*a*c
		Delta = B * B - 4 * A * C;

		if (Delta > 0) {

			R1 = (-B + Math.sqrt(Delta)) / (2 * A);
			R2 = (-B - Math.sqrt(Delta)) / (2 * A);

			System.out.format("root1 = %.2f and root2 = %.2f", R1, R2);
		}

		else if (Delta == 0) {

			R1 = R2 = -B / (2 * A);
			System.out.format("root1 = root2 = %.2f;", R1);
		}

		else {

			double real = -B / (2 * A);
			double imaginary = Math.sqrt(-Delta) / (2 * A);
			System.out.format("root1 = %.2f+%.2fi", real, imaginary);
			System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
		}
		inp.close();
	}
}
