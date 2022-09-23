package OperatorPrograme;
import java.util.Scanner;

public class SpringSeason {

	public static void main(String[] args) {
		//declare variable
		int Month, Day;
		
		//get input 
		Scanner inp=new Scanner(System.in);
		System.out.print("Enter Month valaue from 1 to 12 : ");
		Month=inp.nextInt();
		System.out.print("Enter Day valaue from 1 to 31 : ");
		Day=inp.nextInt();
		
		//find enter value is true or false
		if((Month==4 && (Day>=1 || Day<=30)) || (Month==3 && (Day>=20 || Day<=31)) || (Month==5 && (Day>=1 || Day<=31)) || (Month==6 && (Day>=1 || Day<=20))) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		inp.close();
		
	}
}
