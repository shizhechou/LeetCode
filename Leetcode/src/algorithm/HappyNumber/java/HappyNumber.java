package algorithm.HappyNumber.java;

import java.util.HashSet;
import java.util.Scanner;

public class HappyNumber {

	public static void main(String arg[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the positive number:");
		int num = scanner.nextInt();
		boolean result = false;

		if (num > 0) {
			result = isHappy(num);
		} else {
			System.out.println("The number " + num + " is negative number.");
		}
		System.out.println("The number " + num + (result ? " is" : " isn't") + " happy number.");
	}

	public static boolean isHappy(int n) {
		if (n <= 0)
			return false;
		HashSet<Integer> set = new HashSet<Integer>();
		while (n != 1 && !set.contains(n)) {
			set.add(n);
			int m = n;
			n = 0;
			while (m != 0) {
				n += (m % 10) * (m % 10);
				m = m / 10;
			}
		}
		return n == 1;
	}
}
