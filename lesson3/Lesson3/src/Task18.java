import java.util.Scanner;

public class Task18 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number:");
		int firstNumber = sc.nextInt();
		
		System.out.println("Enter second number:");
		int secondNumber = sc.nextInt();
		
		//exchange the numbers if first is greater than second, because we don`t know which is greater
		if(firstNumber > secondNumber) {
			firstNumber ^= secondNumber;
			secondNumber ^= firstNumber;
			firstNumber ^= secondNumber;
		}
		
		for (int i = 1; i <= firstNumber; i++) {
			for (int j = 1; j <= secondNumber; j++) {
				System.out.println(i + "*" + j + "=" + (i * j) + ";");
			}
		}
	}
}
