import java.util.Scanner;

public class Task17 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int arrLength = sc.nextInt();
        int[] arr = new int[arrLength];

        System.out.println("Enter the elements:");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        boolean isZigZagUpwards = true;
        for(int i = 0; i < arr.length - 2; i++) {
            if (!((arr[i] < arr[i + 1] && arr[i + 1] > arr[i + 2]) 
            		|| (arr[i] > arr[i + 1] && arr[i + 1] < arr[i + 2]))) {
                isZigZagUpwards = false;
                break;
            }
        }
        if (isZigZagUpwards) {
            System.out.println("The sequence is zigzagged upwards.");
        }
        else {
            System.out.println("The sequence is not zigzagged upwards.");
        }
    }
}
