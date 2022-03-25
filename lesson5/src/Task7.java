import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[6][6];
        int sumRow = 0;
        int sumOfAllRows = 0;
        int row = 0;
        int col = 0;

        // fill the matrix
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < matrix.length * matrix.length; i++) {
            if (col == matrix.length) {
                row++;
                col = 0;
            }
            matrix[row][col] = sc.nextInt();
            col++;
        }

        //calculate every row and finally all rows` sum
        row = 0;
        col = -1;
        for (int i = 0; i < matrix.length * matrix.length; i++) {
            col++;
            if ((row + col) % 2 == 0) {
                sumRow += matrix[row][col];
                System.out.print(matrix[row][col] + ", ");
            }

            if (col == matrix.length - 1) {
                row++;
                col = -1;
                System.out.println("the sum of row's elements is: " + sumRow);
                sumOfAllRows += sumRow;
                sumRow = 0;
            }
        }
        System.out.println("The sum of all elements: " + sumOfAllRows);
    }
}

//11
//        12
//        13
//        14
//        15
//        16
//        21
//        22
//        23
//        24
//        25
//        26
//        31
//        32
//        33
//        34
//        35
//        36
//        41
//        42
//        43
//        44
//        45
//        46
//        51
//        52
//        53
//        54
//        55
//        56
//        61
//        62
//        63
//        64
//        65
//        66
