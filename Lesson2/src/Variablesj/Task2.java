package Variablesj;

import java.util.Scanner;

public class Task2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter A:");
		int numberA = sc.nextInt();
		
		System.out.println("Enter B:");
		int numberB = sc.nextInt();
		
		int sumOfAandB = numberA + numberB;
		System.out.println("The sum of A and B is " + sumOfAandB + ".");
		
		int subtractionOfAandB = numberA - numberB;
		System.out.println("The substraction of A and B is " + subtractionOfAandB + ".");
		
		int productOfAandB = numberA * numberB;
		System.out.println("The product of A and B is " + productOfAandB + ".");
		
		int remainderOfAandB = numberA % numberB;
		System.out.println("The remainder of A and B is " + remainderOfAandB + ".");
		
		int intDivisionOfAandB = numberA / numberB;
		System.out.println("The integer division of A and B is " + intDivisionOfAandB + ".");
		
		
		System.out.println("Enter C:");
		double numberC = sc.nextDouble();
		
		System.out.println("Enter D:");
		double numberD = sc.nextDouble();
		
		double sumOfCandD = numberC + numberD;
		System.out.println("The sum of C and D is " + sumOfCandD + ".");
		
		double subtractionOfCandD = numberC - numberD;
		System.out.println("The substraction of C and D is " + subtractionOfCandD + ".");
		
		double productOfCandD = numberC * numberD;
		System.out.println("The product of C and D is " + productOfCandD + ".");
		
		double remainderOfCandD = numberC % numberD;
		System.out.println("The remainder of C and D is " + remainderOfCandD + ".");
		
		double doubleDivisionOfCandD = numberC / numberD;
		System.out.println("The float division of C and D is " + doubleDivisionOfCandD + ".");
	}
}
