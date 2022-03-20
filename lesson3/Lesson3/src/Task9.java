import java.util.Scanner;

public class Task9 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter A:");
		int firstNum = sc.nextInt();
		
		System.out.println("Enter B:");
		int secondNum = sc.nextInt();
		int sum = 0;
		
		
		if(firstNum > secondNum) {
			firstNum ^= secondNum;
			secondNum ^= firstNum;
			firstNum ^= secondNum;
		}


		for (int i = firstNum; i <= secondNum; i++) {
			sum += (i * i);
			if(i % 3 == 0) {
				if (sum > 200) {
					System.out.print("skip 3");
					break;
				} else {
					System.out.print("skip 3,");
				}
			} else {
				if(sum > 200) {
					System.out.print(i * i);
					break;
				} else {
					System.out.print(i * i + ",");
				}
			}
		}
		System.out.println();
	}
}
