import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int arrSize = sc.nextInt();
        int[] arr = new int[arrSize];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        boolean isMirrored = true;
        for (int i = 0; i < arr.length / 2; i++) {
            if(arr[i] != arr[arr.length - i - 1]) {
                isMirrored = false;
                break;
            }
        }

        if(isMirrored) {
            System.out.println("The array is mirrored.");
        }
        else  {
            System.out.println("The array is not mirrored.");
        }
    }
}
