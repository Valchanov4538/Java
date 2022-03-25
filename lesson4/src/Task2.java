import java.util.Scanner;

public class Task2 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int arr1Size = sc.nextInt();

		// The array is with odd elements
		if(arr1Size % 2 == 1) {
			int[] arr1 = new int[arr1Size];
			int[] arr2 = new int[arr1Size];

			System.out.println("Enter value for each cell of array: ");
			for(int i = 0; i < arr1.length; i++) {
				arr1[i] = sc.nextInt();
			}

			for(int i = 0; i < arr2.length / 2; i++) {
				arr2[i] = arr1[i];
			}

			for (int i = arr1.length - 1; i >= arr1.length / 2; i--) {
				arr2[arr2.length - i + 1] = arr1[i];
			}

			for(int i = 0; i < arr2.length; i++) {
				System.out.println(arr2[i]);
			}
		}
	}
}
