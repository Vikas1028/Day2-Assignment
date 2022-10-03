package SwitchCase;

import java.util.Scanner;

public class checkVowelOrConsonant {

	public static void main(String[] args) {

		// declare variable
		String c, Character;

		// user input
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter any Character between A to z : ");
		c = inp.next();

		Character = c.toUpperCase();

		switch (Character) // Checking Vowel Character using Switch Case
		{
		case "A":
			System.out.println(Character + " is a Vowel.");
			break;
		case "E":
			System.out.println(Character + " is a Vowel.");
			break;
		case "I":
			System.out.println(Character + " is a Vowel.");
			break;
		case "O":
			System.out.println(Character + " is a Vowel.");
			break;
		case "U":
			System.out.println(Character + " is a Vowel.");
			break;

		default:
			System.out.println(Character + " is a Consonant.");
		}
		inp.close();

	}
}
