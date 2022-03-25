import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int arrSize = sc.nextInt();
        int[] arr = new int[arrSize];

        System.out.println("Enter elements for the array:");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int currCounter = 1;
        int index = 0;
        int bestCounter = 1;

        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] == arr[i + 1]) {
                currCounter++;
            }
            else {
                currCounter = 1;
            }
            if (currCounter > bestCounter) {
                bestCounter = currCounter;
                index = i;
            }
        }
        for(int i = 0; i < bestCounter; i++) {
            if(i == bestCounter - 1) {
                System.out.println(arr[index]);
            }
            else {
                System.out.print(arr[index] + ", ");
            }
        }
    }
}
