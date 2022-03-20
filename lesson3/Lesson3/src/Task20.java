
public class Task20 {
	
	public static void main(String[] args) {
		
		int counter = 1;
		
		for (int row = 1; row <= 10; row++) {
			for (int col = 1; col <= 10; col++) {
				if(counter == 10) {
					counter = 0;
				}
				System.out.print(counter + " ");
				counter++;
			}
			counter = row + 1;
			System.out.println();
		}
	}
}
