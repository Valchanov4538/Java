import java.util.Scanner;

public class Task21 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int number = sc.nextInt();
		int counter = 1;
		
		while(counter <= 10) {
			number++;
			if(number % 2 == 0 || number % 3 == 0 || number % 5 == 0) {
				if(counter == 1) {
					System.out.println(counter + ":" + number + "; ");
				} else {
					System.out.println(counter + ":" + number + ", ");
				}
				counter++;
			}
		}
	}
}
