package Variablesj;

import java.util.Scanner;

public class Task10 {
	
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		int watertankVolume = sc.nextInt();
		
		int bucket1 = 2;
		int bucket2 = 3;
		
		int totalBucketLiters = bucket1 + bucket2;
		int fillTimesPerBucket = watertankVolume / totalBucketLiters;
		int extraLiters = watertankVolume % totalBucketLiters;
		
		System.out.println(fillTimesPerBucket + " times of " + bucket1 + " liters,");
		System.out.println(fillTimesPerBucket + " times of " + bucket2 + " liters");
		System.out.println("extra bucket of " + extraLiters + " liters");
	}
}