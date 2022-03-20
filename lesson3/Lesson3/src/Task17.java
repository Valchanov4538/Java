import java.util.Scanner;

public class Task17 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int side = sc.nextInt();
		char c = sc.next().charAt(0);
		
		for (int i = 1; i <= side; i++) {
			System.out.print("*");
		}
		System.out.println();
		for (int row = 1; row <= side - 2; row++) {
			System.out.print("*");
			for (int col = 1; col <= side - 2; col++) {
				System.out.print(c);
			}
			System.out.println("*");
		}
		for (int i = 1; i <= side; i++) {
			System.out.print("*");
		}
	}
}
