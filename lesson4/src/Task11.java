import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];
        int counter = 0;

        System.out.println("Enter elements for the first array:");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] % 5 == 0 && arr[i] > 5) {
                counter++;
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println("- " + counter + "numbers");
    }
}
