package Variablesj;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a1:");
		double numberA1 = sc.nextDouble();
		
		System.out.println("Enter a2:");
		double numberA2 = sc.nextDouble();
		
		System.out.println("Enter a3:");
		double numberA3 = sc.nextDouble();
		
		double tempNumber = 0;
		
		tempNumber = numberA1;
		numberA1 = numberA2;
		numberA2 = tempNumber;
		
		
		tempNumber = numberA2;
		numberA2 = numberA3;
		numberA3 = tempNumber;
		
		System.out.println("The numbers: " + numberA1 + " " + numberA2 + " " + numberA3);
	}
}
