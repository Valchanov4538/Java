package Variablesj;

import java.util.Scanner;

public class Task15 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		
		if (hour >= 4 && hour < 9) {
			System.out.println("Good morning");
		} else if (hour >= 9 && hour < 18) {
			System.out.println("Good afternoon");
		} else if ((hour >= 18 && hour <= 23) || (hour >= 0 && hour < 4)) {
			System.out.println("Good evening");
		}
	}
}
