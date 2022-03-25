import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the first array:");
        int arr1Size = sc.nextInt();
        int[] arr1 = new int[arr1Size];

        System.out.println("Enter the size of the second array:");
        int arr2Size = sc.nextInt();
        int[] arr2 = new int[arr2Size];

        if (arr1.length != arr2.length) {
            System.out.println("The arrays' lengths are not equal.");
        }
        else {
            System.out.println("Enter elements for the first array:");
            for(int i = 0; i < arr1.length; i++) {
                arr1[i] = sc.nextInt();
            }

            System.out.println("Enter elements for the second array:");
            for(int i = 0; i < arr2.length; i++) {
                arr2[i] = sc.nextInt();
            }

            boolean areWithEqualValues = true;
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    areWithEqualValues = false;
                    break;
                }
            }
            if (areWithEqualValues) {
                System.out.println("The arrays are with equal lengths and equal cells' values");
            }
            else  {
                System.out.println("The arrays are with equal lengths and not equal cells' values");
            }
        }
    }
}
