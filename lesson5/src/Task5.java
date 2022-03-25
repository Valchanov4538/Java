import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[3][3];

        int rowSum = 0;
        int colSum = 0;
        int bestRowSum = 0;
        int bestColSum = 0;

        System.out.println("Enter the elements of the matrix:");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = sc.nextInt();
                rowSum += matrix[row][col];
            }
            if (row == 0) {
                bestRowSum = rowSum;
            }
            if (rowSum > bestRowSum) {
                bestRowSum = rowSum;
            }
            rowSum = 0;
        }

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                colSum += matrix[col][row];
            }
            if (row == 0) {
                bestColSum = colSum;
            }
            if (colSum > bestColSum) {
                bestColSum = colSum;
            }
            colSum = 0;
        }
        System.out.println("best row's sum " + bestRowSum);
        System.out.println("best col's sum " + bestColSum);
        System.out.println(bestRowSum > colSum ? "Max row's sum is > max col's sum" : "Max col's sum is > max row's sum");
    }
}
