import java.util.Scanner;

public class Task13 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int number = sc.nextInt();
		int sum = 0;
		
		for (int i = 100; i < 1000; i++) {
			int firstDigit = i / 100;
			int secondDigit = (i / 10) % 10;
			int thirdDigit = i % 10;
			sum += firstDigit + secondDigit + thirdDigit;
			
			if (sum == number) {
				System.out.print(i + ",");
			}
			sum = 0;
		}
		System.out.println();
	}
}
