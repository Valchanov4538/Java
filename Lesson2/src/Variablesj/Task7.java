package Variablesj;

import java.util.Scanner;

public class Task7 {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter hour");
		int hour = sc.nextInt();
		System.out.println("Enter amount of money");
		float money = sc.nextFloat();
		System.out.println("");
		boolean amIhealthy = sc.hasNext();
		
		if(!amIhealthy) {
			
			if(money>0) {
				System.out.println("buy medicine");
			}else {
				System.out.println("stay home and drink tea");
			}
		} else {
			if (money >= 10) {
				if (hour >= 10 && hour <= 22) {
					System.out.println("I will go to cinema with friends.");
				} else if (hour < 10 || hour > 22) {
					System.out.println("I will stay at home.");
				}
			} else if (money > 0 && money < 10){
				System.out.println("I will go to coffee.");
			}
		}
	}
}