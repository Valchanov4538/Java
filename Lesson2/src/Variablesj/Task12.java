package Variablesj;
import java.util.Scanner;

public class Task12 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();
		int month = sc.nextInt();
		int year = sc.nextInt();
		
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) {
			if (day == 31) {
				day = 1;
				month += 1;
				System.out.println(day + "," + month + "," + year);
			} else if (day > 0 && day < 31) {
				day += 1;
				System.out.println(day + "," + month + "," + year);
			}
		} else if (month == 12) {
			if (day == 31) {
				day = 1;
				month = 1;
				year += 1;
				System.out.println(day + "," + month + "," + year);
			} else if (day > 0 && day < 31) {
				day += 1;
				System.out.println(day + "," + month + "," + year);
			}
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			if (day == 30) {
				day = 1;
				month += 1;
				System.out.println(day + "," + month + "," + year);
			} else if (day > 0 && day < 30) {
				day += 1;
				System.out.println(day + "," + month + "," + year);
			}
		} else if (month == 2) {
			if (year % 4 == 0 && year % 100 != 0) {
				if (day == 29) {
					day = 1;
					month += 1;
					System.out.println(day + "," + month + "," + year);
				} else if (day > 0 && day < 29){
					day += 1;
					System.out.println(day + "," + month + "," + year);
				}
			} else {
				if (day == 28) {
					day = 1;
					month += 1;
					System.out.println(day + "," + month + "," + year);
				} else if (day > 0 && day < 28) {
					day += 1;
					System.out.println(day + "," + month + "," + year);
				}
			}
		}
	}
}
