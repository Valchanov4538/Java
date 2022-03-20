import java.util.Scanner;

public class Task11 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int number = sc.nextInt();
		
		for (int row = 1; row < number; row++) {
			for (int space = 1; space <= number - row; space++) {
				System.out.print(" ");
			}
			for (int stars = 1; stars <= 2 * row - 1; stars++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int dot = 1; dot <= 2 * number - 1; dot++) {
			System.out.print(".");
		}
		
		System.out.println();
	}
}
