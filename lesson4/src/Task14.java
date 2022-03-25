import java.util.Scanner;

public class Task14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of arr:");
        int arr1Size = sc.nextInt();
        double[] arr1 = new double[arr1Size];
        int counterDoubleNums = 0;
        int indecesOfArr2 = -1;

        System.out.println("Enter elements of arr1:");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextDouble();
            if(arr1[i] >= -2.99 && arr1[i] < 2.99) {
                counterDoubleNums++;
            }
        }

        double[] arr2 = new double[counterDoubleNums];
        for(int i = 0; i < arr1.length; i++) {
            if(arr1[i] >= -2.99 && arr1[i] < 2.99) {
                indecesOfArr2++;
                arr2[indecesOfArr2] = arr1[i];
            }
        }

        for(int i = 0; i < arr2.length; i++) {
            if(i == arr2.length - 1) {
                System.out.print(arr2[i]);
            }
            else {
                System.out.print(arr2[i] + "; ");
            }
        }
    }
}
