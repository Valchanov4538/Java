
public class Task12 {
	
	public static void main(String[] args) {
		
		for (int i = 100; i < 1000; i++) {
			int firstDigit = i / 100;
			int secondDigit = (i / 10) % 10;
			int thirdDigit = i % 10;
			
			if (firstDigit != secondDigit && secondDigit != thirdDigit && firstDigit != thirdDigit) {
				System.out.println(i);
			}
		}
	}
}
