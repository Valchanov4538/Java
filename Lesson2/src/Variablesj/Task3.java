package Variablesj;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = 0;
		
		c = a;
		a = b;
		b = c;
		
		System.out.println(a);
		System.out.println(b);
	}

}
