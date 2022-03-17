package Variablesj;

import java.util.Scanner;

public class Task11 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		int firstDigit = number / 100;
		int secondDigit = (number / 10) % 10;
		int thirdDigit = number % 10;
		
		if (firstDigit != 0 && secondDigit != 0 && thirdDigit != 0) {
			if (number % firstDigit == 0 && number % secondDigit == 0 && number % thirdDigit == 0) {
				System.out.println("The number is divided by every digit from its digits.");
			} else {
				System.out.println("Òhe number is not divisible by at least one of its digits.");
			}
		} else {
			System.out.println("The number contains zero digit.");
		}
	}
}
