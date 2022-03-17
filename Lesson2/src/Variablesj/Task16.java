package Variablesj;

import java.util.Scanner;

public class Task16 {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		int firstDigit = number / 100;
		int secondDigit = (number / 10) % 10;
		int thirdDigit = number % 10;
		
		if (firstDigit == secondDigit && secondDigit == thirdDigit) {
			System.out.println("Equal.");
		} else if (firstDigit > secondDigit && secondDigit > thirdDigit) {
			System.out.println("Descending order");
		} else if (firstDigit < secondDigit && secondDigit < thirdDigit) {
			System.out.println("Ascending order");
		} else {
			System.out.println("Unordered");
		}
	}
}