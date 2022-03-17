package Variablesj;

import java.util.Scanner;

public class Task8 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int number = sc.nextInt();
		
		int firstDigit = (number / 1000) * 10;
		int fourthDigit = (number % 10);
		int firstTwoDigitsNumber = firstDigit + fourthDigit;
		
		int secondDigit = ((number / 100) % 10) * 10;
		int thirdDigit = (number / 10) % 10;
		int secondTwoDigitsNumber = secondDigit + thirdDigit;
		
		if (firstTwoDigitsNumber > secondTwoDigitsNumber) {
			System.out.println("Greater than (" + firstTwoDigitsNumber + ">" + secondTwoDigitsNumber + ")");
		} else if (firstTwoDigitsNumber < secondTwoDigitsNumber) {
			System.out.println("Less than (" + firstTwoDigitsNumber + "<" + secondTwoDigitsNumber + ")");
		} else {
			System.out.println("Equals (" + firstTwoDigitsNumber + "=" + secondTwoDigitsNumber + "");
		}
	}
}
