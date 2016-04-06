package algorithm.AddDigits.java;

import java.util.Scanner;

public class AddDigits {

	public void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("Enter the positive number:");
			int num = scanner.nextInt();
			int result = addDigits(num);
			System.out.println("Result is " + result + ".");
		} finally {
			scanner.close();
		}

	}

	private int addDigits(int num) {
		return (num - 1) % 9 + 1;
		// return num > 9 ? (num % 9 == 0 ? 9 : num % 9) : num;
	}

}
