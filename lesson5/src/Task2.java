import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows or cols:");
        int numberOfRows = sc.nextInt();

        int[][] matrix = new int[numberOfRows][numberOfRows];

        System.out.println("Enter elements for the matrix:");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[row][col] = sc.nextInt();
            }
        }

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                if (row == col) {
                    if (col == matrix[0].length - 1) {
                        System.out.print(matrix[row][col]);
                    }
                    else {
                        System.out.print(matrix[row][col] + " ");
                    }
                }
            }
        }
        System.out.println();

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                if (col == matrix.length - row - 1) {
                    if (col == 0) {
                        System.out.print(matrix[row][col]);
                    }
                    else {
                        System.out.print(matrix[row][col] + " ");
                    }
                }
            }
        }
        System.out.println();
    }
}
