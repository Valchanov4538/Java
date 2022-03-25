import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];

        System.out.println("Enter elements for the first array:");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        //exchange first and second value of the array by third variable
        int tempVar = arr[0];
        arr[0] = arr[1];
        arr[1] = tempVar;

        //exchange third and fourth value of the array by sum
        arr[2] = arr[2] + arr[3];
        arr[3] = arr[2] - arr[3];
        arr[2] = arr[2] - arr[3];

        //exchange fifth and sixth value of the array by multiplication
        arr[4] = arr[4] * arr[5];
        arr[5] = arr[4] / arr[5];
        arr[4] = arr[4] / arr[5];

        for(int i = 0; i < arr.length; i++) {
            if(i == arr.length - 1) {
                System.out.println(arr[i]);
            }
            else {
                System.out.println(arr[i] + ",");
            }
        }
    }
}
