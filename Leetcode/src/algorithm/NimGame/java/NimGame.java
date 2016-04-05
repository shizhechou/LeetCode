package algorithm.NimGame.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NimGame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("Enter the number:");
			int num = scanner.nextInt();
			Boolean result = canWinNim(num);
			System.out.println("Result is " + result + ".");
		} catch (InputMismatchException ex) {
			scanner.nextLine();
		} finally {
			scanner.close();
		}
	}

	public static boolean canWinNim(int n) {
		return !(n % 4 == 0);
	}

}
