import java.util.Scanner;

public class Task15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the array:");
        int sizeOfArr = sc.nextInt();
        double[] arr = new double[sizeOfArr];

        System.out.println("Enter the elements of the arr:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextDouble();
        }

        boolean isSorted = true;
        while (isSorted) {

            isSorted = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    double temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    isSorted = true;
                }
            }

            System.out.print(arr[2] + " " + arr[1] + " " + arr[0]);
            System.out.println();
        }
    }
}
