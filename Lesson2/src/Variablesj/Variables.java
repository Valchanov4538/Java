package Variablesj;

import java.util.Scanner;

public class Variables {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number with floating point");
		double a = sc.nextDouble();
		
		System.out.println("Enter number with floating point");
		double b = sc.nextDouble();
		
		System.out.println("Enter number with floating point");
		double c = sc.nextDouble();
		
		if(a<c && b>c)
		{
			System.out.println("The number " + c + " is between " + a + " and " + b + ".");
		}else {
			System.out.println("The number " + c + " is not between " + a + " and " + b + ".");
		}
		
		
		
		
		
		

	}

}
