package algorithm.PowerOfTwo.java;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the positive number:");
		int num = scanner.nextInt();
		boolean result = isPowerOfTwo(num);
		System.out.println("The number " + num + (result ? " is" : " isn't") + " power of two.");

	}

	public static boolean isPowerOfTwo(int n) {
		return n > 0 && (n & (n - 1)) == 0;
	}

}
