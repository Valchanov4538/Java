import java.util.Scanner;

public class Task15 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int number = sc.nextInt();
		
		int sum = 0;
		for (int i = 1; i <= number; i++) {
			sum += i;
		}
		
		System.out.println(sum);
	}
}
