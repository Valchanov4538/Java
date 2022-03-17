package Variablesj;

import java.util.Scanner;

public class Task5 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter A:");
		double numberA = sc.nextDouble();
		
		System.out.println("Enter B:");
		double numberB = sc.nextDouble();
		
		System.out.println("Enter C:");
		double numberC = sc.nextDouble();
		
		if (numberA > numberB && numberA > numberC) {
			if (numberB > numberC) {
				System.out.println("The numbers in descending order are: " + numberA + " " + numberB + " " + numberC);
			} else {
				System.out.println("The numbers in descending order are: " + numberA + " " + numberC + " " + numberB);
			}
		} else if (numberB > numberA && numberB > numberC) {
			if (numberA > numberC) {
				System.out.println("The numbers in descending order are: " + numberB + " " + numberA + " " + numberC);
			} else {
				System.out.println("The numbers in descending order are: " + numberB + " " + numberC + " " + numberA);
			}
		} else if (numberC > numberA && numberC > numberB) {
			if (numberA > numberB) {
				System.out.println("The numbers in descending order are: " + numberC + " " + numberA + " " + numberB);
			} else {
				System.out.println("The numbers in descending order are: " + numberC + " " + numberB + " " + numberA);
			}
		}
	}
}