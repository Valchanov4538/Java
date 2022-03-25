import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];
        double sum = 0;

        System.out.println("Enter elements for the array:");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        double avgValue = sum / arr.length;
        double[] subtractions = new double[arr.length];

        for (int i = 0; i < subtractions.length; i++) {
            double sub = arr[i] - avgValue;
            double absSub = sub < 0 ? 0 - sub : sub;
            subtractions[i] = absSub;
        }

        double minSub = subtractions[0];
        int minIndex = 0;
        for(int i = 1; i < subtractions.length; i++) {
            if (minSub > subtractions[i]) {
                minSub = subtractions[i];
                minIndex = i;
            }
        }
        System.out.println("average value " + avgValue + ", nearest value " + arr[minIndex]);
    }
}
