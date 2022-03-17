package Variablesj;

import java.util.Scanner;

public class Task14 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int positionOneX = sc.nextInt();
		int positionOneY = sc.nextInt();
		int positionTwoX = sc.nextInt();
		int positionTwoY = sc.nextInt();
		
		if (positionOneX == positionTwoX && positionOneY == positionTwoY) {
			System.out.println("Positions are with the same color.");
		} else {
			System.out.println("Positions are with different color.");
		}
	}
}