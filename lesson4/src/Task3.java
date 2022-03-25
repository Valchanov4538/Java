import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = sc.nextInt();

        int[] arr = new int[10];
        arr[0] = number;
        arr[1] = number;
        for(int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
