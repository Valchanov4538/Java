import java.util.Scanner;

public class Task19 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int number = sc.nextInt();
		
		while(number != 1) {
			if(number % 2 == 0) {
				number /= 2;
			} else {
				number = (number * 3) + 1;
			}
			System.out.print(number + " ");
		}
		System.out.println();
	}
}
