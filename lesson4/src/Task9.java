import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the first array:");
        int arrSize = sc.nextInt();
        int[] arr = new int[arrSize];

        System.out.println("Enter elements for the first array:");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

//        Reverse the array with additional helper array
//        int[] helperArray = new int[arr.length];
//        for(int i = 0; i < helperArray.length; i++) {
//            helperArray[i] = arr[arr.length - i - 1];
//            if(i == helperArray.length - 1) {
//                System.out.println(helperArray[i]);
//            }
//            else {
//                System.out.print(helperArray[i] + ", ");
//            }
//        }

//     Reverse the array without additional helper array
        for (int i = 0; i < arr.length / 2; i++) {
            arr[i] ^= arr[arr.length - i - 1];
            arr[arr.length - i - 1] ^= arr[i];
            arr[i] ^= arr[arr.length - i - 1];
        }
        for(int i = 0; i < arr.length; i++) {
            if(i == arr.length - 1) {
                System.out.println(arr[i]);
            }
            else {
                System.out.print(arr[i] + ", ");
            }
        }
    }
}
