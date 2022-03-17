package Variablesj;

import java.util.Scanner;

public class Task13 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int celsius = sc.nextInt();
		
		if (celsius < -20) {
			System.out.println("Ice cold");
		} else if (celsius >= -20 && celsius < 0) {
			System.out.println("Cold");
		} else if (celsius >= 0 && celsius < 15) {
			System.out.println("Cool");
		} else if (celsius >= 15 && celsius < 25) {
			System.out.println("Warm");
		} else if (celsius >= 25) {
			System.out.println("Hot");
		}
	}
}