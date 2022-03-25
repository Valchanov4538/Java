import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of the rows:");
        int rows = sc.nextInt();

        System.out.println("Enter number of the cols:");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        int sumOfAllElements = 0;

        System.out.println("Enter elements for the matrix:");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[row][col] = sc.nextInt();
                sumOfAllElements += matrix[row][col];
            }
        }

        System.out.println("The sum of the all elements of the matrix is " + sumOfAllElements);

        int numOfAllCells = matrix.length * matrix[0].length;
        double average = (double)(sumOfAllElements) / numOfAllCells;
        average = (int)(average * 100 + 0.5) / 100.0; // rounding to 2 decimals without Math.Round

        System.out.println("The average of the all elements of the matrix is " + average);
    }
}
