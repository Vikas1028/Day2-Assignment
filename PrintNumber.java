
package Ifelse;
import java.util.Scanner;

public class PrintNumber {

	static float Number;
	
	public static void main(String[] args)
	{
		System.out.println("Enter number of power of 10 like 1, 10, 100, etc");
		Scanner a=new Scanner(System.in);
		System.out.print("Enter any Number: ");
		Number=a.nextInt();
		
		if(Number==1) {
			System.out.println("Unit");
		}
		else if(Number==10) {
			System.out.println("ten");
		}
		else if(Number==100) {
			System.out.println("Hundred");
		}
		else if(Number==1000) {
			System.out.println("Thousand");
		}
		else if(Number==10000) {
			System.out.println("Ten-Thousand");
		}
		else if(Number==100000) {
			System.out.println("Hundred-Thousand");
		}
		else if(Number==1000000) {
			System.out.println("Million");
		}
		else if(Number==10000000) {
			System.out.println("Ten-Million");
		}
		else if(Number==100000000) {
			System.out.println("Hundred-Million");
		}
		else if(Number==1000000000) {
			System.out.println("Billion");
		}
		else {
			System.out.println("Please Enter Number Of power of 10");
		}
		a.close();
	}
}
