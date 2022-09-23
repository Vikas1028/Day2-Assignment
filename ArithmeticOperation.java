package OperatorPrograme;
import java.util.Scanner;

public class ArithmeticOperation {

	public static void main(String[] args) {
		//variable declaratino
		int A,B,C,D,E,F,G,Min,Max;
		
		//use Scanner
		Scanner inp=new Scanner(System.in);
		System.out.print("Enter any NUmber A: ");
		A=inp.nextInt();
		System.out.print("Enter any Number B: ");
		B=inp.nextInt();
		System.out.print("Enter any Number C: ");
		C=inp.nextInt();
		
		//perform arithmatic operations
		D=A+B*C;
		System.out.println("A+B*C: " +D);
		E=C+A/D;
		System.out.println("C+A/D: " +E);
		F=A%B+C;
		System.out.println("A%B+C: " +F);
		G=A*B+C;
		System.out.println("A*B+C: " +G);
		
		//find maximum number
		if(D>E && D>F && D>G){
			Max=D;
		}
		else if(E>D && E>F && E>G) {
			Max=E;
		}
		else if(F>D && F>E && F>G) {
			Max=F;
		}
		else {
			Max=G;
		}
		System.out.println("Maximum Number is: "+Max);
		
		//find Minimum number
		if(D<E && D<F && D<G) {
			Min=D;
		}
		else if(E<D && E<F && E<G) {
			Min=E;
		}
		else if(F<D && F<E && F<G) {
			Min=F;
		}
		else {
			Min=G;
		}
		System.out.println("Minimum Number is: "+Min);
		
		
		inp.close();
	}
}
