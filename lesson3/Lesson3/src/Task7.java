import java.util.Scanner;
public class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int print = 3;
		for(int i = 1;i<=n;i++) {
			System.out.println(print);
			print = print+3;
		}
	}

}
