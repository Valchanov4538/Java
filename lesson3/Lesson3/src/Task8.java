import java.util.Scanner;

public class Task8 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter n:");
		int number = sc.nextInt();
		int tempNum = number - 1;
		
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= number; j++) {
				System.out.print(tempNum);
			}
			tempNum += 2;
			System.out.println();
		}
	}
}
