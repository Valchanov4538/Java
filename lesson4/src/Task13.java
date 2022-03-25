import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number in decimal numeric system: ");
        int number = sc.nextInt();

        int remainder;
        int sizeOfBinArr = 0;
        int indexOfBinArr = 0;
        int newNumber = number;

        while(newNumber > 0){
            newNumber = newNumber/2;
            sizeOfBinArr++;
        }

        int[] arrWithBinNums = new int[sizeOfBinArr];

        while (number > 0){
            remainder = number % 2;
            number = number/2;
            arrWithBinNums[indexOfBinArr] = remainder;
            indexOfBinArr++;
        }

        System.out.println("Decimal number to binary number:");

        for (int i = arrWithBinNums.length - 1; i >= 0; i--) {
            System.out.print(arrWithBinNums[i]);
        }

        System.out.println();
    }
}
