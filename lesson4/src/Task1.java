import java.util.Scanner;

public class Task1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int arrSize = sc.nextInt();
		int[] arr = new int[arrSize];

		System.out.println("Enter value for each cell: ");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int smallestNumber = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(smallestNumber > arr[i] && smallestNumber % 3 == 0) {
				smallestNumber = arr[i];
			}
		}
		System.out.println("The smallest number divide by 3 is " + smallestNumber);
	}
}
