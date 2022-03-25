import java.util.Scanner;

public class Task16 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] arr1 = new double[10];
        double[] arr2 = new double[10];

        System.out.println("Enter the elements of the array");
        for(int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextDouble();
        }


        for(int i = 0; i < arr1.length; i++) {
            if(arr1[i] < -0.231) {
                arr2[i] = ((i + 1) * (i + 1)) + 41.25;
                arr2[i] = (int)(arr2[i] * 100 + 0.5) / 100.0; // rounding to 2 decimals without Math.Round
            }
            else  {
                arr2[i] = (i + 1) * arr1[i];
                arr2[i] = (int)(arr2[i] * 100 + 0.5) / 100.0; // rounding to 2 decimals without Math.Round
            }
        }

        for (int i = 0; i < arr1.length; i++) {
            if(i == arr1.length - 1) {
                System.out.println(arr1[i]);
            }
            else  {
                System.out.print(arr1[i] + ", ");
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            if(i == arr2.length - 1) {
                System.out.println(arr2[i]);
            }
            else  {
                System.out.print(arr2[i] + ", ");
            }
        }
    }
}
