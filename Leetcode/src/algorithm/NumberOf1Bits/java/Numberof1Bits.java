package algorithm.NumberOf1Bits.java;

import java.util.Scanner;

public class Numberof1Bits {
	public static void main(String arg[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number:");
		int num = scanner.nextInt();
		int result = hammingWeight(num);
		System.out.print("Number had " + result + " '1' bit.");
	}

	public static int hammingWeight(int n) {
		int count = 0;
		while (n != 0) {
			n = n & (n - 1);
			count++;
		}
		return count;
	}
}
