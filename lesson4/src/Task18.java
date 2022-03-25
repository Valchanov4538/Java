import java.util.Scanner;

public class Task18 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the two arrays:");
        int arraysLength = sc.nextInt();

        int[] arr1 = new int[arraysLength];
        int[] arr2 = new int[arraysLength];
        int[] arr3 = new int[arraysLength];

        System.out.println("Enter the elements of the first array:");
        for(int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the elements of the second array:");
        for(int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        for(int i = 0; i < arr1.length; i++) {
            if(i == arr1.length - 1) {
                System.out.println(arr1[i]);
            }
            else {
                System.out.print(arr1[i] + ",");
            }
        }

        for(int i = 0; i < arr2.length; i++) {
            if(i == arr2.length - 1) {
                System.out.println(arr2[i]);
            }
            else {
                System.out.print(arr2[i] + ",");
            }
        }

        for(int i = 0; i < arr1.length; i++) {
            if (arr1[i] > arr2[i]) {
                arr3[i] = arr1[i];
                if(i == arr1.length - 1) {
                    System.out.println(arr3[i]);
                }
                else {
                    System.out.print(arr3[i] + ",");
                }
            }
            else {
                arr3[i] = arr2[i];
                if(i == arr2.length - 1) {
                    System.out.println(arr3[i]);
                }
                else {
                    System.out.print(arr3[i] + ",");
                }
            }
        }
    }
}
