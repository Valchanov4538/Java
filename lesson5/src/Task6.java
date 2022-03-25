import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[6][6];
        System.out.println("Enter the elements of the matrix:");
        int currentRowSum = 0;
        int totalRowsSum = 0;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = sc.nextInt();
            }
        }

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (row % 2 != 0) {
                    if (col == matrix[row].length - 1) {
                        System.out.print(matrix[row][col]);
                    }
                    else {
                        System.out.print(matrix[row][col] + ",");
                    }
                    currentRowSum += matrix[row][col];
                    if (col == matrix[row].length - 1) {
                        System.out.println(" sum " + currentRowSum);
                        totalRowsSum += currentRowSum;
                    }
                }
            }
            currentRowSum = 0;
        }
        System.out.println("Sum of the elements " + totalRowsSum);
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
