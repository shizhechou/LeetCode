package algorithm.ClimbingStairs.java;

import java.util.Scanner;

public class ClimbingStairs {

	public static void main(String arg[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the stair number:");
		int num = scanner.nextInt();
		int result = climbStairs(num);
		System.out.print("There are " + result + " ways to climb.");
	}

	public static int climbStairs(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		if (n == 2)
			return 2;

		int result = 0;
		int minone = 2;
		int mintwo = 1;
		for (int i = 2; i < n; i++) {
			result = mintwo + minone;
			mintwo = minone;
			minone = result;
		}
		return result;
	}
}
