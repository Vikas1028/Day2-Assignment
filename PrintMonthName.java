package SwitchCase;

import java.util.Scanner;

public class PrintMonthName {

	public static void main(String[] args) {

		int Num;
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter any Number between 1 to 12 : ");
		Num = inp.nextInt();

		switch (Num) {
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("February");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("August");
			break;
		case 9:
			System.out.println("September");
			break;
		case 10:
			System.out.println("October");
			break;
		case 11:
			System.out.println("November");
			break;
		case 12:
			System.out.println("December");
			break;
		default:
			System.out.println("Please Enter Number 1 to 12");
		}
		inp.close();
	}
}
