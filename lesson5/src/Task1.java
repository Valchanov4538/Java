import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[5][6];

        System.out.println("Enter elements for the matrix:");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[row][col] = sc.nextInt();
            }
        }

        int minValue = matrix[0][0];
        int maxValue = matrix[0][0];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 1; col < matrix[0].length; col++) {
                if (minValue > matrix[row][col]) {
                    minValue = matrix[row][col];
                }
                if (maxValue < matrix[row][col]) {
                    maxValue = matrix[row][col];
                }
            }
        }

        System.out.println("the smallest " + minValue + ";");
        System.out.println("the biggest " + maxValue);
    }
}
