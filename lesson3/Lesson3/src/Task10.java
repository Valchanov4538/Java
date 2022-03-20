import java.util.Scanner;

public class Task10 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int number = sc.nextInt();
		boolean isPrime = false;
		
		for(int i = 2; i < number / 2; i++) {
			if(number % i != 0) {
				isPrime = true;
				break;
			}
		}
		
		if(isPrime) {
			System.out.println("Number " + number + " is prime.");
		} else {
			System.out.println("Number " + number + " is not prime.");
		}
	}
}
