import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the first array:");
        int arr1Size = sc.nextInt();
        int[] arr1 = new int[arr1Size];
        int[] arr2 = new int[arr1.length];

        System.out.println("Enter elements for the first array:");
        for(int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        arr2[0] = arr1[0];
        arr2[arr2.length - 1] = arr1[arr1.length - 1];

        for(int i = 1; i < arr1.length - 1; i++) {
            arr2[i] = arr1[i] + arr1[i - 1];
        }

        for(int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
