package Variablesj;

import java.util.Scanner;

public class Task9 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numberA = sc.nextInt();
		int numberB = sc.nextInt();
		
		int product = numberA * numberB;
		int lastDigitFromProduct = product % 10;
		
		if (lastDigitFromProduct % 2 == 0) {
			System.out.print(product + ", " + lastDigitFromProduct + " even");
		} else {
			System.out.print(product + ", " + lastDigitFromProduct + " odd");
		}
	}
}
